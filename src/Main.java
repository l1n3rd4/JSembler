import java.io.FileNotFoundException;

import Compiler.CompilerBinary;

public class Main {

	public static void main(String[] args) {

	
		CompilerBinary  compiler = new CompilerBinary();

		try {
			compiler.TransformBinary();
		} catch (FileNotFoundException error) {
			
			error.printStackTrace();
		}
	
	}

}