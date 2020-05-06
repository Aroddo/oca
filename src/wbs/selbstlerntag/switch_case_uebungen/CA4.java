package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unreachable code
		
			at wbs.selbstlerntag.switch_case_uebungen_1.CA4.main(CA4.java:29)
		
			- code after break is unreachable
				break;
				System.out.println("b");
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
			
*/

public class CA4 {
	public static void main(String[] args) {
		int n = 3;
		switch (n) {
		case 1:
			System.out.println("a");
			break;
			System.out.println("b");
		case 2:
			System.out.println("c");
			break;
		}
	}
}
