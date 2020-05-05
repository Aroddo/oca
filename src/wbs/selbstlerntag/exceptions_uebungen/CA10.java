package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
			Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?

*/

public class CA10 {
	public static void main(String[] args) {
		long zahl = 4;
		switch (zahl) {
		case 1L:
			break;
		}
	}
}