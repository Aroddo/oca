package wbs.selbstlerntag.exceptions_uebungen;

/*
Does compile succesfully? -> Y/N
	Y -> Executes succesfully? -> Y/N
		Y -> Is an exception thrown? -> Y/N
			N -> What is the output?
			N:
				f
				0xF
				0xf
				f
				
				is the output, no break statement after case checks and sout of string s after switch
			
*/


public class CA8 {
	
	public static void main(String[] args) {
		String s = Integer.toHexString(15);
		switch (s) {
		case "f":
			System.out.println("f");
		case "0xF":
			System.out.println("0xF");
		case "0xf":
			System.out.println("0xf");
			break;
		}
		System.out.println(s);
	}
}