package src.main.java.src.Archives;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class ReadArchieve {
	//Atributos para manipulacao de binario e tamanho
	private File fileInput;
	private int fileSize = 0;

	//Verificar se existe palavra no arquivo em atributo passado como parametro utilizando throws
	public ReadArchieve(String fileName) throws FileNotFoundException {
		setFileInput(fileName);
	}

	//Passar para file o arquivo de entrada para leitura
	public ReadArchieve(File file) throws FileNotFoundException {
		if (file != null) {
			fileInput = file;
		} else {
			throw new FileNotFoundException();
		}
	}

	//Retorna o arquivo de entrada
	public File getFileInput() {
		return fileInput;
	}

	//Setar arquivo de entrada utilizando o atributo passado como parametro
	public void setFileInput(String fileName) throws FileNotFoundException{
		if (fileName != null) {
			this.fileInput = new File(fileName);
		} else {
			throw new FileNotFoundException();
		}
	}

	//Obter o tamanho do arquivo em array buscando por collection
	public int getArrayLength() throws FileNotFoundException {
		Scanner fileScanner = new Scanner(fileInput);
		int count = 0;

		while (fileScanner.hasNextLine()) {
			count++;
			fileScanner.nextLine();
		}

		closeFile(fileScanner);
		return count;
	}
	//Obter arquivo em formato de array utilizando metodo has collection
	public String[] getFileInArrayFormat() throws FileNotFoundException {
		Scanner fileScanner = new Scanner(fileInput);
		String array[] = new String[getArrayLength()];
		
		while (fileScanner.hasNextLine()) {
			String data = fileScanner.nextLine();
			array[fileSize] = data;
			fileSize++;
		}
		
		closeFile(fileScanner);
		return array;
	}
	//Fechar o arquivo 
	public void closeFile(Scanner file) throws ClosedFileSystemException {
		file.close();
	}
}
