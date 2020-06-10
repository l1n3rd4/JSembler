package src.main.java.src.Compiler;

import src.main.java.src.Dictionary.Register;
import src.main.java.src.Memory.MainMemory;
import src.main.java.src.Memory.MemoryLine;
import src.main.java.src.Dictionary.Opcode;
import src.main.java.src.Dictionary.Funct;

public class Binario{
	private String type = "";
	private String imediato = "";
	private String shamt = "00000";
	private String opcode = "";
	private String name_instr = ""; 
	private String address = "";
	private String[] registers;
	private String funct;
	private int lineAddress;	
	
	public Binario() {}

	public void setLineAddress(int address){
		this.lineAddress = address;
	}

	public int getLineAddress(){
		return lineAddress;
	}
  
	public String getShamt() {
		return shamt;
	}

	public void setName_instr(String name_instr){
		this.name_instr = name_instr;
	} 

	public String getName_instr(){
		return name_instr;
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
	
	private String Instruction_R_Type() {
		String retorno;

		System.out.println("Opcode dentro do Instruction_R_Type: " + getOpcode());

		System.out.println("Register 0: " + Register.BinaryRegisters(registers[0]));
		System.out.println("Register 1: " + Register.BinaryRegisters(registers[1]));
		System.out.println("Register 2: " + Register.BinaryRegisters(registers[2]));	
		
		retorno = getOpcode() + Register.BinaryRegisters(registers[1]) + 
					Register.BinaryRegisters(registers[2]) + 
					Register.BinaryRegisters(registers[0]) +
					shamt + getFunct();  
		
		System.out.println("String retorno: " + retorno);
		return retorno;
	}
	
	private String Instruction_I_Type() {
		String retorno;
		retorno = getOpcode() + Register.BinaryRegisters(registers[0])
		+ Register.BinaryRegisters(registers[1]) + imediato;
		
		System.out.println("String retorno: " + retorno);
		return retorno;
	}
	
	
	private String Instruction_J_Type() {
		String retorno;
		System.out.println("Tipo :" + getType());
		retorno = getOpcode() + getAddress();
		
		System.out.println("Endereço: " + getAddress());
		System.out.println("String de saída: " + retorno);
		return retorno;
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

	public String getFunct() {
		return funct;
	}

	public void setFunct(String funct) {
		this.funct = Integer.toBinaryString(Integer.parseInt(Funct.funct(funct), 16));

		System.out.println("Setfunct: " + this.funct);
	}

	public String instruction_fetch() {
               switch (getName_instr()) {
                    case "ori":
                           return ori_instr();
                    case "jr":
                           return jr_instr();
                    case "jal":
                           return jal_instr();
                    case "add":
                           return add_instr();
                    case "addi":
                           return addi_instr();
                    case "xor":
                           return xor_instr();
                    case "lw":
                           return lw_instr();
                    case "sw":
                           return sw_instr();
                    case "beq":
                           return beq_instr();
                    case "bne":
                           return bne_instr();
                    case "j":
                           return j_instr();
                    case "sub":
                           return sub_instr();
                    case "mult":
                           return mult_instr();
                    case "div":
                           return div_instr();	   
  	            case "and":
                           return and_instr();
                    case "andi":
                           return andi_instr();
                    case "or":
                           return or_instr();
                    case "slti":
                           return slti_instr();
                    case "sll":
   //                      return sll_instr();
                   	   return "q";
		    case "nor":
                            return nor_instr();
                    case "slt":
                	    return slt_instr();
                    case "srl":
 //                           return srl_instr();
 			      return "q";
                    default:
                            System.out.println("instrucao não encontrada: " + getName_instr());     
			    return "q";
                    }
            }


   	public String add_instr(){
		  // registers [0] = registers[1] + registers[2]
		  int result; 
		  System.out.println("primeiro reg " + Register.GetRegisters(registers[1]));
		  int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));
		  int register3 = Integer.parseInt(Register.GetRegisters(registers[2]));

		  System.out.println("first: " + register2);
		  System.out.println("second: " + register3);
		  result = register2 + register3;

		  System.out.println("Resultado: " + result);
		  Register.SetRegisters(registers[0], Integer.toString(result));

		  return Instruction_R_Type();
	}


