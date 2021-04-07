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

package src.main.java.src.Memory;

import java.io.FileNotFoundException;
import java.io.IOException;

import src.main.java.src.Archives.ReadArchieve;
import src.main.java.src.Archives.SaveArchieve;

public class MainMemory{
	private static final int MEMORY_SIZE = 4096;
	static MemoryLine[] memory_line;
	
	static ReadArchieve read;
	static SaveArchieve save;

	public MainMemory() throws FileNotFoundException, IOException {
		read = new ReadArchieve("memory.out");
		save = new SaveArchieve("memory.out");
		MainMemoryInit();
	}
	
	public static void startMemory() throws FileNotFoundException{
		MemoryLine aux;
		memory_line = new MemoryLine[MEMORY_SIZE];

		String[] buffer = read.getFileInArrayFormat();
		String[] pieces;

		for(int i = 0; i < MEMORY_SIZE; i++){
			pieces = buffer[i].split(" ", -1);
			aux = new MemoryLine(pieces[0], pieces[1]);

			memory_line[i] = aux;
		} 
	}

	public static void MainMemoryInit() throws FileNotFoundException, IOException{
		try {
			int linha1 = 0;
			String linha = "";

			for (int i = 0; i < MEMORY_SIZE; i++) {
				if (i <= 15) {
					linha = "0x0" + Integer.toHexString(linha1) + " " + "0x" + "00000000";
				} else {
					linha = "0x" + Integer.toHexString(linha1) + " " + "0x" + "00000000";
				}

				save.write(linha);
				linha1 += 16;
			}

			save.ArchiveClose();
		} catch (FileNotFoundException e){
			throw e;
		} catch (IOException e){
			throw e;
		}
	}

	public static void MainMemorySave() throws IOException, FileNotFoundException {
		try {
			String linha = "";
			save = new SaveArchieve("memory.out");

			for (int i = 0; i < MEMORY_SIZE; i++) {
				linha = memory_line[i].getAddress() + " " + memory_line[i].getContent();
				save.write(linha);
			}
			save.ArchiveClose();

		}catch (FileNotFoundException e){
			throw e;
		} catch (IOException e){
			throw e;
		}
	}

	public static void setMemorySlot(int NumberSlot, String data){
		memory_line[indexMemoryArray(NumberSlot)].setContent(data);		
	}	
	
	public static MemoryLine getMemorySlot(int NumberDecimal){
		return memory_line[indexMemoryArray(NumberDecimal)];
	}

	public static int indexMemoryArray(int MemoryAddress){
		return (MemoryAddress/16);
	}
}
