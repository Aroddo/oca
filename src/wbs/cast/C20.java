package wbs.cast;

//1. compiles:		
//2. executes:	
//3. exceptions:	
//4. output:	

public class C20 {
	public static void main(String[] args) {
		double x = 1.0;
		int n = (int) x;
		System.out.println(n);
		Double d = Double.valueOf(1.0);
		Integer i = (Integer) d;
		System.out.println(i);
	}
}