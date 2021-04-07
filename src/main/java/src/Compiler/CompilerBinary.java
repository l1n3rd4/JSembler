/*
 * MIT License
 *
 * Copyright(c) 2020 Leonardo Henrique Guimaraes <leonardo.guimaraeslhg@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package src.main.java.src.Compiler;

import java.io.FileNotFoundException;
import java.io.IOException;
import src.main.java.src.Archives.ReadArchieve;
import src.main.java.src.Archives.SaveArchieve;
import src.main.java.src.Dictionary.InstructionsTypes;
import src.main.java.src.Dictionary.Register;
import src.main.java.src.Memory.MainMemory;

public class CompilerBinary {

	public void TransformBinary(String file_read, String file_save) throws FileNotFoundException, IOException {
		MainMemory memory = new MainMemory();
		MainMemory.startMemory();

		Register register = new Register();
		ReadArchieve read = new ReadArchieve(file_read);
		SaveArchieve save = new SaveArchieve(file_save);

		Binario binario = new Binario();
		String[] code = read.getFileInArrayFormat();

		String[] buffer;
		String codeSave = "";
		String[] regisGeneric = new String[3];
		boolean instr_access_memory = false;

		String[] regisFinal;
		String InstructionsType = "";
		int contRegisters = 0;

		for (int i = 0; i < read.getArrayLength(); i++) {
			binario.restartValues();
			System.out.println("Linha --> " + code[i]);

			String[] instrucao = code[i].split(" ", -1);

			for (int j = 0; j < instrucao.length; j++) {
				instrucao[j] = instrucao[j].replace(" ", "");
				instrucao[j] = instrucao[j].replace(",", "");

				if (j == 0) {
					binario.setOpcode(instrucao[j]);
					binario.setName_instr(instrucao[j]);
					binario.setFunct(instrucao[j]);

					if (instrucao[j].equals("lw") || instrucao[j].equals("sw")) {
						instr_access_memory = true;
					}

					InstructionsType = InstructionsTypes.getType(instrucao[j]);
				} else if (j >= 1) {

					if (Register.BinaryRegisters(instrucao[j]) != null || instr_access_memory == true) {
						if (instr_access_memory && j == 2) {
							instrucao[j] = instrucao[j].replace("(", " ");
							buffer = instrucao[j].split(" ", -1);
							buffer[0] = buffer[0].replace(" ", "");
							buffer[1] = buffer[1].replace(")", "");

							regisGeneric[contRegisters] = buffer[1];
							int endereco = Integer.parseInt(buffer[0])
									+ Integer.parseInt(Register.GetRegisters(buffer[1]));

							binario.setLineAddress(endereco);
							binario.setImediato(buffer[0]);
							instr_access_memory = false;
						} else {
							regisGeneric[contRegisters] = instrucao[j];
						}

						if (contRegisters <= 2) {
							contRegisters++;
						}

					} else if (InstructionsType == "I") {
						binario.setImediato(instrucao[j]);
					} else if (InstructionsType == "J") {
						binario.setAddress(instrucao[j]);
					} else {
						binario.setShamt(instrucao[j]);
					}
				}

				if (j == instrucao.length - 1) {

					regisFinal = new String[contRegisters];

					for (int k = 0; k < contRegisters; k++) {
						regisFinal[k] = regisGeneric[k];
					}

					binario.setRegisters(regisFinal);
					codeSave = binario.instruction_fetch();

					contRegisters = 0;
				}
				save.write(codeSave);
				codeSave = "";
			}
		}

		register.registerSaveArchive();
		MainMemory.MainMemorySave();
		save.ArchiveClose();
		read.closeFile();
	}

}
