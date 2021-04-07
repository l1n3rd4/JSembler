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

import src.main.java.src.Archives.SaveArchieve;
import java.io.IOException;

public class Register {
	private static String zero = "000000";
	private static String at;
	private static String v0;
	private static String v1;
	private static String a0;
	private static String a1;
	private static String a2;
	private static String a3;
	private static String t0;
	private static String t1;
	private static String t2;
	private static String t3;
	private static String t4;
	private static String t5;
	private static String t6;
	private static String t7;
	private static String s0;
	private static String s1;
	private static String s2;
	private static String s3;
	private static String s4;
	private static String s5;
	private static String s6;
	private static String s7;
	private static String t8;
	private static String t9;
	private static String k0;
	private static String k1;
	private static String gp;
	private static String sp;
	private static String fp;
	private static String ra;
	private static String lo;
	private static String hi;

	private SaveArchieve save;

	public Register() throws IOException {
		save = new SaveArchieve("registers.out");
		registersInit();
	}

	public static void SetHi(String content) {
		hi = content;
	}

	public static String GetHi() {
		return hi;
	}

	public static void SetLo(String content) {
		lo = content;
	}

	public static String GetLo() {
		return lo;
	}

	public static String GetZero() {
		return zero;
	}

	public static void SetAt(String content) {
		at = content;
	}

	public static String GetAt() {
		return at;
	}

	public static void SetV0(String content) {
		v0 = content;
	}

	public static String GetV0() {
		return v0;
	}

	public static void SetV1(String content) {
		v1 = content;
	}

	public static String GetV1() {
		return v1;
	}

	public static void SetA0(String content) {
		a0 = content;
	}

	public static String GetA0() {
		return a0;
	}

	public static void SetA1(String content) {
		a1 = content;
	}

	public static String GetA1() {
		return a1;
	}

	public static void SetA2(String content) {
		a2 = content;
	}

	public static String GetA2() {
		return a2;
	}

	public static void SetA3(String content) {
		a3 = content;
	}

	public static String GetA3() {
		return a3;
	}

	public static void SetT0(String content) {
		t0 = content;
	}

	public static String GetT0() {
		return t0;
	}

	public static void SetT1(String content) {
		t1 = content;
	}

	public static String GetT1() {
		return t1;
	}

	public static void SetT2(String content) {
		t2 = content;
	}

	public static String GetT2() {
		return t2;
	}

	public static void SetT3(String content) {
		t3 = content;
	}

	public static String GetT3() {
		return t3;
	}

	public static void SetT4(String content) {
		t4 = content;
	}

	public static String GetT4() {
		return t4;
	}

	public static void SetT5(String content) {
		t5 = content;
	}

	public static String GetT5() {
		return t5;
	}

	public static void SetT6(String content) {
		t6 = content;
	}

	public static String GetT6() {
		return t6;
	}

	public static void SetT7(String content) {
		t7 = content;
	}

	public static String GetT7() {
		return t7;
	}

	public static void SetS0(String content) {
		s0 = content;
	}

	public static String GetS0() {
		return s0;
	}

	public static void SetS1(String content) {
		s1 = content;
	}

	public static String GetS1() {
		return s1;
	}

	public static void SetS2(String content) {
		s2 = content;
	}

	public static String GetS2() {
		return s2;
	}

	public static void SetS3(String content) {
		s3 = content;
	}

	public static String GetS3() {
		return s3;
	}

	public static void SetS4(String content) {
		s4 = content;
	}

	public static String GetS4() {
		return s4;
	}

	public static void SetS5(String content) {
		s5 = content;
	}

	public static String GetS5() {
		return s5;
	}

	public static void SetS6(String content) {
		s6 = content;
	}

	public static String GetS6() {
		return s6;
	}

	public static void SetS7(String content) {
		s7 = content;
	}

	public static String GetS7() {
		return s7;
	}

	public static void SetT8(String content) {
		t8 = content;
	}

	public static String GetT8() {
		return t8;
	}

	public static void SetT9(String content) {
		t9 = content;
	}

	public static String GetT9() {
		return t9;
	}

	public static void SetK0(String content) {
		k0 = content;
	}

	public static String GetK0() {
		return k0;
	}

	public static void SetK1(String content) {
		k1 = content;
	}

	public static String GetK1() {
		return k1;
	}

	public static void SetGp(String content) {
		gp = content;
	}

	public static String GetGp() {
		return gp;
	}

	public static void SetSp(String content) {
		sp = content;
	}

	public static String GetSp() {
		return sp;
	}

	public static void SetFp(String content) {
		fp = content;
	}

	public static String GetFp() {
		return fp;
	}

	public static void SetRa(String content) {
		ra = content;
	}

	public static String GetRa() {
		return ra;
	}

