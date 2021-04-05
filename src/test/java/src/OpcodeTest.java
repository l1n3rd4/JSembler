package src.test.java.src;

import src.main.java.src.Dictionary.Funct;
import src.main.java.src.Dictionary.InstructionsTypes;
import src.main.java.src.Dictionary.Opcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class OpcodeTest {

	@Test
	public void OpcodeTest(){
		assertEquals("001101", Opcode.opcode("ori"));
		assertEquals("000000", Opcode.opcode("jr"));
		assertEquals("000011", Opcode.opcode("jal"));
		assertEquals("000000", Opcode.opcode("add"));
		assertEquals("001000", Opcode.opcode("addi"));
		assertEquals("000000", Opcode.opcode("xor"));
		assertEquals("100011", Opcode.opcode("lw"));
		assertEquals("101011", Opcode.opcode("sw"));
     	assertEquals("000100", Opcode.opcode("beq"));
		assertEquals("000101", Opcode.opcode("bne"));
		assertEquals("000010", Opcode.opcode("j"));
		assertEquals("000000", Opcode.opcode("sub"));
		assertEquals("000000", Opcode.opcode("mult"));
		assertEquals("000000", Opcode.opcode("div"));
	}

/*
	@Test
	public void FunctTest(){
		assertEquals("d", Funct.funct("ori"));
	}
*/
}
	

