package wbs.util;

public class TestDoubleDivision {

	public static void main(String[] args) {
		double a,b;
		int j;
		for (int i= 1; i< 100; i++) {
			j = i*7;
			a = (double)i/3 ;
			b = (double)j/21 ;
//			System.out.println(a + "  " + b) ;
			System.out.print ((a == b) + " ");
		}
		System.out.println();
		Double dd = 21.0;
		System.out.println(dd.hashCode());
			
	}

}
