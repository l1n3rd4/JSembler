package src.main.java.src.Archives;

import java.io.*;

public class SaveArchieve {
	//Atributos privado do tipo bufferedWriter para manipulação de escrita 
	private BufferedWriter archive;
	//Atributo do tipo String  
	private String FileOutput;
	// Metodo para salvar arquivos utilizando atributo passado por parametro fazendo uso de tratamento de exceção 
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
	//Obter arquivo resultante 
	public String getFileOutput() {
		return FileOutput;
	}
	//Setar Arquivo utilizando o atributo passado como parametro
	public void setFileInput(String FileOutput) {
		this.FileOutput = FileOutput;
	}
	//Escrever no arquivo binario utilizando parametro por meio de tratamento de exceção
	public void write(String textInput) {
	
		try {
			archive.write(textInput);
			archive.newLine();
		} catch (IOException excecao) {
			System.out.println("Erro de entrada/saida " + excecao);
		}
	}
	//Fechamento de arquivo utilizando tratamento de exceção
	public void ArchiveClose() {

		try {
			archive.close();
		} catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de escrita: " + excecao);
		}
	}
}