	public String addi_instr(){
		// registers[0] = registers[1] + number
		int result;
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));

		result = register2 + Integer.parseInt(getImediato(), 2);
		
		System.out.println("Resultado: " + result);
		Register.SetRegisters(registers[0], Integer.toString(result));
		System.out.println("Registrador alterado: " + Register.GetRegisters(registers[0]));

		return Instruction_I_Type();	
	}

	public String sub_instr(){
		// registers[0] = registers[1] - registers[2]
		int result;
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));
		int register3 = Integer.parseInt(Register.GetRegisters(registers[2]));

		result = register2 - register3;
		System.out.println("Resultado: " + result);
		Register.SetRegisters(registers[0], Integer.toString(result));

		return Instruction_R_Type();
	}

	public String mult_instr(){
		
		int resultLo;
		int resultHi;
		int register1 = Integer.parseInt(Register.GetRegisters(registers[0]));
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));

		if(register1 * register2 <=  429496729){			
			resultLo = register1 * register2;

			Register.SetRegisters("lo", Integer.toString(resultLo));
		} else{
			resultLo = (register1 * register2)/2;
			resultHi = resultLo;
		
			Register.SetRegisters("lo", Integer.toString(resultLo));
			Register.SetRegisters("hi", Integer.toString(resultHi));
		}

		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[0])  +
			 Register.BinaryRegisters(registers[1]) + shamt + getFunct();
		System.out.println("mult: " + instruction);		
		return instruction; 
	}

	public String div_instr(){
		int resultLo;
		int resultHi;
		int register1 = Integer.parseInt(Register.GetRegisters(registers[0]));
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));

		resultLo = register1 / register2;
		resultHi = register1 % register2;

		Register.SetRegisters("lo", Integer.toString(resultLo));
		Register.SetRegisters("hi", Integer.toString(resultHi));
		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[0]) +
			Register.BinaryRegisters(registers[1]) + shamt + getFunct();
		
		System.out.println("div: " + instruction);
		return instruction;
	}

//	public void neg_instr(){
		
//	}

	public String slt_instr(){
		return Instruction_R_Type();
	}

	public String slti_instr(){
		return Instruction_I_Type();
	}

	public String lw_instr(){
		MemoryLine aux = MainMemory.getMemorySlot(getLineAddress());

		Register.SetRegisters(registers[0], aux.getContent());
		String instruction = "";
		
		instruction = getOpcode() + Register.BinaryRegisters(registers[0]) +
			    Register.BinaryRegisters(registers[1]) + getAddress();

		return instruction;
	}

	public String sw_instr(){
		MainMemory.setMemorySlot(getLineAddress(), Register.GetRegisters(registers[0]));	
                String instruction = "";

                instruction = getOpcode() + Register.BinaryRegisters(registers[0]) +
                Register.BinaryRegisters(registers[1]) + getAddress();
		System.out.println("Endereço sw: " + getAddress());
                return instruction;
	} 

	public String beq_instr(){
		return Instruction_I_Type();
	}

	public String bne_instr(){
		return Instruction_I_Type();
	}

	public String j_instr(){
		return Instruction_J_Type();
	}

	public String jr_instr(){
		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[0]) +
			Register.BinaryRegisters("0") + Register.BinaryRegisters("0") +
			shamt + getFunct();
		
		System.out.println("jr inst: " + instruction);
		return instruction;
	}

	public String jal_instr(){
		return Instruction_J_Type();
	}

//	public String srl_instr(){
		
//	}
	
	public String and_instr(){
		return Instruction_R_Type();
	}

	public String andi_instr(){
		return Instruction_I_Type();
	}

	public String or_instr(){
		return Instruction_R_Type();
	}

	public String ori_instr(){
		return Instruction_I_Type();
	}

	public String xor_instr(){
		return Instruction_R_Type();
	}

	public String nor_instr(){
		return Instruction_R_Type();
	}
}
