package Compiler;

public class Instructions{
	public String Instruction_R_Type() {
		String retorno;
		retorno = getOpcode() + Register.BinaryRegisters(registers[0]) + 
					Register.BinaryRegisters(registers[1]) + 
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
}