package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
		
		Y
		Y -> Executes succesfully? -> Y/N
			N: no main() not executable
			
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/

class E1 extends Exception {
}

class E2 extends Exception {
}

public class C13 {
	
	public void m() throws E1, E2 {
		
		try {
			if (Math.random() > 0.5) {
				throw new E1();
			} else {
				throw new E2();
			}
		} catch (Exception e) {
			throw e;
		}
	}
}
