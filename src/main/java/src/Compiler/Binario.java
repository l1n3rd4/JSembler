package src.main.java.src.Compiler;

import src.main.java.src.Dictionary.Register;
import src.main.java.src.Memory.MainMemory;
import src.main.java.src.Memory.MemoryLine;
import src.main.java.src.Dictionary.Opcode;
import src.main.java.src.Dictionary.Funct;

public class Binario {
	private String type = "";
	private String imediato = "";
	private String shamt = "00000";
	private String opcode = "";
	private String name_instr = "";
	private String address = "";
	private String[] registers;
	private String funct = "";
	private int lineAddress;

	public Binario() {
	}

	public void setLineAddress(int address) {
		this.lineAddress = address;
	}

	public int getLineAddress() {
		return lineAddress;
	}

	public String getShamt() {
		return shamt;
	}

	public void setName_instr(String name_instr) {
		this.name_instr = name_instr;
	}

	public String getName_instr() {
		return name_instr;
	}

	public void setRegisters(String[] registers) {
		this.registers = registers;
	}

	public void setImediato(String imediato) {
		String hexa;
		this.imediato = "";
		hexa = Integer.toBinaryString((Integer.parseInt(imediato)));

		if (hexa.length() == 16) {
			this.imediato = hexa;
		} else {
			for (int i = 0; i < (16 - hexa.length()); i++) {
				this.imediato += "0";
			}
			this.imediato += hexa;
		}
	}

	public String getImediato() {
		return imediato;
	}

	private String Instruction_R_Type() {
		String retorno;

		System.out.println("Opcode dentro do Instruction_R_Type: " + getOpcode());

		retorno = getOpcode() + Register.BinaryRegisters(registers[1]) + Register.BinaryRegisters(registers[2])
				+ Register.BinaryRegisters(registers[0]) + shamt + getFunct();

		System.out.println("String retorno: " + retorno);
		return retorno;
	}

	private String Instruction_I_Type() {
		String retorno;
		retorno = getOpcode() + Register.BinaryRegisters(registers[1]) + Register.BinaryRegisters(registers[0])
				+ imediato;

		System.out.println("String retorno: " + retorno);
		return retorno;
	}

	private String Instruction_J_Type() {
		String retorno;
		retorno = getOpcode() + getAddress();

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
		String aux = Opcode.opcode(opcode);
		System.out.println("Codigo Op: " + aux);

		if (aux.length() == 6) {
			this.opcode = aux;
		} else {
			for (int i = 0; i < (6 - aux.length()); i++) {
				this.opcode += "0";
			}

			System.out.println("SetOpcode: " + this.opcode);
			this.opcode += aux;
		}
	}

	public String[] getRegisters() {
		return registers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		String endereco = Integer.toBinaryString(Integer.parseInt(address));
		System.out.println("endereco dentro da função set" + endereco);

		if (endereco.length() == 26) {
			this.address = endereco;

			System.out.println(endereco);
		} else {
			for (int i = 0; i < (26 - endereco.length()); i++) {
				this.address += "0";
			}

			this.address += endereco;
		}

	}

	public String getFunct() {
		return funct;
	}

