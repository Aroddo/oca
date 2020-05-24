package wbs.cast;

//1. compiles:		
//2. executes:	
//3. exceptions:	
//4. output:		

// 	1. kompiliert
//	2. executes
//	3. RuntimeException nach 2. println
//	4. Ausgabe null, dann RuntimeException.

public class C01 {
	String s;

	@Override
	public String toString() { throw new RuntimeException(); }

	public static void main(String[] args) {
		System.out.println(new C01().s);
		System.out.println(new C01());
	}
}