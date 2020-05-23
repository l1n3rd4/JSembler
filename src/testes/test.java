package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Dictionary.Opcode;

class test {

	@Test
	void DictionaryTest() {
		assertEquals(Opcode.opcode("ori"), "001101", "Comando ori");
		assertEquals(Opcode.opcode("jr"), "001000", "Comando jr");
		assertEquals(Opcode.opcode("jal"), "000011", "Comando jal");
		assertEquals(Opcode.opcode("add"), "000000", "Comando add");
		assertEquals(Opcode.opcode("addi"), "001000", "Comando addi");
		assertEquals(Opcode.opcode("xor"), "100110", "Comando xor");
		assertEquals(Opcode.opcode("lw"), "100011", "Comando lw");
		assertEquals(Opcode.opcode("sw"), "101011", "Comando sw");
		assertEquals(Opcode.opcode("beq"), "000100", "Comando beq");
		assertEquals(Opcode.opcode("bne"), "000101", "Comando bne");
		assertEquals(Opcode.opcode("j"), "000010", "Comando j");
		assertEquals(Opcode.opcode("sub"), "100010", "Comando sub");
		assertEquals(Opcode.opcode("mult"), "011000", "Comando mult");
		assertEquals(Opcode.opcode("div"), "011010", "Comando div");
	}

}
