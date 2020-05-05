package wbs.selbstlerntag.switch_case_uebungen;

/*
	Does compile succesfully? -> Y/N
	
		N: 	C2.C2()
		 	missing "throws Exception" in signature
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?	
*/

class C20 {
	C20(int nC2) throws Exception {
	}
}

public class C2 extends C20 {
	//C2() throws Exception {
	C2() {
		super(1);
	}
}
