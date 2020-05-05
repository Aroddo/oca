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
import java.sql.SQLException;

interface I171 {
	void m() throws IOException;
}

interface I172 {
	void m() throws SQLException;
}

public class C17 implements I171, I172 {
	@Override
	public void m() throws RuntimeException {
		// TODO Auto-generated method stub
	}
}