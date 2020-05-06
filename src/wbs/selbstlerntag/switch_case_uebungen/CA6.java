package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
		Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			Duplicate case
			Duplicate case
		
			at wbs.selbstlerntag.switch_case_uebungen_1.CA6.main(CA6.java:26)
		
			- 0b1010 is the binary literal of 10
			In Java SE 7, the integral types (byte, short, int, and long) can also be expressed using the binary number system.
			To specify a binary literal, add the prefix 0b or 0B to the number.
			
			https://docs.oracle.com/javase/8/docs/technotes/guides/language/binary-literals.html
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
	
*/

public class CA6 {
	public static void main(String[] args) {
		int n = 5;
		switch (n) {
		case 10:
			System.out.println("def");
			break;
		case 0b1010:
			System.out.println("abc");
			break;
		}
	}
}