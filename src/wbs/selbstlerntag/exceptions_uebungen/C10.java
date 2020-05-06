package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y
		Y -> Executes succesfully? -> Y/N
			Y
			Y -> Is an exception thrown? -> Y/N
				Y: java.lang.RuntimeException
				N: What is the output?
				N: c
					- from finally block
				
*/

public class C10 {
	
	static void m() {
		
		try {
			System.out.println("abc".charAt('d'));
		} finally {
			
			try {
				System.out.println("abc".charAt('d'));
			}
			catch (Throwable t) {
				throw new RuntimeException();
			}
			finally {
				System.out.println("abc".charAt(2));
			}
		}
	}
	
	public static void main(String[] args) {
		m();
	}
}