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
		} catch (IOException e) {     // IOException excecao
			throw e;
		}
	}
}
