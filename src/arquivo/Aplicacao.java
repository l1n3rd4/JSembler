package arquivo;

import Assembly_Binario.Binario;

public class Aplicacao {

	public static void main(String[] args) {
		LeituraArquivo leitura = new LeituraArquivo();
		GravarArquivo escrita = new GravarArquivo();
		Binario binario = new Binario();

		System.out.println(binario.Assembly_Para_Binario("add"));
	}
}
