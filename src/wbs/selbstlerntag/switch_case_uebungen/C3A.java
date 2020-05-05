package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
		case expressions must be constant expressions
			- n2 is unknown in switch block
	
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
		
*/

public class C3A {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 6;
		switch (n1) {
		case 1:
			System.out.println("a");
		case 2:
			System.out.println("b");
			break;
		case n2:
			break;
		}
	}
}