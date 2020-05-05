package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y
		Y -> Executes succesfully? -> Y/N
			N: no main() not executable
			
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/

import java.io.FileNotFoundException;
import java.io.IOException;

interface I90 {
	void m() throws IOException;
}

interface I91 {
	void m() throws FileNotFoundException;
}

public class C9 implements I90, I91 {
	
	@Override
	public void m() throws FileNotFoundException {
		// TODO Auto-generated method stub
	}
	
}