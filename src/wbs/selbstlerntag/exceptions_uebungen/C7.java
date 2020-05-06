package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y
		Y -> Executes succesfully? -> Y/N
			N: no main() not executable
			
			
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/


import java.io.IOException;

interface I70 {
	void m() throws Exception;
}

public class C7 implements I70 {
	@Override
	public void m() throws IOException {
		// TODO Auto-generated method stub
	}
}