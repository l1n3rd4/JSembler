package src.test.java.src;

import src.main.java.src.Compiler.Binario;
import src.main.java.src.Compiler.CompilerBinary;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarioTest {
    Binario binario = new Binario();

    @Test
    public void ImediatoTest(){
        binario.setImediato("4");
        assertEquals("0000000000000100", binario.getImediato());
    }

    @Test
    public void AddressTest(){
        binario.setAddress("1024");
        assertEquals("00000000000000010000000000", binario.getAddress());
    }

    @Test
    public void Add_Test(){
        String[] registers = {"s0","s1"};
        binario.setOpcode("sw");
        binario.setName_instr("sw");
        binario.setRegisters(registers);
        binario.setImediato("4");

        assertEquals("10101110001100000000000000000100", binario.instruction_fetch());
    }

    @Test
    public void Mult_Test(){
        String[] registers = {"s0","s1","0"};
        binario.setOpcode("mult");
        binario.setName_instr("mult");
        binario.setRegisters(registers);
        binario.setFunct("mult");

        assertEquals("00000010000100010000000000011000", binario.instruction_fetch());
    }

    
}