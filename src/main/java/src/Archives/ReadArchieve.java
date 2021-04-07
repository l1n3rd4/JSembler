/*
 * MIT License
 *
 * Copyright(c) 2020 Leonardo Henrique Guimaraes <leonardo.guimaraeslhg@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
