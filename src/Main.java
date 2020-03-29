
import Archives.GravarArquivo;
import Archives.ReadArchieve;
import Compiler.Binario;
import Dictionary.Code;

public class Main {

	public static void main(String[] args) {

		ReadArchieve ler = new ReadArchieve();
		GravarArquivo gravar = new GravarArquivo();
		Binario binario = new Binario();

		ler.abrirArquivo("type-i.in", "/home/savio-pires/Documentos/faculdade/JSembler/");
		gravar.abrirArquivo("type-i.out", "/home/savio-pires/Documentos/faculdade/JSembler/");
		String linhaCodigo = "";
		String textoEntrada = "";
		do {
			linhaCodigo = ler.ler();
			if (linhaCodigo != null) {
				char[] codigo = linhaCodigo.toCharArray();
				linhaCodigo = "";
				for (int i = 0; i < codigo.length; i++) {

					if (codigo[i] == ')') {
						System.out.println("textoo -->" + linhaCodigo);
						textoEntrada += binarios(linhaCodigo);
						linhaCodigo = "";
					} else if (codigo[i] != ' ') {
						linhaCodigo += codigo[i];
						linhaCodigo = linhaCodigo.replace(",", "");
						linhaCodigo = linhaCodigo.replace(" ", "");
						if (isInteger(linhaCodigo)) {
							int numCodigo = Integer.parseInt(linhaCodigo);
							textoEntrada += binario.NumBinario(numCodigo);
							linhaCodigo = "";
						}
					} else {
						textoEntrada += binarios(linhaCodigo);
						linhaCodigo = "";
					}
				}
				gravar.escrever(textoEntrada);
				textoEntrada = "";
			}
		} while (linhaCodigo != null);
		gravar.fecharArquivo();
		ler.fecharArquivo();
	}

	private static boolean isInteger(String str) {
		return str != null && str.matches("[0-9]*");
	}

	private static String binarios(String linha) {
		Code dictionary = new Code();

		linha = linha.replace("(", "");
		linha = linha.replace(")", "");
		System.out.println(linha + " ----- ");
		System.out.println(linha + " ----- ");

		if (dictionary.DictionaryCode(linha) == "inexistente") {
			// return binario.Registradores_Binario(linha);
		} else {
			System.out.println("Codigo -> " + linha);
			return dictionary.DictionaryCode(linha);
		}
		return linha;
	}
}