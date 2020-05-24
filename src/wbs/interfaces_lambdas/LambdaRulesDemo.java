package wbs.interfaces_lambdas;

@FunctionalInterface
interface FI1 {
	int m(String s);
}

@FunctionalInterface
interface FI2 {
	int m(String s1, String s2);
}

@FunctionalInterface
interface FI0 {
	double m();
}

public class LambdaRulesDemo {
	public static void f1(FI1 fi1) {
		System.out.println("f1");
	}

	public static void f2(FI2 fi2) {
		System.out.println("f2");
	}

	public static double f0(FI0 fi0) {
		System.out.println("f0");
		return fi0.m();
	}

	public static void main(String[] args) {
		// ohne argument
		// die runden klammern sind optional, falls genau ein parameter
		f1(s -> s.length());
		f1((s) -> s.length());
		
		// der typ ist optional
		f1((String s) -> s.length());
		// falls geschweifte klammern, ist ein semikolon erforderlich
		f1(s -> {
			return s.length();
		});
		
		// two arguments
		f2((s1, s2) -> s1.length() + s2.length());
		f2((String s1, String s2) -> s1.length() + s2.length());
		
		// zero arguments
		f0(() -> Math.random());
		f0(() -> {
			return Math.random();
		});
		
		// compilerfehler: falls typangabe, muss jeder parameter eine
		// typangabe haben
		// f2((String s1, s2) -> s1.length() + s2.length());
		
		// compilerfehler: semikolon fehlt
		/*
		 * f0(() -> { return Math.random() });
		 */
		
		// compilerfehler: die runden klammern fehlen
		// f2(s1, s2 -> s1.length() + s2.length());
	}
}