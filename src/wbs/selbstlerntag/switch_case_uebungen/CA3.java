package wbs.selbstlerntag.switch_case_uebungen;


/*
	Does compile succesfully? -> Y/N
	
		N:
		Cannot switch on a value of type Number. Only convertible int values, strings or enum variables are permitted
			- invalid case check against an Integer object 
	
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
				
*/

class CA31 {
	Number m() {
		return 1;
	}
}

class CA32 extends CA31 {
	Integer m() {
		return 2;
	}
}

public class CA3 {
	public static void main(String[] args) {
		CA32 ca32 = new CA32();
		switch (ca32.m()) {
		case 1:
			break;
		}
		CA31 ca31 = new CA32();
		switch (ca31.m()) {
		case 1:
			break;
		}
		
		System.out.println(ca31.m());
		System.out.println(ca31.getClass());
		System.out.println(ca31.m().getClass());
		
		System.out.println(ca32.m());
		System.out.println(ca32.getClass());
		System.out.println(ca32.m().getClass());
		
	}
}
