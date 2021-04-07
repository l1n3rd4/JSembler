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

public class Funct {
	public static String funct(String code) {
		switch (code) {
		case "ori":
			return "d";
		case "jr":
			return "08";
		case "jal":
			return "3";
		case "add":
			return "20";
		case "addi":
			return "0";
		case "xor":
			return "26";
		case "lw":
			return "23";
		case "sw":
			return "2b";
		case "beq":
			return "4";
		case "bne":
			return "5";
		case "j":
			return "2";
		case "sub":
			return "22";
		case "mult":
			return "18";
		case "div":
			return "1a";
		case "and":
			return "24";
		case "andi":
			return "c";
		case "or":
			return "25";			
		case "addiu":
			return "9";
		case "jalr":
			return "0";
		case "slt":
			return "2a";
		case "slti":
			return "a";
		case "movz":
			return "0";
		case "sltiu":
			return "b";
		case "nor":
			return "27";
		case "sll":
			return "00";
		case "srl":
			return "02";
		case "neg":
		    return "7";
		}
		return null;
	}

}
