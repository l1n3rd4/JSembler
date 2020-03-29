<<<<<<< HEAD
package Compiler;

import Dictionary.Code;
import Dictionary.Opcode;
import Dictionary.Register;

public class Binario {
	private String type;
	private String imediato;
	private String shamt = "000000";
	private String opcode;
	private String address;
	private String[] registradores;

	public Binario() {

	}
	
	public String getShamt() {
		return shamt;
	}

	public void setImediato(String imediato) {
		String hexa;
		this.imediato = "";
		hexa = Integer.toBinaryString((Integer.parseInt(imediato)));
		if(hexa.length() == 16) {
			this.imediato = hexa;
		} else {
			for(int i = 0; i < (16 - hexa.length()); i++) {
				this.imediato += "0";
			}
			this.imediato += hexa;
		}
	}
	
	public String getImediato() {
		return imediato;
	}
	
	public void Type() {
		if(registradores.length == 2) {
			setType("I");
		}else if(registradores.length == 3){
			setType("R");
		} else {
			setType("J");
		}
	}
	
	public String TipoInstrucao(String comando) {
		Type();
		String type = this.getType();
		
		if (type == "R") {
			return getOpcode() + Register.BinaryRegisters(registradores[0]) + Register.BinaryRegisters(registradores[1]) + 
					Register.BinaryRegisters(registradores[2]) + shamt + Code.Comandos_Binario(comando);
		} else if (type == "I") {
			return getOpcode() + Register.BinaryRegisters(registradores[0])
			+ Register.BinaryRegisters(registradores[1]) + imediato;
		} else{
			return getOpcode() + getAddress();
		} 
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOpcode() {
		return opcode;
	}

	public void setOpcode(String opcode) {
		String aux = Integer.toBinaryString((Integer.parseInt(Opcode.opcode(opcode), 16)));;
		
		if(aux.length() == 6) {
			this.opcode = Integer.toBinaryString((Integer.parseInt(Opcode.opcode(opcode), 16)));
		} else {
			for(int i = 0; i < (6 - aux.length()); i++) {
				this.opcode += "0";
			}
			this.opcode += Integer.toBinaryString((Integer.parseInt(Opcode.opcode(opcode), 16)));
		}
		
	}

	public String[] getRegistradores() {
		return registradores;
	}

	public void setRegistradores(String[] registradores) {
		this.registradores = registradores;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = Integer.toBinaryString(Integer.parseInt(address, 16));
	}
}
=======
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
>>>>>>> f57156abf440e3c78a22b55544556ce61ff46f02
