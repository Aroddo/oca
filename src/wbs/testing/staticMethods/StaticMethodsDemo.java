package wbs.testing.staticMethods;

interface I1 {
	static void m1() { System.out.println("m1() von I1"); }
}

interface I2 {
	static void m1() { System.out.println("m1() von I2"); }
}

public class StaticMethodsDemo implements I1, I2 {
	public static void main(String[] args) {
// m1(); compilerfehler
		I1.m1(); // m1() von I1
		I2.m1(); // m1() von I2
	}
}