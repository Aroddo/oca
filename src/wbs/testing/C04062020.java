package wbs.testing;

public class C04062020 {
	private static final int x=1 ;
	static char c;
	 Integer i;
	 
	public C04062020 () {
		System.out.println(1);
		System.out.println(i);
	}
	public static void main(String[] args) {
		final int y = 5;
		final StringBuilder sb = new StringBuilder( "asd");
		sb.append("d");
		
		strtest2();
//		strtest();
		System.out.println((int)c);
		char[] cA = {'a','b'};
		System.out.println(cA);
		c(cA);
		System.out.println(cA);
		
		
		C04062020 cl = new C04062020() ;
	}
	
	public static void c (char[] cA) {
		cA[0] = 'x';
	}
	public void test() {
//		this.x = 10;
	}
	public void finaltest(final StringBuilder sb) {
		sb.append("asd");
	}
	
	public void strtest(String[] s) {
		System.out.println(s);
	}
	
	public static void strtest2(String... s) {
		System.out.println(s);
	}
	
}

class C1 implements I1,  I2 {
	public static void main(String[] args) {
		C1 c1 = new C1();

	}
}

interface I1 {
	static void iface() {
		System.out.println("I1");
	}
	static void iface1() {
		System.out.println("I1");
	}
}
interface I2 {
	static void iface() {
		System.out.println("I2");
	}
	static void iface2() {
		System.out.println("I2");
	}
}