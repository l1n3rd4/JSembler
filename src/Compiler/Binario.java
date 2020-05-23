package Compiler;

import Dictionary.Funct;
import Dictionary.Opcode;
import Dictionary.Register;

public class Binario {
	private String type = "";
	private String imediato = "";
	private String shamt = "000000";
	private String opcode = "";
	private String address = "";
	private String[] registers;
	private String funct;
	
	public Binario() {}
  
	public String getShamt() {
		return shamt;
	}

  public void setRegisters(String[] registers){
      this.registers = registers;
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
	
	public String Instruction_R_Type() {
		String retorno;
		retorno = getOpcode() + Register.BinaryRegisters(registers[0]) + Register.BinaryRegisters(registers[1]) + 
				Register.BinaryRegisters(registers[2]) + shamt + getFunct();
		
		System.out.println("String retorno: " + retorno);
		return retorno;
	}
	
	public String Instruction_I_Type(String comando) {
		String retorno;
		retorno = getOpcode() + Register.BinaryRegisters(registers[0])
		+ Register.BinaryRegisters(registers[1]) + imediato;
		
		System.out.println("String retorno: " + retorno);
		return retorno;
	}
	
	
	public String Instruction_J_Type(String comando) {
		String retorno;
		System.out.println("Tipo :" + getType());
		retorno = getOpcode() + getAddress();
		
		System.out.println("Endereço: " + getAddress());
		System.out.println("String de saída: " + retorno);
		return retorno;
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
		System.out.println("\nInicio funcao setOp: \nString op: " + opcode);
		String aux = Opcode.opcode(opcode);
		System.out.println("Codigo Op: " + aux);
		
		if(aux.length() == 6) {
			this.opcode = aux;
		} else {
			for(int i = 0; i < (6 - aux.length()); i++) {
				this.opcode += "0";
			}
			
			System.out.println("SetOpcode: " + this.opcode);
			this.opcode += aux;
		}
		
		System.out.println("Fim função setOp!\n");
		
	}

	public String[] getRegisters() {
		return registers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		String endereco = Integer.toBinaryString(Integer.parseInt(address, 16));
		
		if(endereco.length() == 26) {
			this.address = endereco;
			
			System.out.println(endereco);
		}else {
			for(int i = 0; i < (26 - endereco.length()); i++) {
				this.address += "0";
			}
			
			System.out.println("Endereço antes: " + getAddress());
			this.address += endereco;
		}
		
	}
	
	public String complete() {
		return null;
	}

	public String getFunct() {
		return funct;
	}

	public void setFunct(String funct) {
		this.funct = Integer.toBinaryString(Integer.parseInt(Funct.funct(funct), 16));
	}
}


