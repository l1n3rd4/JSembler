package src.main.java.src.Dictionary;

public class Opcode {
	
	public static String opcode(String code) {
		switch (code) {
		case "ori":
			return "001101";
		case "jr":
			return "000000";
		case "jal":
			return "000011";
		case "add":
			return "000000";
		case "addi":
			return "001000";
		case "xor":
			return "000000";
		case "lw":
			return "100011";
		case "sw":
			return "101011";
		case "beq":
			return "000100";
		case "bne":
			return "000101";
		case "j":
			return "000010";
		case "sub":
			return "000000";
		case "mult":
			return "000000";
		case "div":
			return "000000";
		case "and":
			return "000000";
		case "andi":
			return "001100";
		case "or":
			return "000000";
		case "slti":
			return "001010";
		case "sll":
			return "000000";
		case "nor":
			return "000000";
		case "slt":
			return "000000";
		case "srl":
	    		return "000000";
		default:
			return null;			
		}
	}

}

