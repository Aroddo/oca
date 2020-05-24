package wbs.ocaprep.inheritance;
/*
 * Bitte geben Sie für jeden der folgenden Quelltexte an, ob er erfolgreich
 * compiliert werden kann. Falls er compiliert werden kann, geben Sie bitte an,
 * ob er ausgeführt werden kann. Falls er ausgeführt werden kann, geben sie
 * bitte an, ob es bei der Ausführung zu einer Exception kommt oder nicht. Falls
 * es keine Exception gibt, geben Sie bitte die eventuelle Ausgabe(n) an. 
 * 
 * 1. compiles: 	
 * 2. executes: 
 * 3. exceptions: 
 * 4. output:
 * 		C153
 * 		C152
 * 		wbs.ocaprep.inheritance.C151@55something3803
 */

class C151 {
}

class C152 extends C151 {
	@Override
	public String toString() { return getClass().getSimpleName(); }
}

class C153 extends C152 {
}

public class C15 {
	public static void main(String[] args) {
		C151 c1511 = new C153();
		C151 c1512 = new C152();
		C151 c1513 = new C151();
		System.out.println(c1511);
		System.out.println(c1512);
		System.out.println(c1513);
	}
}