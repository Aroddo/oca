package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
		Duplicate case
			- two case blocks for A
		
		works like this:
		case A:
		case B:
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
	
*/

enum E51 {
	A, B, C;
}

public class C5 {
	public static void main(String[] args) {
		E51 e51 = E51.A;
		switch (e51) {
		case A:
			System.out.println("a");
		case B:
			break;
		case C:
			break;
		case A:
			System.out.println("b");
		}
	}
}