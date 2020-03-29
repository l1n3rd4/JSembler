package Compiler;
import java.io.FileNotFoundException;

import Archives.ReadArchieve;
import Archives.SaveArchieve;

public class CompilerBinary {

	public void TransformBinary() throws FileNotFoundException {
		ReadArchieve read = new ReadArchieve("/home/savio-pires/Documentos/faculdade/JSembler/type-i.in");
		SaveArchieve save = new SaveArchieve("/home/savio-pires/Documentos/faculdade/JSembler/type-i.out");
		String[] code = read.getFileInArrayFormat();
		String codeSave = "";
		
		for(int i=0; i < read.getArrayLength();i++) {			
			
			System.out.println("Linha --> " + code[i]);
			
			code[i] = code[i].replace(",", "");
			
			char[] codeChar =  code[i].toCharArray();
			
			for(int e=0;e<codeChar.length; e++);
			{
				if(codeChar[i] == ')') {
					codeSave = codeSave.replace(")", "");           
					codeSave = codeSave.replace("(", "");
					codeSave = codeSave.replace(" ", "");
					//Binario.setCode(codeSave);
					codeSave = "";
				}else if (codeChar[i] != ' ') {
					codeSave += codeChar[i];
				         	
			         if(isInteger(codeSave)) {
							codeSave = codeSave.replace(" ", "");           							
							//binario.setNumCode(Integer.parseInt(codeSave));
							codeSave = "";
			         }
				}else {
					codeSave = codeSave.replace(" ", "");
					//binario.SetComand(codeSave);
					codeSave = "";
				}
			}

			//save.write(binario.returnCode());	
		}
				
		save.ArchiveClose();
	}

	private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }

}


