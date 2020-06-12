package src.main.java.src.Archives;

import java.io.*;

public class SaveArchieve {

	private BufferedWriter archive;
	private String FileOutput;
	
	public SaveArchieve(String FileOutput){
		try {
			this.FileOutput = FileOutput;
			archive = new BufferedWriter(new FileWriter(FileOutput));
		} catch (FileNotFoundException excecao) {
			System.out.println("Arquivo nao encontrado");
		} catch (IOException excecao) {
			System.out.println("Erro na abertura do arquivo de escrita: " + excecao);
		}
	}

	public String getFileOutput() {
		return FileOutput;
	}
	
	public void setFileInput(String FileOutput) {
		this.FileOutput = FileOutput;
	}
	
	public void write(String textInput) {
	
		try {
			archive.write(textInput);
			archive.newLine();
		} catch (IOException excecao) {
			System.out.println("Erro de entrada/saida " + excecao);
		}
	}
	
	public void ArchiveClose() {

		try {
			archive.close();
		} catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de escrita: " + excecao);
		}
	}
}
