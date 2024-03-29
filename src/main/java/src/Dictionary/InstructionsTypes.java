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

public class InstructionsTypes{
  public static String getType(String type){
    switch(type){
      case "ori":
        return "I";
      case "jr":  
        return "R";
      case "jal":
        return "J";
      case "add":
        return "R";
      case "addi":
        return "I";
      case "xor":
        return "R";
      case "lw":
        return "I";
      case "sw":
        return "I";
      case "beq":
        return "I";
      case "bne":
        return "I";
      case "j":
        return "J";
      case "sub":
        return "R";
      case "mult":
        return "R";
      case "div":
        return "R";
      case "and":
        return "R";
      case "andi":
        return "I";
      case "or":
        return "R";      
      case "addiu":
        return "I";
      case "jalr":
        return "R";
      case "slt":
    	return "R";
      case "slti":
        return "I";
      case "movz":
        return "0";
      case "sltiu":
        return "I";
      case "nor":
    	  return "R";
      case "sll":
    	  return "R";
      case "srl":
      	return "R";
      default: return null;
    }
  }
}
