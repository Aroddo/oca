package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
			Type mismatch: cannot convert from long to Integer
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?

*/

public class CA11 {
	public static void main(String[] args) {
		Integer zahl = 4;
		switch (zahl) {
		case 1L:
			break;
		}
	}
}