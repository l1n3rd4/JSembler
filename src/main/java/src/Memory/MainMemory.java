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
	ReadArchieve read;
	SaveArchieve save;

	public MainMemory() throws FileNotFoundException{
		read = new ReadArchieve("memory.out");
		save = new SaveArchieve("memory.out");
		MemorySlots = new String[MEMORY_SIZE];
		startMemory();
	}
	
	
	public void startMemory() throws FileNotFoundException{
		MemoryLine aux;
		List<MemoryLine> memory_line = new ArrayList<MemoryLine>();
		String[] buffer = read.getFileInArrayFormat();
		String[] pieces;

		for(int i = 0; i < MEMORY_SIZE; i++){
			pieces = buffer[i].split(" ", -1);
			
			System.out.println("Endereco: " + pieces[0] + "\nConteudo: " + pieces[1]);
			aux = new MemoryLine(pieces[0], pieces[1]);
			memory_line.add(aux);

		}
	}
/*
	public void populate(){
		int linha1 = 0;
		String linha = "";
		
		for(int i = 0; i < MEMORY_SIZE; i++){
			if(i <= 15){
				linha = "0x0" + Integer.toHexString(linha1) + " " + "0x" + "00000000";
			} else {
				linha = "0x" + Integer.toHexString(linha1)  + " " + "0x" + "00000000"; 
			}
			System.out.println(linha);

		save.write(linha);
			linha1 += 16;
		}
		
		save.ArchiveClose();
		while(true);
	}
	*/

	/*
	public void setMemorySlot(int NumberSlot, String data){

	}

	public void getMemorySlot(int NumberSlot){
		
	}
	*/
}
