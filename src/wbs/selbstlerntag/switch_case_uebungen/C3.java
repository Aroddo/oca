package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N: 	catch (RuntimeException | IllegalArgumentException e) {
		 	The exception IllegalArgumentException is already caught by the alternative RuntimeException
		 	
		 		- IllegalArgumentException is a child class of RuntimeException,
		 		  in a multi-catch block all exceptions have to belong to the same level of the class hierarchy!
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?		
*/

public class C3 {

	void m() {
		try {
			int i = Integer.parseInt("blabla");
		}
		catch (RuntimeException | IllegalArgumentException e) {
		}
	}
}