	public static void SetRegisters(String register, String content) {
		System.out.println("Função BinaryRegisters: " + register);

		switch (register) {
		case "$at":
		case "at":
			SetAt(content);
			break;
		case "$v0":
		case "v0":
			SetV0(content);
			break;
		case "$v1":
		case "v1":
			SetV1(content);
			break;
		case "$a0":
		case "a0":
			SetA0(content);
			break;
		case "$a1":
		case "a1":
			SetA1(content);
			break;
		case "$a2":
		case "a2":
			SetA2(content);
			break;
		case "$a3":
		case "a3":
			SetA3(content);
			break;
		case "$t0":
		case "t0":
			SetT0(content);
			break;
		case "$t1":
		case "t1":
			SetT1(content);
			break;
		case "$t2":
		case "t2":
			SetT2(content);
			break;
		case "$t3":
		case "t3":
			SetT3(content);
			break;
		case "$t4":
		case "t4":
			SetT4(content);
			break;
		case "$t5":
		case "t5":
			SetT5(content);
			break;
		case "$t6":
		case "t6":
			SetT6(content);
			break;
		case "$t7":
		case "t7":
			SetT7(content);
			break;
		case "$s0":
		case "s0":
			SetS0(content);
			break;
		case "$s1":
		case "s1":
			SetS1(content);
			break;
		case "$s2":
		case "s2":
			SetS2(content);
			break;
		case "$s3":
		case "s3":
			SetS3(content);
			break;
		case "$s4":
		case "s4":
			SetS4(content);
			break;
		case "$s5":
		case "s5":
			SetS5(content);
			break;
		case "$s6":
			SetS6(content);
			break;
		case "$s7":
		case "s7":
			SetS7(content);
			break;
		case "$t8":
		case "t8":
			SetT8(content);
			break;
		case "$t9":
		case "t9":
			SetT9(content);
			break;
		case "$k0":
		case "k0":
			SetK0(content);
			break;
		case "$k1":
		case "k1":
			SetK1(content);
			break;
		case "$gp":
		case "gp":
			SetGp(content);
			break;
		case "$sp":
		case "sp":
			SetSp(content);
			break;
		case "$fp":
		case "fp":
			SetFp(content);
			break;
		case "$ra":
		case "ra":
			SetRa(content);
			break;
		case "lo":
		case "$lo":
			SetLo(content);
			break;
		case "hi":
		case "$hi":
			SetHi(content);
			break;
		}
	}

	public static String GetRegisters(String option) {
		System.out.println("Função GetRegisters: " + option);

		switch (option) {
		case "$zero":
		case "zero":
			return GetZero();
		case "$at":
		case "at":
			return GetAt();
		case "$v0":
		case "v0":
			return GetV0();
		case "$v1":
		case "v1":
			return GetV1();
		case "$a0":
		case "a0":
			return GetA0();
		case "$a1":
		case "a1":
			return GetA1();
		case "$a2":
		case "a2":
			return GetA2();
		case "$a3":
		case "a3":
			return GetA3();
		case "$t0":
		case "t0":
			return GetT0();
		case "$t1":
		case "t1":
			return GetT1();
		case "$t2":
		case "t2":
			return GetT2();
		case "$t3":
		case "t3":
			return GetT3();
		case "$t4":
		case "t4":
			return GetT4();
		case "$t5":
		case "t5":
			return GetT5();
		case "$t6":
		case "t6":
			return GetT6();
		case "$t7":
		case "t7":
			return GetT7();
		case "$s0":
		case "s0":
			return GetS0();
		case "$s1":
		case "s1":
			return GetS1();
		case "$s2":
		case "s2":
			return GetS2();
		case "$s3":
		case "s3":
			return GetS3();
		case "$s4":
		case "s4":
			return GetS4();
		case "$s5":
		case "s5":
			return GetS5();
		case "$s6":
			return GetS6();
		case "$s7":
		case "s7":
			return GetS7();
		case "$t8":
		case "t8":
			return GetT8();
		case "$t9":
		case "t9":
			return GetT9();
		case "$k0":
		case "k0":
			return GetK0();
		case "$k1":
		case "k1":
			return GetK1();
		case "$gp":
		case "gp":
			return GetGp();
		case "$sp":
		case "sp":
			return GetSp();
		case "$fp":
		case "fp":
			return GetFp();
		case "$ra":
		case "ra":
			return GetRa();
		case "lo":
		case "$lo":
			return GetLo();
		case "hi":
		case "$hi":
			return GetHi();
		default:
			return null;
		}
	}

