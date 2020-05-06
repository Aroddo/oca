package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		
		N: 		public void m() throws IOException {
			Multiple markers at this line
			- Exception IOException is not compatible with throws clause in I81.m()
			- implements wbs.selbstlerntag.exceptions_uebungen_1.I80.m
			
			same method name (throwing different exceptions) in 2 interfaces
			IOException is parent class of FileNotFoundException
			
			
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/

import java.io.FileNotFoundException;
import java.io.IOException;

interface I80 {
	void m() throws IOException;
}

interface I81 {
	void m() throws FileNotFoundException;
}

public class C8 implements I80, I81 {
	
	@Override
	public void m() throws IOException {
		// TODO Auto-generated method stub
	}
	
}