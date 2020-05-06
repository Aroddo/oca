package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
		The qualified case label E41.A must be replaced with the unqualified enum constant A
		The qualified case label E41.B must be replaced with the unqualified enum constant B
		
		works like this:
		case A:
		case B:
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
		
*/

enum E41 {
	A, B, C;
}

public class C4 {
	public static void main(String[] args) {
		E41 e41 = E41.A;
		switch (e41) {
		// case A:
		case E41.A:
			System.out.println("a");
		// case B:
		case E41.B:
			break;
		}
	}
}