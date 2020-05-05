package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		
		N: SQLException checked exception, IllegalArgumentException unchecked exception
		
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unhandled exception type Exception
			
		at wbs.selbstlerntag.exceptions_uebungen_1.C12.main(C12.java:17)
		
		...
		this would work:
		public static void main(String[] args) throws Exception {
		
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/

import java.sql.SQLException;

public class C12 {
	public static void main(String[] args) throws SQLException {
		throw Math.random() > 0.5 ? new IllegalArgumentException("abc") : new SQLException("def");
	}
}
