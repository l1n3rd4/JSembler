package src.Dictionary;

public class InstructionsTypes{
  public static String getType(String type){
	  System.out.println("tipo dentro do getType: " + type);
    switch(type){
      case "ori":
        return "I";
      case "jr":  
        return "R";
      case "jal":
        return "J";
      case "add":
        return "R";
      case "addi":
        return "I";
      case "xor":
        return "R";
      case "lw":
        return "I";
      case "sw":
        return "I";
      case "beq":
        return "I";
      case "bne":
        return "I";
      case "j":
        return "J";
      case "sub":
        return "R";
      case "mult":
        return "R";
      case "div":
        return "R";
      case "and":
        return "R";
      case "andi":
        return "I";
      case "or":
        return "R";      
      case "addiu":
        return "";
      case "jalr":
        return "0";
      case "slt":
    	return "R";
      case "slti":
        return "I";
      case "movz":
        return "0";
      case "sltiu":
        return "I";
      case "nor":
    	return "R";
      case "sll":
    	return "R";
      case "srl":
      	return "R";
      default: return null;
    }
  }
}
