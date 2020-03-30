package Dictionary;

public class Code {
	
	public static String DictionaryCode(String code) {
		switch (code) {
		case "ori":
			return "001101";
		case "jr":
			return "001000";
		case "jal":
			return "000011";
		case "add":
			return "100000";
		case "addi":
			return "001000";
		case "xor":
			return "100110";
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
			return "100010";
		case "mult":
			return "011000";
		case "div":
			return "011010";
		case "and":
			return "100100";
		case "andi":
			return "001100";
		case "or":
			return "100101";			
		case "addiu":
			return "001001";
		case "jalr":
			return "001001";
		case "slti":
			return "001010";
		case "movz":
			return "001010";
		case "sltiu":
			return "001011";	
		default:
			return null;			
		}
	}

}

