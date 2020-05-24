package wbs.ocaprep.inheritance;

/*
 * Bitte geben Sie für jeden der folgenden Quelltexte an, ob er erfolgreich
 * compiliert werden kann. Falls er compiliert werden kann, geben Sie bitte an,
 * ob er ausgeführt werden kann. Falls er ausgeführt werden kann, geben sie
 * bitte an, ob es bei der Ausführung zu einer Exception kommt oder nicht. Falls
 * es keine Exception gibt, geben Sie bitte die eventuelle Ausgabe(n) an. 
 * 
 * 1. compiles: 	ja
 * 2. executes: 	ja
 * 3. exceptions: 	nein
 * 4. output:	
 * 		nana
 * 		m12 of C111
 * 		m12 of C11
 * 		lala	
 */
class C111 {
	CharSequence m1() {
		return "nana";
	}

	static void m12() {
		System.out.println("m12 of C111");
	}
}

public class C11 extends C111 {
	@Override
	String m1() {
		return "lalla";
	}

	static void m12() {
		System.out.println("m12 of C11");
	}

	public static void main(String... args) {
		C111 c111 = new C11();
		System.out.println(c111.m1());
		c111.m12();
		((C11) c111).m12();
		System.out.println(((C11) c111).m1());
	}
}