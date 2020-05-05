package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y
		Y -> Executes succesfully? -> Y/N
			Y
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
				N: cba
					- finally block is not executed
*/

public class C14 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("abc".charAt(544));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("cba");
			System.exit(1);
		} finally {
			System.out.println("xyz");
		}
	}
}