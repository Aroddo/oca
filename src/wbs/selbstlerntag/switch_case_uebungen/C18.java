package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y
		Y -> Executes succesfully? -> Y/N
			Y
			Y -> Is an exception thrown? -> Y/N
				Y: 
				
				Exception in thread "main" java.lang.IndexOutOfBoundsException
					at wbs.selbstlerntag.exceptions_uebungen_1.C18.m(C18.java:31)
					at wbs.selbstlerntag.exceptions_uebungen_1.C18.main(C18.java:40)
*/

public class C18 {
	public static void m() {
		
		try {
			System.out.println("abc".charAt(100));
		}
		catch (IndexOutOfBoundsException e1) {
			
			try {
				System.out.println("abc".charAt(100));
			}
			catch (RuntimeException e2) {
				throw new IllegalArgumentException();
			}
			finally {
				throw new IndexOutOfBoundsException();
			}
			
		} catch (RuntimeException e) {
			System.out.println("out of bounds...");
		}
	}
	
	public static void main(String[] args) {
		m();
	}
}