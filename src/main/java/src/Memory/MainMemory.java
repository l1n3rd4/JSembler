package src.main.java.src.Memory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;
import java.util.Collections;
import java.util.List;

import src.main.java.src.Archives.ReadArchieve;
import src.main.java.src.Archives.SaveArchieve;

public class MainMemory{
	private static final int MEMORY_SIZE = 4096;
	private String[] MemorySlots;
	static MemoryLine[] memory_line;
	static ReadArchieve read;
	static SaveArchieve save;

	public MainMemory() throws FileNotFoundException{
		read = new ReadArchieve("memory.out");
		save = new SaveArchieve("memory.out");
		MemorySlots = new String[MEMORY_SIZE];
		MainMemoryInit();
	}
	
	
	public static void startMemory() throws FileNotFoundException{
		MemoryLine aux;
		memory_line = new MemoryLine[MEMORY_SIZE];
		String[] buffer = read.getFileInArrayFormat();
		String[] pieces;

		System.out.println("buffer: " + buffer + "\nread: " + read);

		for(int i = 0; i < MEMORY_SIZE; i++){
//			System.out.println(buffer[i]);
			pieces = buffer[i].split(" ", -1);
			
			System.out.println("Endereco: " + pieces[0] + "\nConteudo: " + pieces[1]);
			aux = new MemoryLine(pieces[0], pieces[1]);
			memory_line[i] = aux;
		} 
	}

	public static void MainMemoryInit(){
		int linha1 = 0;
		String linha = "";
		
		for(int i = 0; i < MEMORY_SIZE; i++){
			if(i <= 15){
				linha = "0x0" + Integer.toHexString(linha1) + " " + "0x" + "00000000";
			} else {
				linha = "0x" + Integer.toHexString(linha1)  + " " + "0x" + "00000000"; 
			}
		//	System.out.println(linha);

		save.write(linha);
			linha1 += 16;
		}
		
		save.ArchiveClose();
	}

	public static void MainMemorySave(){
		String linha = "";
		save = new SaveArchieve("memory.out");

		for(int i = 0; i < MEMORY_SIZE; i++){
			linha = memory_line[i].getAddress() + " " + memory_line[i].getContent();
			save.write(linha);
			System.out.println(linha);
		}

		save.ArchiveClose();
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