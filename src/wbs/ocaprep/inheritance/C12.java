package wbs.ocaprep.inheritance;
/*
 * Bitte geben Sie für jeden der folgenden Quelltexte an, ob er erfolgreich
 * compiliert werden kann. Falls er compiliert werden kann, geben Sie bitte an,
 * ob er ausgeführt werden kann. Falls er ausgeführt werden kann, geben sie
 * bitte an, ob es bei der Ausführung zu einer Exception kommt oder nicht. Falls
 * es keine Exception gibt, geben Sie bitte die eventuelle Ausgabe(n) an. 
 * 
 * 1. compiles: 	nein. reduziert sichtbarkeit
 * 2. executes: 
 * 3. exceptions: 
 * 4. output:
 */

class C121 {
	protected void m() {}
}

public class C12 extends C121 {
	@Override
	void m() { super.m(); }
}