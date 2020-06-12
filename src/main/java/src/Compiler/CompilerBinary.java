package src.main.java.src.Compiler;

import java.io.FileNotFoundException;

import src.main.java.src.Archives.ReadArchieve;
import src.main.java.src.Archives.SaveArchieve;
import src.main.java.src.Dictionary.InstructionsTypes;
import src.main.java.src.Dictionary.Register;
import src.main.java.src.Memory.MainMemory;

public class CompilerBinary {

	public void TransformBinary(String file_read, String file_save) throws FileNotFoundException {
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

		Register.SetS0("3");
		Register.SetS1("1");
		Register.SetS2("2");
		boolean instr_access_memory = false;

		String[] regisFinal;
		String InstructionsType = "";
		int contRegisters = 0;

		System.out.println("Memory test: " + MainMemory.getMemorySlot(1024).getAddress());
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
							System.out.println("antes split " + instrucao[j]);
							instrucao[j] = instrucao[j].replace("(", " ");
							buffer = instrucao[j].split(" ", -1);
							System.out.println("Parte 1:" + buffer[0]);
							buffer[0] = buffer[0].replace(" ", "");
							System.out.println("Parte 2 " + buffer[1]);
							buffer[1] = buffer[1].replace(")", "");

							System.out.println("lw register: " + buffer[1]);
							System.out.println("Int: " + buffer[0]);

							regisGeneric[contRegisters] = buffer[1];
							int endereco = Integer.parseInt(buffer[0])
									+ Integer.parseInt(Register.GetRegisters(buffer[1]));
							binario.setLineAddress(endereco);
							binario.setImediato(buffer[0]);
							binario.setAddress(Integer.toHexString(endereco));
							instr_access_memory = false;
						} else {
							System.out.println("regis: " + instrucao[j]);
							System.out.println("numero regis: " + contRegisters);
							regisGeneric[contRegisters] = instrucao[j];
						}
						if (contRegisters <= 2) {
							contRegisters++;
						}
					} else if (InstructionsType == "I") {
						System.err.println("teste");
						binario.setImediato(instrucao[j]);
					} else if (InstructionsType == "J") {
						binario.setAddress(instrucao[j]);
					}

				}

				if (j == instrucao.length - 1) {
					System.out.println("ContRegisters : " + contRegisters);

					regisFinal = new String[contRegisters];

					for (int k = 0; k < contRegisters; k++) {
						regisFinal[k] = regisGeneric[k];
					}

					binario.setRegisters(regisFinal);
					codeSave = binario.instruction_fetch();
					System.out.println("Instruction fetch function: " + codeSave);
					contRegisters = 0;
				}
				save.write(codeSave);
				codeSave = "";
			}
		}

		register.registerSaveArchive();
		MainMemory.MainMemorySave();
		save.ArchiveClose();
	}

}