	public static String BinaryRegisters(String option) {
		switch (option) {
		case "$zero":
		case "zero":
			return "00000";
		case "$at":
		case "at":
			return "00001";
		case "$v0":
		case "v0":
			return "00010";
		case "$v1":
		case "v1":
			return "00011";
		case "$a0":
		case "a0":
			return "00100";
		case "$a1":
		case "a1":
			return "00101";
		case "$a2":
		case "a2":
			return "00110";
		case "$a3":
		case "a3":
			return "00111";
		case "$t0":
		case "t0":
			return "01000";
		case "$t1":
		case "t1":
			return "01001";
		case "$t2":
		case "t2":
			return "01010";
		case "$t3":
		case "t3":
			return "01011";
		case "$t4":
		case "t4":
			return "01100";
		case "$t5":
		case "t5":
			return "01101";
		case "$t6":
		case "t6":
			return "01110";
		case "$t7":
		case "t7":
			return "01111";
		case "$s0":
		case "s0":
			return "10000";
		case "$s1":
		case "s1":
			return "10001";
		case "$s2":
		case "s2":
			return "10010";
		case "$s3":
		case "s3":
			return "10011";
		case "$s4":
		case "s4":
			return "10100";
		case "$s5":
		case "s5":
			return "10101";
		case "$s6":
			return "10110";
		case "$s7":
		case "s7":
			return "10111";
		case "$t8":
		case "t8":
			return "11000";
		case "$t9":
		case "t9":
			return "11001";
		case "$k0":
		case "k0":
			return "11010";
		case "$k1":
		case "k1":
			return "11011";
		case "$gp":
		case "gp":
			return "11100";
		case "$sp":
		case "sp":
			return "11101";
		case "$fp":
		case "fp":
			return "11110";
		case "$ra":
		case "ra":
			return "11111";
		case "0":
			return "00000";
		default:
			return null;
		}
	}

	public void registersInit() {
		String content = "000000";

		SetAt(content);
		SetV0(content);
		SetV1(content);
		SetA0(content);
		SetA1(content);
		SetA2(content);
		SetA3(content);
		SetT0(content);
		SetT1(content);
		SetT2(content);
		SetT3(content);
		SetT4(content);
		SetT5(content);
		SetT6(content);
		SetT7(content);
		SetS0(content);
		SetS1(content);
		SetS2(content);
		SetS3(content);
		SetS4(content);
		SetS5(content);
		SetS6(content);
		SetS7(content);
		SetT8(content);
		SetT9(content);
		SetK0(content);
		SetK1(content);
		SetGp(content);
		SetFp(content);
		SetSp(content);
		SetRa(content);
		SetLo(content);
		SetHi(content);
	}

	public void registerSaveArchive() throws IOException{
		try {
			String registers = "";

			registers = "Zero " + "0x" + GetZero() + "\n"
					+ "at " + "0x" + GetAt() + "\n"
					+ "v0 " + "0x" + GetV0() + "\n"
					+ "v1 " + "0x" + GetV1() + "\n"
					+ "a0 " + "0x" + GetA0() + "\n"
					+ "a1 " + "0x" + GetA1() + "\n"
					+ "a2 " + "0x" + GetA2() + "\n"
					+ "a3 " + "0x" + GetA3() + "\n"
					+ "t0 " + "0x" + GetT0() + "\n"
					+ "t1 " + "0x" + GetT1() + "\n"
					+ "t2 " + "0x" + GetT2() + "\n"
					+ "t3 " + "0x" + GetT3() + "\n"
					+ "t4 " + "0x" + GetT4() + "\n"
					+ "t5 " + "0x" + GetT5() + "\n"
					+ "t6 " + "0x" + GetT6() + "\n"
					+ "t7 " + "0x" + GetT7() + "\n"
					+ "s0 " + "0x" + GetS0() + "\n"
					+ "s1 " + "0x" + GetS1() + "\n"
					+ "s2 " + "0x" + GetS2() + "\n"
					+ "s3 " + "0x" + GetS3() + "\n"
					+ "s4 " + "0x" + GetS4() + "\n"
					+ "s5 " + "0x" + GetS5() + "\n"
					+ "s6 " + "0x" + GetS6() + "\n"
					+ "s7 " + "0x" + GetS7() + "\n"
					+ "t8 " + "0x" + GetT8() + "\n"
					+ "t9 " + "0x" + GetT9() + "\n"
					+ "k0 " + "0x" + GetK0() + "\n"
					+ "k1 " + "0x" + GetK1() + "\n"
					+ "gp " + "0x" + GetGp() + "\n"
					+ "sp " + "0x" + GetSp() + "\n"
					+ "fp " + "0x" + GetFp() + "\n"
					+ "ra " + "0x" + GetRa() + "\n"
					+ "lo " + "0x" + GetLo() + "\n"
					+ "hi " + "0x" + GetHi() + "\n";

			save.write(registers);
			save.ArchiveClose();
		} catch (IOException e){
			throw e;
		}
	}
}
