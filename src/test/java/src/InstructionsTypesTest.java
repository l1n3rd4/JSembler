/*
 * MIT License
 *
 * Copyright(c) 2020 Leonardo Henrique Guimaraes <leonardo.guimaraeslhg@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
