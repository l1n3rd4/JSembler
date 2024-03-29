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

import java.io.*;

public class SaveArchieve {
	private BufferedWriter archive;
	private String FileOutput;

	public SaveArchieve(String FileOutput) throws FileNotFoundException, IOException{
		try {
			this.FileOutput = FileOutput;
			archive = new BufferedWriter(new FileWriter(FileOutput));
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}

	public String getFileOutput() {
		return FileOutput;
	}

	public void setFileInput(String FileOutput) {
		this.FileOutput = FileOutput;
	}

	public void write(String textInput) throws IOException{
		try {
			archive.write(textInput);
			archive.newLine();
		} catch (IOException e) {
			throw e;
		}
	}

	public void ArchiveClose() throws IOException{
		try {
			if(archive != null){
				archive.close();
			}
		} catch (IOException e) { 
			throw e;
		}
	}
}
