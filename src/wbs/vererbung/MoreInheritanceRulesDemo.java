package wbs.vererbung;

class C21 {
	public int m = 21;

	public void m() {
		System.out.println("m() von C21");
	}

	public void m2() {
		System.out.println("m2() von C21");
	}
}

class C22 extends C21 {
	public int m = 22;

	public void m() {
		System.out.println("m() von C22");
	}

	@Override
	public void m2() {
		System.out.println("m2() von C22");
		super.m2();
	}

	@Override
	public String toString() {
		return "m: " + m + "\n" + "super.m: " + super.m;
	}
}

public class MoreInheritanceRulesDemo {
	public static void main(String[] args) {
		C22 c22 = new C22();
		System.out.println(c22.m); // 22
		C21 c21 = c22;
		System.out.println(c21.m); // 21
		c21.m(); // m() von C22
		c22.m2(); // m2() von C22
		c21.m2(); // m2() von C22
		new C21().m2(); // m2() von C21
		System.out.println(c22); // toString() von C22
		System.out.println(c21); // toString() von C22
		System.out.println(new C21()); // toString() von Object
		System.out.println(new C22()); // toString() von Object
	}
}
