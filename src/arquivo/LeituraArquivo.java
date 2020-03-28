package arquivo;

import java.io.*;

public class LeituraArquivo {

	private BufferedReader entrada;

	public void abrirArquivo(String nomeArquivo, String caminho) {

		try {
			entrada = new BufferedReader(new FileReader(caminho + nomeArquivo));
		} catch (FileNotFoundException excecao) {
			System.out.println("Arquivo nÃ£o encontrado");
		}
	}

	public void fecharArquivo() {

		try {
			entrada.close();
		} catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de leitura: " + excecao);
		}
	}

	public String ler() {

		String textoEntrada;

		try {
			textoEntrada = entrada.readLine();
		} catch (EOFException excecao) { // ExceÃ§Ã£o de final de arquivo.
			return null;
		} catch (IOException excecao) {
			System.out.println("Erro de leitura: " + excecao);
			return null;
		}
		return textoEntrada;
	}
}