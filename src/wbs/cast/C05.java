package wbs.cast;

//1. compiles:		nope. Type mismatch.
//2. executes:	
//3. exceptions:	
//4. output:		

public class C05 {
	public static void main(String[] args) {
		String s1 = "henriette, die suppe wird kalt!";
		String s2 = (Object) s1;
	}
}