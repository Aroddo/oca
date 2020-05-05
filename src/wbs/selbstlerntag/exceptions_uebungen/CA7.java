package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
				N:
					- none, no default block, no case for 5
				
*/

public class CA7 {
	
	public static void main(String[] args) {
		
		int n1 = 5;
		final int n2 = 6;
		
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
