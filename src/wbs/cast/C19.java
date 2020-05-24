package wbs.cast;

//1. compiles:		ja
//2. executes:		nein
//3. exceptions:	ClassCastException in 16. Autocast in Number geht, cast nach Integer geht nicht.
//4. output:	

public class C19 {
	static void m(Number n) {
		Integer i = (Integer) n;
		System.out.println(i.compareTo(Integer.valueOf("123")));
	}

	public static void main(String[] args) {
		m(Integer.valueOf("123"));
		m(Double.valueOf("123"));
	}
}

