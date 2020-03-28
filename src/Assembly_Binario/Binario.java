package Assembly_Binario;

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

	public String Assembly_Para_Binario(String opcao) {
		switch (opcao) {
		case "sll":
			setTipoInstrucao('R');
			return "000000";
		case "srl":
			setTipoInstrucao('R');
			return "000010";
		case "j":
			setTipoInstrucao('J');
			return "000010";
		case "jal":
			setTipoInstrucao('J');
			return "000011";
		case "sra":
			setTipoInstrucao('R');
			return "000011";
		case "beq":
			setTipoInstrucao('I');
			return "000100";
		case "sllv":
			setTipoInstrucao('R');
			return "000100";
		case "bne":
			setTipoInstrucao('I');
			return "000101";
		case "blez":
			setTipoInstrucao(' ');
			return "000110";
		case "srlv":
			setTipoInstrucao(' ');
			return "000110";
		case "bgtz":
			setTipoInstrucao(' ');
			return "000111";
		case "srav":
			setTipoInstrucao(' ');
			return "000111";
		case "addi":
			setTipoInstrucao('I');
			return "001000";
		case "jr":
			setTipoInstrucao('R');
			return "001000";
		case "addiu":
			setTipoInstrucao('I');
			return "001001";
		case "jalr":
			setTipoInstrucao(' ');
			return "001001";
		case "slti":
			setTipoInstrucao('I');
			return "001010";
		case "movz":
			setTipoInstrucao(' ');
			return "001010";
		case "sltiu":
			setTipoInstrucao('I');
			return "001011";
		case "movn":
			setTipoInstrucao(' ');
			return "001011";
		case "andi":
			setTipoInstrucao('I');
			return "001100";
		case "syscall":
			setTipoInstrucao(' ');
			return "001100";
		case "ori":
			setTipoInstrucao('I');
			return "001101";
		case "break":
			setTipoInstrucao(' ');
			return "001101";
		case "xori":
			setTipoInstrucao(' ');
			return "001110";
		case "lui":
			setTipoInstrucao('I');
			return "001111";
		case "sync":
			setTipoInstrucao(' ');
			return "001111";
		case "mfhi":
			setTipoInstrucao(' ');
			return "010000";
		case "mthi":
			setTipoInstrucao(' ');
			return "010001";
		case "mflo":
			setTipoInstrucao(' ');
			return "010010";
		case "mtlo":
			setTipoInstrucao(' ');
			return "010011";
		case "mult":
			setTipoInstrucao(' ');
			return "011000";
		case "multu":
			setTipoInstrucao(' ');
			return "011001";
		case "div":
			setTipoInstrucao(' ');
			return "011010";
		case "divu":
			setTipoInstrucao(' ');
			return "011011";
		case "add":
			setTipoInstrucao('R');
			return "100000";
		case "lb":
			setTipoInstrucao(' ');
			return "100000";
		case "addu":
			setTipoInstrucao('R');
			return "100001";
		case "lh":
			setTipoInstrucao(' ');
			return "100001";
		case "lwl":
			setTipoInstrucao(' ');
			return "100010";
		case "sub":
			setTipoInstrucao('R');
			return "100010";
		case "lw":
			setTipoInstrucao('I');
			return "100011";
		case "subu":
			setTipoInstrucao('R');
			return "100011";
		case "lbu":
			setTipoInstrucao('I');
			return "100100";
		case "and":
			setTipoInstrucao('R');
			return "100100";
		case "lhu":
			setTipoInstrucao('I');
			return "100101";
		case "or":
			setTipoInstrucao('R');
			return "100101";
		case "lwr":
			setTipoInstrucao(' ');
			return "100110";
		case "xor":
			setTipoInstrucao(' ');
			return "100110";
		case "nor":
			setTipoInstrucao('R');
			return "100111";
		case "sb":
			setTipoInstrucao('I');
			return "101000";
		case "sh":
			setTipoInstrucao('I');
			return "101001";
		case "slt":
			setTipoInstrucao('R');
			return "101010";
		case "swl":
			setTipoInstrucao(' ');
			return "101010";
		case "sw":
			setTipoInstrucao('I');
			return "101011";
		case "sltu":
			setTipoInstrucao('R');
			return "101011";
		case "swr":
			setTipoInstrucao(' ');
			return "101110";
		case "cache":
			setTipoInstrucao(' ');
			return "101110";
		case "ll":
			setTipoInstrucao('I');
			return "110000";
		case "tge":
			setTipoInstrucao(' ');
			return "110000";
		case "lwc1":
			setTipoInstrucao(' ');
			return "110001";
		case "tgeu":
			setTipoInstrucao(' ');
			return "110001";
		case "lwc2":
			setTipoInstrucao(' ');
			return "110010";
		case "tlt":
			setTipoInstrucao(' ');
			return "110010";
		case "pref":
			setTipoInstrucao(' ');
			return "110011";
		case "tltu":
			setTipoInstrucao(' ');
			return "110011";
		case "teq":
			setTipoInstrucao(' ');
			return "110100";
		case "ldc1":
			setTipoInstrucao(' ');
			return "110101";
		case "ldc2":
			setTipoInstrucao(' ');
			return "110110";
		case "tne":
			setTipoInstrucao(' ');
			return "110110";
		case "sc":
			setTipoInstrucao('I');
			return "111000";
		case "swc1":
			setTipoInstrucao(' ');
			return "111001";
		case "swc2":
			setTipoInstrucao(' ');
			return "111010";
		case "sdc1":
			setTipoInstrucao(' ');
			return "111101";
		case "sdc2":
			setTipoInstrucao(' ');
			return "111110";
		default:
			return "inexistente";
		}
	}

	public String Registradores_Binario(String opcao) {
		switch (opcao) {
		case "$zero":
		case "zero":
			return "000000";
		case "$at":
		case "at":
			return "000001";
		case "$v0":
		case "v0":
			return "000010";
		case "$v1":
		case "v1":
			return "000011";
		case "$a0":
		case "a0":
			return "000100";
		case "$a1":
		case "a1":
			return "000101";
		case "$a2":
		case "a2":
			return "000110";
		case "$a3":
		case "a3":
			return "000111";
		case "$t0":
		case "t0":
			return "001000";
		case "$t1":
		case "t1":
			return "001001";
		case "$t2":
		case "t2":
			return "001010";
		case "$t3":
		case "t3":
			return "001011";
		case "$t4":
		case "t4":
			return "001100";
		case "$t5":
		case "t5":
			return "001101";
		case "$t6":
		case "t6":
			return "001110";
		case "$t7":
		case "t7":
			return "001111";
		case "$s0":
		case "s0":
			return "010000";
		case "$s1":
		case "s1":
			return "010001";
		case "$s2":
		case "s2":
			return "010010";
		case "$s3":
		case "s3":
			return "010011";
		case "$s4":
		case "s4":
			return "010100";
		case "$s5":
		case "s5":
			return "010101";
		case "$s6":
			return "010110";
		case "$s7":
		case "s7":
			return "010111";
		case "$t8":
		case "t8":
			return "011000";
		case "$t9":
		case "t9":
			return "011001";
		case "$k0":
		case "k0":
			return "011010";
		case "$k1":
		case "k1":
			return "011011";
		case "$gp":
		case "gp":
			return "011100";
		case "$sp":
		case "sp":
			return "011101";
		case "$fp":
		case "fp":
			return "011110";
		case "$ra":
		case "ra":
			return "011111";
		default:
			return "inexistente";
		}
	}

	public char getTipoInstrucao() {
		return tipoInstrucao;
	}

	private void setTipoInstrucao(char tipoInstrucao) {
		this.tipoInstrucao = tipoInstrucao;
	}

	public String getShamt() {
		return shamt;
	}

	public void setImediato(String imediato) {
//        char[] charImediato = new char[10];

	}

	public String TipoInstrucao() {
		if (getTipoInstrucao() == 'R') {
			return Assembly_Para_Binario(opcao) + Registradores_Binario(PrimeiroRegistrador)
					+ Registradores_Binario(SegundoRegistrador) + Registradores_Binario(RegistradorDestino) + shamt
					+ getFunct(opcao);

		} else if (getTipoInstrucao() == 'I') {
			return (Assembly_Para_Binario(opcao) + Registradores_Binario(PrimeiroRegistrador)
					+ Registradores_Binario(RegistradorDestino) + imediato);

		} else if (getTipoInstrucao() == 'J') {
			return (Assembly_Para_Binario(opcao));
		} else {
			return null;
		}
	}

	private String getFunct(String opcao2) {
		return null;
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
