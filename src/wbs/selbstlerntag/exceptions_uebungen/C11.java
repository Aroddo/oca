package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N: 	unreachable code
		
			System.out.println(e.getMessage());
			
			} catch (RuntimeException e) {
				// System.out.println(e.getMessage());
				throw new RuntimeException("finis!");
				System.out.println(e.getMessage());
		
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unreachable code
		
			at wbs.selbstlerntag.exceptions_uebungen_1.C11.main(C11.java:60)
		
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/



class E11 extends Exception {}

class E12 extends E11 {}

class C110 {
	void m1() throws E12 {
	}
	void m2() throws E11 {
	}
}

public class C11 {
	void m() throws E11 {
		try {
			new C110().m1();
		} catch (E11 e) {
			throw new E12();
		} finally {
			System.out.println("aber hoppla!");
		}
	}

	public static void main(String[] args) {
		try {
			new C11().m();
			System.out.println("gaga!");
		} catch (RuntimeException e) {
			// System.out.println(e.getMessage());
			throw new RuntimeException("finis!");
			System.out.println(e.getMessage());
		} catch (Throwable t) {
			System.out.println("nana...");
		}
	}
}
