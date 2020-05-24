package wbs.cast;

//	1. compiles:		ja
//	2. executes:		ja	
//  3. exceptions:		ClassCastException in 17
//	4. output:			3, dann exception
public class C02 {
	Number n = Integer.valueOf(10);

	void m(Number n) {
		Integer i = (Integer) n;
		System.out.println(i);
	}

	public static void main(String[] args) {
		new C02().m(Integer.valueOf(3));
		new C02().m(Double.valueOf(3));
	}
}