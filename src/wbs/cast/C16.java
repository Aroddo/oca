package wbs.cast;
//falsch geraten
//1. compiles:		ja		
//2. executes:		nein, ClassCastException in 16
//3. exceptions:	
//4. output:		
interface I16 {
}

class C161 {
}

public class C16 {
	public static void main(String[] args) {
		C161 c161 = new C161();
		I16 i16 = (I16) c161;
		System.out.println(i16);
	}
}