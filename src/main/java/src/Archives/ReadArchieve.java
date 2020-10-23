package src.main.java.src.Archives;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class ReadArchieve {
	private File fileInput;
	private int fileSize = 0;
	private Scanner fileScanner;

	public ReadArchieve(String fileName) throws FileNotFoundException,IOException {
		setFileInput(fileName);
		setScannerFile(fileInput);
	}

	public ReadArchieve(File file) throws FileNotFoundException, IOException {
		if (file != null) {
			fileInput = file;
			setScannerFile(file);
		} else {
			throw new FileNotFoundException();
		}
	}

	public void setScannerFile(File file) throws FileNotFoundException, IOException{
		 if(file != null){
			 fileScanner = new Scanner(file);
		 } else {
		 	throw new FileNotFoundException();
		 }
	}

	public File getFileInput() {
		return fileInput;
	}

	public void setFileInput(String fileName) throws FileNotFoundException, IOException {
		if (fileName != null) {
			this.fileInput = new File(fileName);
		} else {
			throw new FileNotFoundException();
		}
	}

	public int getArrayLength() throws FileNotFoundException {
		Scanner fileLength = new Scanner(fileInput);
		int count = 0;

		while (fileLength.hasNextLine()) {
			count++;
			fileLength.nextLine();
		}

		fileLength.close();
		return count;
	}

	public String[] getFileInArrayFormat() throws FileNotFoundException {
		String array[] = new String[getArrayLength()];
		
		while (fileScanner.hasNextLine()) {
			String data = fileScanner.nextLine();
			array[fileSize] = data;
			fileSize++;
		}

		return array;
	}

	public void closeFile() throws ClosedFileSystemException {
		fileScanner.close();
	}
}
