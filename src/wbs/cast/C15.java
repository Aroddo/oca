package wbs.cast;

//1. compiles:		ja
//2. executes:		ja
//3. exceptions:	nein
//4. output:		a	b
class C151 {
	static void m() { System.out.println("a"); }
}

class C152 extends C151 {
	
	static void m() { System.out.println("b"); }
}

public class C15 {
	@SuppressWarnings("static-access")
	public static void main(String... av) {
		C151 c151 = new C152();
		c151.m();
		((C152) c151).m();
	}
}