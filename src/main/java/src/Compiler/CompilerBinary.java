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
	//	memory.MainMemoryInit();
		memory.startMemory();
		
		ReadArchieve read = new ReadArchieve(file_read);
		SaveArchieve save = new SaveArchieve(file_save);  		  

		Binario binario = new Binario();
		String[] code = read.getFileInArrayFormat();
		
		String codeSave = "";
		String[] regisGeneric = new String[3];
		
		String[] regisFinal;
		String InstructionsType = "";
		int contRegisters = 0;

		for (int i = 0; i < read.getArrayLength(); i++) {
			System.out.println("Linha --> " + code[i]);
			
			String[] instrucao = code[i].split(" ", -1);
				
	      for(int j = 0; j < instrucao.length; j++){
    			  instrucao[j] = instrucao[j].replace(")", "");
		    	  instrucao[j] = instrucao[j].replace("(", "");
			  instrucao[j] = instrucao[j].replace(" ", "");
		          instrucao[j] = instrucao[j].replace(",", "");
			      
            if(j == 0){
                binario.setOpcode(instrucao[j]);
                System.out.println("Instrucao: " + instrucao[j]);
                System.out.println("Opcode binario: " + binario.getOpcode());
                
                binario.setFunct(instrucao[j]);
                InstructionsType = InstructionsTypes.getType(instrucao[j]);
            } else if (j >= 1){
              System.out.println("Instruction type: " + InstructionsType);
              
              System.out.println("J : " + j);
              System.out.println("Instrução main: " + instrucao[j]);
              
              if(Register.BinaryRegisters(instrucao[j]) != null){
            	  System.out.println("regis: " + instrucao[j]);
                  regisGeneric[contRegisters] = instrucao[j];
                  if(contRegisters <= 2) {
                	  contRegisters++;  
                  }
                  
              } else if(InstructionsType == "I"){
                  binario.setImediato(instrucao[j]);
              } else if(InstructionsType == "J"){
                  binario.setAddress(instrucao[j]);
              }
            }
            
            if(j == instrucao.length - 1) {
            	System.out.println("ContRegisters : " + contRegisters);
            	
            	if(contRegisters == 2 && InstructionsType == "R") {
            		String reg2 = regisGeneric[1];
            		regisGeneric[1] = regisGeneric[0];
            		regisGeneric[2] = reg2;
            		
            		contRegisters++;	
            	}
            	
            	if(j == 1 && InstructionsType == "R") {
            		regisGeneric[1] = "0";
            		regisGeneric[2] = "0";
            		contRegisters += 2;
            	}
            	
            	regisFinal = new String[contRegisters];
            	
            	for(int k = 0; k < contRegisters; k++) {
            		regisFinal[k] = regisGeneric[k];
            	}
            	
            	binario.setRegisters(regisFinal);

              if(InstructionsType == "R"){
                  codeSave = binario.Instruction_R_Type();
                  System.out.println("binario tipo R: " + codeSave);
              	} else if (InstructionsType == "J"){
                	codeSave = binario.Instruction_J_Type(instrucao[j]);
                	System.out.println("binario tipo J: " + codeSave);
              	} else if(InstructionsType == "I"){
              		System.out.println("binario tipo I: " + codeSave);
                	codeSave = binario.Instruction_I_Type(instrucao[j]);
                } else {
                  System.out.println("InstructionsType not found!");
                }
              
              contRegisters = 0;
            }
            save.write(codeSave);
            codeSave = "";

	    }	
       }
	save.ArchiveClose();
    }
		
}
