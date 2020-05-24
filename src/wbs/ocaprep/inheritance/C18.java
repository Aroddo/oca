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
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class C18 {
	protected int n;

	protected C18() throws FileNotFoundException {}

	protected void m1() {}

	protected void m2() throws IOException {}

	public CharSequence m3() {
		return null;
	}

	public int m4() {
		return 0;
	}
}