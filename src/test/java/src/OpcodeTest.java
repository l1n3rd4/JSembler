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
}
	

