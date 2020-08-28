package src.main.java.src.Archives;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class ReadArchieve {
	private File fileInput;
	private int fileSize = 0;
	private Scanner fileScanner;

	public ReadArchieve(String fileName) throws FileNotFoundException {
		setFileInput(fileName);
		setScannerFile(fileInput);
	}

	public ReadArchieve(File file) throws FileNotFoundException {
		if (file != null) {
			fileInput = file;
			setScannerFile(file);
		} else {
			throw new FileNotFoundException();
		}
	}

	public void setScannerFile(File file) throws FileNotFoundException{
		 if(file != null){
			 fileScanner = new Scanner(fileInput);
		 } else {
		 	throw new FileNotFoundException();
		 }
	}

	public File getFileInput() {
		return fileInput;
	}

	public void setFileInput(String fileName) throws FileNotFoundException{
		if (fileName != null) {
			this.fileInput = new File(fileName);
		} else {
			throw new FileNotFoundException();
		}
	}

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

	public String[] getFileInArrayFormat() throws FileNotFoundException {
		String array[] = new String[getArrayLength()];
		
		while (fileScanner.hasNextLine()) {
			String data = fileScanner.nextLine();
			array[fileSize] = data;
			fileSize++;
		}
		
		closeFile(fileScanner);
		return array;
	}

	public void closeFile(Scanner file) throws ClosedFileSystemException {
		file.close();
	}
}
