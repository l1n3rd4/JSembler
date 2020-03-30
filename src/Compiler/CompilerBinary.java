package Compiler;

import java.io.FileNotFoundException;

import Archives.ReadArchieve;
import Archives.SaveArchieve;
import Dictionary.Code;
import Dictionary.Register;

public class CompilerBinary {

	public void TransformBinary() throws FileNotFoundException {
		ReadArchieve read = new ReadArchieve("/home/savio-pires/Documentos/faculdade/JSembler/type-i.in");
		SaveArchieve save = new SaveArchieve("/home/savio-pires/Documentos/faculdade/JSembler/type-i.out");

		String[] code = read.getFileInArrayFormat();
		String codeSave = "";
		String[] regis = new String[3];
		int contRegis=0;
		for (int i = 0; i < read.getArrayLength(); i++) {

			System.out.println("Linha --> " + code[i]);

			char[] codeChar = code[i].toCharArray();

			Binario binario = new Binario();
			codeSave = "";

			for (int e = codeChar.length; e != 0; e--) {
				if (codeChar[e - 1] != ' ') {
					codeSave += codeChar[e - 1];
										
					System.out.println("" + reverse(codeSave));
					
					
				    if (codeChar[e - 1] == '(') {
						codeSave = codeSave.replace(")", "");
						codeSave = codeSave.replace("(", "");	
				    	System.out.println("Register2 --> " + reverse(codeSave));
						regis[contRegis] = codeSave;
						contRegis++;
						codeSave = "";
					} 

				    else if (Code.DictionaryCode(reverse(codeSave)) !=null) {
						System.out.println("Comando --> " + reverse(codeSave));
		
						if(contRegis == 0) {
							regis[0] = " ";
							regis[1] = " ";
							regis[2] = " ";
						}
						else if(contRegis == 2) {
							regis[2] = " ";
						}
						
						binario.setRegistradores(regis);
						save.write(binario.TipoInstrucao(reverse(codeSave)));
						codeSave = "";
						contRegis = 0;
					}
					 else if (isInteger(codeSave)) {
						System.out.println("Inteiro");
						codeSave = codeSave.replace(" ", "");
						binario.setImediato(codeSave);
						codeSave = "";
					}
				} else {
					codeSave = codeSave.replace(" ", "");
					codeSave = codeSave.replace(",", "");
					
				    if (Register.BinaryRegisters(reverse(codeSave)) != null) {
						System.out.println("Register2 --> " + reverse(codeSave));
						regis[contRegis] = codeSave;
						contRegis++;
						codeSave = "";
					} 
				}
			}
		}
		save.ArchiveClose();
	}

	private static boolean isInteger(String str) {
		return str != null && str.matches("[0-9]*");
	}

	static String reverse(String original) {
		String reversed = "";
		for (int i = original.length() - 1; 0 <= i; i--) {
			reversed += original.charAt(i);
		}
		return reversed;
	}
}
