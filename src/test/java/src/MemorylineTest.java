package src.test.java.src;

import src.main.java.src.Memory.MemoryLine;
import org.junit.Test;
import static org.junit.Assert.*;

public class MemorylineTest {
    
    @Test
    public void MemoryLine(){
        MemoryLine memory = new MemoryLine("0x00","0001");

        assertEquals("0x00", memory.getAddress());
        assertEquals("0001", memory.getContent());
    }
}