package wbs.constructors_methods_encapsulation;

public class ThisTest {
	static String s = "AAA";

	void m() { System.out.println(this.s); }

	static void x() {		// klapp nicht
//		System.out.println(this.s);
	}

}
