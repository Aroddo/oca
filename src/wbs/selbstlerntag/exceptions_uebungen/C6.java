package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N	
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
				N: 4
				
				no break from case blocks, n=1 is incremented 3 times -> 4 
*/

enum E61 {
	A, B, C;
}

public class C6 {
	public static void main(String[] args) {
		E61 e61 = E61.C;
		int n = 1;
		switch (e61) {
		default:
			n++;
		case A:
			n++;
		case B:
			n++;
		}
		System.out.println(n);
	}
}
