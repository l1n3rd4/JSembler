package Assembly_Binario;


public class Binario {

	public Binario(){
		
	}
	
	public String Assembly_Para_Binario(String opcao) {		
		switch(opcao) {
			case "sll" :
				return "000 0000";	
			case "srl" :
			case "j" :
				return "000 0010";
			case "jal" :
			case "sra" :
				return "000 0011";
			case "beq" :
			case "sllv" :
				return "000 0100";
			case "bne" :
				return "000 0101";
			case "blez" :
			case "srlv" :
				return "000 0100";	
			case "bgtz" :
			case "srav" :
				return "000 0111";	
			case "addi" :
			case "jr" :
				return "00 1000";
			case "addiu" :
			case "jalr" :
				return "000 1001";
			case "slti" :
			case "movz" :
				return "000 1010";
			case "sltiu":
			case "movn" :
				return "000 1011";
			case "andi":
			case "syscall" :
				return "000 1100";
			case "ori":
			case "break" :
				return "000 1101";
			case "xori" :
				return "000 1110";
			case "lui" :
			case "sync" :
				return "000 1111";
			case "mfhi" :
				return "001 0000";
			case "mthi" :
				return "001 0001";
			case "mflo" :
				return "001 0010";
			case "mtlo" :
				return "001 0011";
			case "mult" :
				return "001 1000";
			case "multu" :
				return "001 1001";
			case "div" :
				return "001 1010";
			case "divu" :
				return "001 1011";
			case "add" :
			case "lb" :
				return "010 0000";
			case "addu":
			case "lh":
				return "010 0001";
			case "lwl":
			case "sub":
				return "010 0010";
			case "lw":
			case "subu":
				return "010 0011";	
			case "lbu":
			case "and":
				return "010 0100";
			case "lhu":
			case "or":
				return "010 0101";
			case "lwr":
			case "xor":
				return "010 0110";
			case "nor":
				return "010 0111";
			case "sb":
				return "010 1000";
			case "sh":
				return "010 1001";
			case "slt":
			case "swl":
				return "010 1010";
			case "sw":
			case "sltu":
				return "010 1011";
			case "swr":
				return "010 1110";
			case "cache":
				return "010 1110";
			case "ll":
			case "tge":
				return "011 0000";
			case "lwc1":
			case "tgeu":
				return "011 0001";
			case "lwc2":
			case "tlt":
				return "011 0010";
			case "pref":
			case "tltu":
				return "011 0011";
			case "teq":
				return "011 0100";
			case "ldc1":
				return "011 0101";
			case "ldc2":
			case "tne":
				return "011 0110";
			case "sc":
				return "011 1000";
			case "swc1":
				return "011 1001";
			case "swc2":
				return "011 1010";
			case "sdc1":
				return "011 1101";
			case "sdc2":
				return "011 1110";
			default:
				return "Parametro nao existe";
		}
	}
}