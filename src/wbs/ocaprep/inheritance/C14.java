package wbs.ocaprep.inheritance;
/*
 * Bitte geben Sie für jeden der folgenden Quelltexte an, ob er erfolgreich
 * compiliert werden kann. Falls er compiliert werden kann, geben Sie bitte an,
 * ob er ausgeführt werden kann. Falls er ausgeführt werden kann, geben sie
 * bitte an, ob es bei der Ausführung zu einer Exception kommt oder nicht. Falls
 * es keine Exception gibt, geben Sie bitte die eventuelle Ausgabe(n) an. 
 * 
 * 1. compiles: 	ja
 * 2. executes: 
 * 3. exceptions: 
 * 4. output:
 * 		4
 * 		a
 * 		aa
 * 		40
 * 		b
 * 		bb
 */

class C141 {
	int n = 3;
	static int m = 4;

	void m1() { System.out.println("a"); }

	static void m2() { System.out.println("aa"); }
}

class C142 extends C141 {
	int n = 30;
	static int m = 40;

	void m1() { System.out.println("b"); }

	static void m2() { System.out.println("bb"); }
}

public class C14 {
	public static void main(String[] args) {
		C141 c141 = new C142();
		System.out.println(c141.n);
		System.out.println(c141.m);
		c141.m1();
		c141.m2();
		System.out.println(((C142) c141).n);
		System.out.println(((C142) c141).m);
		((C142) c141).m1();
		((C142) c141).m2();
	}
}