	public void setFunct(String funct) {
		String bufferfunct = Integer.toBinaryString(Integer.parseInt(Funct.funct(funct), 16));

		if (bufferfunct.length() == 6) {
			this.funct = bufferfunct;

		} else {

			for (int i = 0; i < (6 - bufferfunct.length()); i++) {
				this.funct += "0";
			}

			this.funct += bufferfunct;
		}

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
		case "nor":
			return nor_instr();
		case "slt":
			return slt_instr();
		case "neg":
			return neg_instr();
		default:
			System.out.println("instrucão " + getName_instr() + " não encontrada!");
			return "q";
		}
	}

	public String add_instr() {
		int result;
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));
		int register3 = Integer.parseInt(Register.GetRegisters(registers[2]));
		result = register2 + register3;

		System.out.println("Resultado: " + result);
		Register.SetRegisters(registers[0], Integer.toString(result));

		return Instruction_R_Type();
	}

	public String addi_instr() {
		int result;
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));

		result = register2 + Integer.parseInt(getImediato(), 2);

		System.out.println("Resultado: " + result);
		Register.SetRegisters(registers[0], Integer.toString(result));

		return Instruction_I_Type();
	}

	public String sub_instr() {
		int result;
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));
		int register3 = Integer.parseInt(Register.GetRegisters(registers[2]));

		result = register2 - register3;
		System.out.println("Resultado: " + result);
		Register.SetRegisters(registers[0], Integer.toString(result));

		return Instruction_R_Type();
	}

	public String mult_instr() {

		int resultLo;
		int resultHi;
		int register1 = Integer.parseInt(Register.GetRegisters(registers[0]));
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));

		if (register1 * register2 <= 4294967299.) {
			resultLo = register1 * register2;

			Register.SetRegisters("lo", Integer.toString(resultLo));
		} else {
			resultLo = (register1 * register2) / 2;
			resultHi = resultLo;

			Register.SetRegisters("lo", Integer.toString(resultLo));
			Register.SetRegisters("hi", Integer.toString(resultHi));
		}

		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[0]) + Register.BinaryRegisters(registers[1])
				+ Register.BinaryRegisters("0") + shamt + getFunct();

		System.out.println("mult: " + instruction);
		return instruction;
	}

	public String div_instr() {
		int resultLo;
		int resultHi;
		int register1 = Integer.parseInt(Register.GetRegisters(registers[0]));
		int register2 = Integer.parseInt(Register.GetRegisters(registers[1]));

		resultLo = register1 / register2;
		resultHi = register1 % register2;

		Register.SetRegisters("lo", Integer.toString(resultLo));
		Register.SetRegisters("hi", Integer.toString(resultHi));
		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[0]) + Register.BinaryRegisters(registers[1])
				+ Register.BinaryRegisters("0") + shamt + getFunct();

		System.out.println("div: " + instruction);
		return instruction;
	}

	public String neg_instr() {
		int register = Integer.parseInt(Register.GetRegisters(registers[1]));
		Register.SetRegisters(registers[0], Integer.toString(-register));

		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[1]) + Register.BinaryRegisters(registers[0])
				+ Register.BinaryRegisters("0") + getShamt() + getFunct();

		return instruction;
	}

	public String slt_instr() {
		String result;
		int register1 = Integer.parseInt(Register.GetRegisters(registers[1]));
		int register2 = Integer.parseInt(Register.GetRegisters(registers[2]));

		if (register1 < register2) {
			result = "1";
		} else {
			result = "0";
		}

		Register.SetRegisters(registers[0], result);
		return Instruction_R_Type();
	}

	public String slti_instr() {
		String result;
		int register = Integer.parseInt(Register.GetRegisters(registers[1]));
		int imediato = Integer.parseInt(getImediato(), 2);

		if (register < imediato) {
			result = "1";
		} else {
			result = "0";
		}

		Register.SetRegisters(registers[0], result);

		return Instruction_I_Type();
	}

	public String lw_instr() {
		MemoryLine aux = MainMemory.getMemorySlot(getLineAddress());

		Register.SetRegisters(registers[0], aux.getContent());
		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[1]) + Register.BinaryRegisters(registers[0])
				+ getImediato();

		return instruction;
	}

	public String sw_instr() {
		MainMemory.setMemorySlot(getLineAddress(), Register.GetRegisters(registers[0]));

		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[1]) + Register.BinaryRegisters(registers[0])
				+ getImediato();
		System.out.println("Endereço sw: " + getImediato());

		return instruction;
	}

	public String beq_instr() {
		return Instruction_I_Type();
	}

	public String bne_instr() {
		return Instruction_I_Type();
	}

	public String j_instr() {
		return Instruction_J_Type();
	}

	public String jr_instr() {
		String instruction = "";

		instruction = getOpcode() + Register.BinaryRegisters(registers[0]) + Register.BinaryRegisters("0")
				+ Register.BinaryRegisters("0") + shamt + getFunct();

		System.out.println("jr inst: " + instruction);
		return instruction;
	}

	public String jal_instr() {
		return Instruction_J_Type();
	}

	public String and_instr() {
		int register1 = Integer.parseInt(Register.GetRegisters(registers[1]));
		int register2 = Integer.parseInt(Register.GetRegisters(registers[2]));

		if (register1 == register2) {
			Register.SetRegisters(registers[0], "1");
		} else {
			Register.SetRegisters(registers[0], "0");
		}

		return Instruction_R_Type();
	}

	public String andi_instr() {
		String register = Register.GetRegisters(registers[1]);
		String imediato = Integer.toString(Integer.parseInt(getImediato(), 2));

		if (register.equals(imediato)) {
			Register.SetRegisters(registers[0], "1");
		} else {
			Register.SetRegisters(registers[0], "0");
		}
		return Instruction_I_Type();
	}

	public String or_instr() {
		return Instruction_R_Type();
	}

	public String ori_instr() {
		return Instruction_I_Type();
	}

	public String xor_instr() {
		return Instruction_R_Type();
	}

	public String nor_instr() {
		return Instruction_R_Type();
	}

	public void restartValues() {
		funct = "";
		opcode = "";
		address = "";
		imediato = "";
	}
}
