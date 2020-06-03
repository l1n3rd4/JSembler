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
	
	public MainMemory() throws FileNotFoundException{
		read = new ReadArchieve("../memory.out");
		MemorySlots = new String[MEMORY_SIZE];
	}
	
	
	public void startMemory() throws FileNotFoundException{
		MemoryLine aux;
		List<MemoryLine> memory_line = new ArrayList<MemoryLine>();
		String[] buffer = read.getFileInArrayFormat();
		String[] pieces;

		for(int i = 0; i < MEMORY_SIZE - 1; i++){
			pieces = buffer[i].split(" ", -1);

			aux = new MemoryLine(pieces[0], pieces[1]);
			memory_line.add(aux);

		}
	}
	
	/*
	public void setMemorySlot(int NumberSlot, String data){

	}

	public void getMemorySlot(int NumberSlot){
		
	}
	*/
}
