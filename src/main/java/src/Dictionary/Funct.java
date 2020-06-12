package src.main.java.src.Dictionary;

public class Funct {
	public static String funct(String code) {
		switch (code) {
		case "ori":
			return "d";
		case "jr":
			return "08";
		case "jal":
			return "3";
		case "add":
			return "20";
		case "addi":
			return "0";
		case "xor":
			return "26";
		case "lw":
			return "23";
		case "sw":
			return "2b";
		case "beq":
			return "4";
		case "bne":
			return "5";
		case "j":
			return "2";
		case "sub":
			return "22";
		case "mult":
			return "18";
		case "div":
			return "1a";
		case "and":
			return "24";
		case "andi":
			return "c";
		case "or":
			return "25";			
		case "addiu":
			return "9";
		case "jalr":
			return "0";
		case "slt":
			return "2a";
		case "slti":
			return "a";
		case "movz":
			return "0";
		case "sltiu":
			return "b";
		case "nor":
			return "27";
		case "sll":
			return "00";
		case "srl":
			return "02";
		case "neg":
		    return "7";
		}
		return null;
	}

}
