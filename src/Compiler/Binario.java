package Compiler;

import Dictionary.Code;
import Dictionary.Register;

public class Binario {
	private String opcao;
	private String PrimeiroRegistrador;
	private String SegundoRegistrador;
	private String RegistradorDestino;
	private String imediato;
	private String shamt;

	public Binario() {

	}

	private char tipoInstrucao;

	
	public char getTipoInstrucao() {
		return tipoInstrucao;
	}

//	private void setTipoInstrucao(char tipoInstrucao) {
	//		this.tipoInstrucao = tipoInstrucao;
	//	}

	public String getShamt() {
		return shamt;
	}

	public void setImediato(String imediato) {
//        char[] charImediato = new char[10];

	}

	public String TipoInstrucao() {
		Code code = new Code();
		if (getTipoInstrucao() == 'R') {
			//		return code.DictionaryCode(opcao) + Registradores_Binario(PrimeiroRegistrador)
			//		+ Registradores_Binario(SegundoRegistrador) + Registradores_Binario(RegistradorDestino) + shamt
			//		+ getFunct(opcao);

		} else if (getTipoInstrucao() == 'I') {
			//return (Assembly_Para_Binario(opcao) + Registradores_Binario(PrimeiroRegistrador)
			//		+ Registradores_Binario(RegistradorDestino) + imediato);

		} else if (getTipoInstrucao() == 'J') {
			//return (Assembly_Para_Binario(opcao));
		} else {
			return "";
		}
		return "";
	}

	private String getFunct(String opcao2) {
		return " ";
	}

	public String NumBinario(int decimal) {
		String bin = "";
		System.out.println("decimal --> " + decimal);
		while (decimal > 0) {
			if (decimal % 2 == 0)
				bin = "0" + bin;

			else
				bin = "1" + bin;

			decimal /= 2;
		}
		if(bin.length() == 4) {
			return bin;	
		}else{
			String binarioFinal = "";
			for(int i= bin.length(); i != 4;i++) {
				binarioFinal += "0";
			}
			return binarioFinal + bin;
		}		
	}
}
