package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
		
		N:
		 
		Multiple markers at this line
		- Exception Exception is not compatible with throws clause in I162.m()
		- implements wbs.selbstlerntag.exceptions_uebungen_1.I161.m
		- Exception Exception is not compatible with throws clause in I161.m()
		
			
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/

import java.io.IOException;
import java.sql.SQLException;

interface I161 {
	void m() throws IOException;
}

interface I162 {
	void m() throws SQLException;
}

public class C16 implements I161, I162 {
	@Override
	public void m() throws Exception {
		// TODO Auto-generated method stub
	}
}
