package wbs.testing;

interface I1 {
	default void m1() { System.out.println("m1() von I1"); }
}

interface I2 {
	default void m1() { System.out.println("m1() von I2"); }
}

/*
 * compilerfehler class DefaultMethodsDemo_0 implements I1, I2 { }
 */
// ok
public class DefaultMethodsDemo implements I1, I2 {
	@Override
	public void m1() {
		I1.super.m1();
		I2.super.m1();
	}

	public static void main(String[] args) {
		DefaultMethodsDemo d = new DefaultMethodsDemo();
		d.m1();
	}
}