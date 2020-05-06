package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
				N: blabla
			
*/


public class C20 {
	
	public static void main(String[] args) {
		try {
			throw new Throwable(new Throwable("blabla"));
		} catch (Throwable t) {
			System.out.println(t.getCause().getMessage());
		}
	}
}