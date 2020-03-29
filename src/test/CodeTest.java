package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Dictionary.Code;

class CodeTest {

	@Test
	void DictionaryTest() {
		assertEquals(Code.DictionaryCode("ori"), "001101", "Comando ori");
		assertEquals(Code.DictionaryCode("jr"), "001000", "Comando jr");
		assertEquals(Code.DictionaryCode("jal"), "000011", "Comando jal");
		assertEquals(Code.DictionaryCode("add"), "100000", "Comando add");
		assertEquals(Code.DictionaryCode("addi"), "001000", "Comando addi");
		assertEquals(Code.DictionaryCode("xor"), "100110", "Comando xor");
		assertEquals(Code.DictionaryCode("lw"), "100011", "Comando lw");
		assertEquals(Code.DictionaryCode("sw"), "101011", "Comando sw");
		assertEquals(Code.DictionaryCode("beq"), "000100", "Comando beq");
		assertEquals(Code.DictionaryCode("bne"), "000101", "Comando bne");
		assertEquals(Code.DictionaryCode("j"), "000010", "Comando j");
		assertEquals(Code.DictionaryCode("sub"), "100010", "Comando sub");
		assertEquals(Code.DictionaryCode("mult"), "011000", "Comando mult");
		assertEquals(Code.DictionaryCode("div"), "011010", "Comando div");
	}

}
