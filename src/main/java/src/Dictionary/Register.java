package src.main.java.src.Dictionary;

public class Register {
	private String zero;
	private String at;
	private String v0;
	private String v1;
	private String a0;
	private String a1;
	private String a2;
	private String a3;
	private String t0;
	private String t1;
	private String t2;
	private String t3;
	private String t4;
	private String t5;
	private String t6;
	private String t7;
	private String s0;
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;
	private String s6;
	private String s7;
	private String t8;
	private String t9;
	private String k0;
	private String k1;
	private String gp;
	private String sp;
	private String fp;
	private String ra;

	public String GetZero(){
		return zero;
	}

	public void SetAt(String at){
		this.at = at;
	} 

	public String GetAt(){
		return at;
	}	

	public void SetV0(String v0){
                this.v0 = v0;
        }
   
        public String GetV0(){
                return v0;
 	}

	public void SetV1(String v1){
                this.v1 = v1;
        }

	public String GetV1(){
	       return v1;
   	}

	public void SetA0(String a0){
               this.a0 = a0;
        }

        public String GetA0(){
              return a0;
        }

	public void SetA1(String a1){
              this.a1 = a1;
        }
   
	public String GetA1(){
             return a1;
        }

	public void SetA2(String a2){
             this.a2 = a2;
        }

        public String GetA2(){
              return a2;
        }

	public void SetA3(String a3){
	      this.a3 = a3;
        }

	public String GetA3(){
   	      return a3;
	}

	public void SetT0(String t0){
		this.t0 = t0;
        }

        public String GetT0(){
        	return t0;
        }	

	public void SetT1(String t1){
		this.t1 = t1;
	}
   
        public String GetT1(){
		return t1;
        }

	public void SetT2(String t2){
	        this.t2 = t2; 
	}
  
   	public String GetT2(){
		return t2;
   	}

	public void SetT3(String t3){
   	     this.t3 = t3;
        }
   
        public String GetT3(){
   	     return t3;
        }

	public void SetT4(String t4){
		this.t4 = t4;
	}
   
	public String GetT4(){
		return t4;
        }
	
	public void SetT5(String t5){
                this.t5 = t5;
        }

        public String GetT5(){
                return t5;
        }

	public void SetT6(String t6){
		this.t6 = t6;
        }

        public String GetT6(){
		return t6;
   	}

	public void SetT7(String t7){
		this.t7 = t7;
        }

	public String GetT7(){
		return t7;
        }

	public void SetS0(String s0){
		this.s0 = s0;
   	}
   
        public String GetS0(){
                return s0;
        }

	public void SetS1(String s1){
		this.s1 = s1;
        }
  
        public String GetS1(){
 	       return s1;
        }

	public void SetS2(String s2){
	        this.s2 = s2;
        }

   	public String GetS2(){
		return s2;
        }

	public void SetS3(String s3){
		this.s3 = s3;
        }

        public String GetS3(){
               return s3;
        }

	public void SetS4(String s4){
	        this.s4 = s4;
        }
   
        public String GetS4(){
	        return s4;
        }

	public void SetS5(String s5){
	        this.s5 = s5;
        }

        public String GetS5(){
	       return s5;
        }

	public void SetS6(String s6){
		this.s6 = s6;
        }
   
        public String GetS6(){
	        return s6;
	}

	public void SetS7(String s7){
               this.s7 = s7;
	}
   
        public String GetS7(){
               return s7;
        }

	public void SetT8(String t8){
	       this.t8 = t8;
       }

       public String GetT8(){
               return t8;
       }
	
       public void SetT9(String t9){
	       this.t9 = t9;
       }

       public String GetT9(){
               return t9;
       }

       public void SetK0(String k0){
		this.k0 = k0;
       }
   
       public String GetK0(){
              return k0;
       }

       public void SetK1(String k1){
	       this.k1 = k1;
       }
   
       public String GetK1(){
               return k1;
       }

       public void SetGp(String gp){
               this.gp = gp;
       }
   
       public String GetGp(){
               return gp;
       }

       public void SetSp(String sp){
	       this.sp = sp;
       }
   
       public String GetSp(){
               return sp;
       }

       public void SetFp(String fp){
               this.fp = fp;
       }

       public String GetFp(){
               return fp;
       }

       public void SetRa(String ra){
	       this.ra = ra;
       }
  
       public String GetRa(){
               return ra;
       }	

	public static String BinaryRegisters(String option) {
		System.out.println("Função BinaryRegisters: " + option);
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
}
