package src.test.java.src;

import src.main.java.src.Compiler.Binario;
import src.main.java.src.Compiler.CompilerBinary;
import src.main.java.src.Dictionary.Register;
import src.main.java.src.Memory.MainMemory;

import java.io.IOException;
import java.lang.Exception;
import java.io.FileNotFoundException;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarioTest {
	Binario binario = new Binario();
	
	@Test
	public void ImediatoTest() {
		binario.setImediato("4");
		assertEquals("0000000000000100", binario.getImediato());
	}

	@Test
	public void AddressTest() {
		binario.setAddress("1024");
		assertEquals("00000000000000010000000000", binario.getAddress());
	}
	
	// Função teste para validar comando Save Word
	@Test
	public void Sw_Test() throws FileNotFoundException, IOException {
		MainMemory memory = new MainMemory();
		MainMemory.startMemory();

		Register.SetS0("1024");
		MainMemory.setMemorySlot(Integer.parseInt(Register.GetS0()), "Leo");

		String[] registers = { "s0", "s1" };

		binario.setOpcode("sw");
		binario.setName_instr("sw");
		binario.setRegisters(registers);
		binario.setImediato("4");

		assertEquals("10101110001100000000000000000100", binario.instruction_fetch());
		assertEquals("Leo", MainMemory.getMemorySlot(1024).getContent());
	}

	// Função teste para validar equações de multiplicação
	@Test
	public void Mult_Test() {
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = { "s0", "s1", "0" };

		binario.setOpcode("mult");
		binario.setName_instr("mult");
		binario.setRegisters(registers);
		binario.setFunct("mult");

		assertEquals("00000010000100010000000000011000", binario.instruction_fetch());
		assertEquals("4", Register.GetRegisters("lo"));
	}

	// Função teste para validar equações de subtração
	@Test
	public void sub_Test() {
		Register.SetS0("2");
		Register.SetS1("1");
		Register.SetS2("2");
		String[] registers = { "s0", "s1", "s2" };

		binario.setOpcode("sub");
		binario.setFunct("sub");
		binario.setName_instr("sub");
		binario.setRegisters(registers);

		assertEquals("00000010001100101000000000100010", binario.instruction_fetch());
		assertEquals("-1", Register.GetRegisters("s0"));
	}

	// Função teste para validar equações de adição
	@Test
	public void add_Test() {
		Register.SetS0("2");
		Register.SetS1("2");
		Register.SetS2("2");
		String[] registers = { "s0", "s1", "s2" };

		binario.setOpcode("add");
		binario.setFunct("add");
		binario.setName_instr("add");
		binario.setRegisters(registers);

		assertEquals("00000010001100101000000000100000", binario.instruction_fetch());
		assertEquals("4", Register.GetRegisters("s0"));
	}
	// Função teste para validar equações de divisão
	@Test
	public void div_Test() {
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = { "s0", "s1", "0" };

		binario.setOpcode("div");
		binario.setFunct("div");
		binario.setName_instr("div");
		binario.setRegisters(registers);

		assertEquals("00000010000100010000000000011010", binario.instruction_fetch());
		assertEquals("1", Register.GetRegisters("lo"));
		assertEquals("0", Register.GetRegisters("hi"));
	}
	
	// Função teste para validar comando AND
	@Test
	public void and_Test() {
		Register.SetS0("2");
		Register.SetS1("2");
		Register.SetS2("2");
		String[] registers = { "s0", "s1", "s2" };

		binario.setOpcode("and");
		binario.setFunct("and");
		binario.setName_instr("and");
		binario.setRegisters(registers);

		assertEquals("00000010001100101000000000100100", binario.instruction_fetch());
	}

	// Função teste para validar comando OR
	@Test
	public void or_Test() {
		String[] registers = { "s0", "s1", "s2" };
		binario.setOpcode("or");
		binario.setFunct("or");
		binario.setName_instr("or");
		binario.setRegisters(registers);

		assertEquals("00000010001100101000000000100101", binario.instruction_fetch());
	}
	
	// Função teste para validar instruções do tipo Jump
	@Test
	public void j_Test() {
		binario.setOpcode("j");
		binario.setName_instr("j");
		binario.setAddress("1024");

		assertEquals("00001000000000000000010000000000", binario.instruction_fetch());
	}

	// Função teste para validar instruções do tipo Jump N Link
	@Test
	public void jal_Test() {
		binario.setOpcode("jal");
		binario.setName_instr("jal");
		binario.setAddress("1024");

	        assertEquals("00001100000000000000010000000000", binario.instruction_fetch());
		assertEquals("00001100000000000000010000000000", binario.instruction_fetch());
	}

	// Função teste para validar equações de adição com apenas um registrador (addi)
	@Test
	public void addi_Test() {
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = { "s0", "s1" };
		binario.setRegisters(registers);

		binario.setOpcode("addi");
		binario.setName_instr("addi");
		binario.setImediato("1");

		assertEquals("00100010001100000000000000000001", binario.instruction_fetch());
		assertEquals("3", Register.GetRegisters("s0"));
	}
	// Função teste para validar instrução andi
	@Test
	public void andi_Test() {
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = { "s0", "s1" };
		binario.setRegisters(registers);

		binario.setOpcode("andi");
		binario.setName_instr("andi");
		binario.setImediato("1");

		assertEquals("00110010001100000000000000000001", binario.instruction_fetch());
	}

	@Test
	public void ori_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = {"s0", "s1"};
		
		binario.setRegisters(registers);
		binario.setOpcode("ori");
		binario.setName_instr("ori");
		binario.setImediato("1");
		
		assertEquals("00110110001100000000000000000001", binario.instruction_fetch());	
	}
	// Função teste para validar instrução slti
	@Test
	public void slti_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = {"s0","s1"};
		
		binario.setRegisters(registers);
		binario.setOpcode("slti");
		binario.setName_instr("slti");
		binario.setImediato("1");

		assertEquals("00101010001100000000000000000001", binario.instruction_fetch());
	}
	// Função teste para validar instrução beq (if)
	@Test
	public void beq_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = {"s0", "s1"};

		binario.setRegisters(registers);
		binario.setOpcode("beq");
		binario.setName_instr("beq");
		binario.setImediato("4");

		assertEquals("00010010001100000000000000000100", binario.instruction_fetch());
	}
	// Função teste para validar instrução bne (if not)
	@Test
	public void bne_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers ={"s0", "s1"};
		binario.setRegisters(registers);

		binario.setOpcode("bne");
		binario.setName_instr("bne");
		binario.setImediato("4");

		assertEquals("00010110001100000000000000000100", binario.instruction_fetch());
	}
	// Função teste para validar istrução load word
	@Test
	public void lw_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = {"s0", "s1"};
		binario.setRegisters(registers);

		binario.setOpcode("lw");
		binario.setName_instr("lw");
		binario.setImediato("4");

		assertEquals("10001110001100000000000000000100", binario.instruction_fetch());

	}
	// Função teste para validar instrução xor
	@Test
	public void xor_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		Register.SetS2("2");
		String[] registers = {"s0","s1","s2"};

		binario.setRegisters(registers);
		binario.setOpcode("xor");
		binario.setFunct("xor");
		binario.setName_instr("xor");

		assertEquals("00000010001100101000000000100110", binario.instruction_fetch());
	}
	// Função teste para validar instrução nor
	@Test
	public void nor_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		Register.SetS2("2");
		String[] registers = {"s0", "s1", "s2"};

		binario.setRegisters(registers);
		binario.setOpcode("nor");
		binario.setName_instr("nor");
		binario.setFunct("nor");

		assertEquals("00000010001100101000000000100111", binario.instruction_fetch());
	}
	// Função teste para validar instrução sll
	@Test
	public void sll_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = {"s0", "s1"};
		binario.setShamt("1");

		binario.setRegisters(registers);
		binario.setOpcode("sll");
		binario.setFunct("sll");
		binario.setName_instr("sll");

		assertEquals("00000000000100011000000001000000", binario.instruction_fetch());
	}
	// Função teste para validar instrução slr
	@Test 
	public void srl_Test(){
		Register.SetS0("2");
		Register.SetS1("2");
		String[] registers = {"s0", "s1"};
		binario.setRegisters(registers);

		binario.setOpcode("srl");
		binario.setFunct("srl");
		binario.setName_instr("srl");
		binario.setShamt("1");

		assertEquals("00000000000100011000000001000010", binario.instruction_fetch());
	}
 
}
