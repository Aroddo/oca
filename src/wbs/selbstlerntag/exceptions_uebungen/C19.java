package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		
		N: Unhandled exception type Throwable
		
		would work like this:
		void m() throws Throwable {
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/

class C191 {
	
	//void m() throws Throwable {
	void m() {
		throw new Throwable();
	}
}

public class C19 {
	public static void main(String[] args) throws Throwable {
		new C191().m();
	}
}
