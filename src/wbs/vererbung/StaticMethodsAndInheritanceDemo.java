package wbs.vererbung;

class Base1 {
	String s = "base1";
	void m() {
		System.out.println("in m() von Base1 " + s);
	}
	static void ms() {
		System.out.println("in ms() von Base1 " + s);
	}
}

class Sub1 extends Base1 {
	String s = "sub1";
	@Override
	void m() {
		System.out.println("in m() von Sub1 " + s );
	}
	// @Override	compilerfehler
	static void ms() {
		System.out.println("in ms() von Sub1 " + s);
	}
}


public class StaticMethodsAndInheritanceDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Base1 b1 = new Sub1();
		b1.m();  // in m() von Sub1
		b1.ms(); // in ms() von Base1
		// ein cast ändert den reference type und nicht den object type !
		((Base1) b1).m();  // in m() von Sub1
		((Base1) b1).ms(); // in ms() von Base1
		((Sub1) b1).ms(); // in ms() von Sub1


	}

}
