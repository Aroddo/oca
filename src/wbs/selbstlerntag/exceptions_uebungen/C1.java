package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N: 	missing try/catch in C1.C101() OR
		 	missing "throws Exception" in signature
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/


class C101 {
	void C101() throws Exception {
	}
}

public class C1 extends C101 {
	
	@Override
	//void C101() throws Exception {
	void C101() {
		
		super.C101();
		
		/*
		try {
			super.C101();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		*/
	}
}