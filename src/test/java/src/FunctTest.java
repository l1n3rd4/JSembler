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