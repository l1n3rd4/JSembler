package Archives;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class ReadArchieve {

	private File fileInput;
	private int fileSize = 0;

	public File getFileInput() {
		return fileInput;
	}
	
	public void setFileInput(String fileName) {
		this.fileInput = new File(fileName);
	}

	public int getArrayLength(File fileInput) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(fileInput);
		int count = 0;
		while (fileScanner.hasNextLine()) {
			count++;
			fileScanner.nextLine();
		}
		closeFile(fileScanner);
		return count;
	}

	public String[] getFileInArrayFormat(File fileInput) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(fileInput);
		String array[] = new String[getArrayLength(fileInput)];
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