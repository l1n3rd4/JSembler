package arquivo;

import Assembly_Binario.Binario;

public class Aplicacao {

	public static void main(String[] args) {
		
		LeituraArquivo ler = new LeituraArquivo();
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
					if (codigo[i] != ' ') {
						linhaCodigo += codigo[i];
					} else {
						System.out.println(linhaCodigo +" ----- " + codigo[i]);   
						if (binario.Assembly_Para_Binario(linhaCodigo) == "inexistente") {
							         linhaCodigo = linhaCodigo.replace(",", "");           
							         linhaCodigo = linhaCodigo.replace(" ", "");
							         System.out.println("Codigo -> " + linhaCodigo);
							        textoEntrada +=binario.Registradores_Binario(linhaCodigo);
							         linhaCodigo = "";
						} else {
							  linhaCodigo = linhaCodigo.replace(",", "");      
							  linhaCodigo = linhaCodigo.replace(" ", "");
							  System.out.println("Codigo -> " + linhaCodigo);
							  textoEntrada +=binario.Assembly_Para_Binario(linhaCodigo);
							  linhaCodigo = "";
						}
					}
				}
				gravar.escrever(textoEntrada);
				textoEntrada = "";
			}
		} while (linhaCodigo != null);
		gravar.fecharArquivo();
		ler.fecharArquivo();
	}
}