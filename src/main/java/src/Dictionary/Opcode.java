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

package src.main.java.src.Dictionary;

public class Opcode {

	public static String opcode(String code) {
		switch (code) {
		case "ori":
			return "001101";
		case "jr":
			return "000000";
		case "jal":
			return "000011";
		case "add":
			return "000000";
		case "addi":
			return "001000";
		case "xor":
			return "000000";
		case "lw":
			return "100011";
		case "sw":
			return "101011";
		case "beq":
			return "000100";
		case "bne":
			return "000101";
		case "j":
			return "000010";
		case "sub":
			return "000000";
		case "mult":
			return "000000";
		case "div":
			return "000000";
		case "and":
			return "000000";
		case "andi":
			return "001100";
		case "or":
			return "000000";
		case "slti":
			return "001010";
		case "sll":
			return "000000";
		case "nor":
			return "000000";
		case "slt":
			return "000000";
		case "srl":
			return "000000";
		case "neg":
		    return "000000";
		default:
			return null;
		}
	}

}
