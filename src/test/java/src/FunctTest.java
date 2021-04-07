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
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctTest {

    @Test
    public void FunctionTest(){
        assertEquals("20", Funct.funct("add"));
        assertEquals("22", Funct.funct("sub"));
        assertEquals("18", Funct.funct("mult"));
        assertEquals("1a", Funct.funct("div"));
        assertEquals("24", Funct.funct("and"));
        assertEquals("25", Funct.funct("or"));
        assertEquals("26", Funct.funct("xor"));
        assertEquals("27", Funct.funct("nor"));
        assertEquals("2a", Funct.funct("slt"));
        assertEquals("00", Funct.funct("sll"));
        assertEquals("02", Funct.funct("srl"));
        assertEquals("08", Funct.funct("jr"));
    }
    
}