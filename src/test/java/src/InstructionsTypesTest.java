package src.test.java.src;

import src.main.java.src.Dictionary.InstructionsTypes;
import org.junit.Test;
import static org.junit.Assert.*;

public class InstructionsTypesTest{

	@Test
	public void typesTest(){
		assertEquals("I", InstructionsTypes.getType("ori"));
		assertEquals("R", InstructionsTypes.getType("jr"));
		assertEquals("J", InstructionsTypes.getType("jal"));
		assertEquals("R", InstructionsTypes.getType("add"));
		assertEquals("I", InstructionsTypes.getType("addi"));
		assertEquals("R", InstructionsTypes.getType("xor"));
		assertEquals("I", InstructionsTypes.getType("lw"));
		assertEquals("I", InstructionsTypes.getType("sw"));
		assertEquals("I", InstructionsTypes.getType("beq"));
		assertEquals("I", InstructionsTypes.getType("bne"));
		assertEquals("J", InstructionsTypes.getType("j"));
		assertEquals("R", InstructionsTypes.getType("sub"));
		assertEquals("R", InstructionsTypes.getType("mult"));
		assertEquals("R", InstructionsTypes.getType("div"));
		assertEquals("R", InstructionsTypes.getType("and"));
		assertEquals("I", InstructionsTypes.getType("andi"));
		assertEquals("R", InstructionsTypes.getType("or"));
		assertEquals("I", InstructionsTypes.getType("addiu"));
		assertEquals("R", InstructionsTypes.getType("jalr"));
		assertEquals("R", InstructionsTypes.getType("slt"));
		assertEquals("I", InstructionsTypes.getType("slti"));
		assertEquals("0", InstructionsTypes.getType("movz"));
		assertEquals("I", InstructionsTypes.getType("sltiu"));
		assertEquals("R", InstructionsTypes.getType("nor"));
		assertEquals("R", InstructionsTypes.getType("sll"));
		assertEquals("R", InstructionsTypes.getType("srl"));

	}
}
