package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N:
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
		
			at wbs.selbstlerntag.switch_case_uebungen_1.CA5.main(CA5.java:27)
		
			- invalid switch on double; int, string or enum only!
				double x = 5;
				switch (x) {
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
		
*/

public class CA5 {
	
	public static void main(String[] args) {
		
		double x = 5;
		switch (x) {
		case 1:
			break;
		case 2:
			System.out.println("abc");
			break;
		}
	}
}
