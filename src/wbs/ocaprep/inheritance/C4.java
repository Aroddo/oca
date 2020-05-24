package wbs.ocaprep.inheritance;
/*
 * Bitte geben Sie für jeden der folgenden Quelltexte an, ob er erfolgreich
 * compiliert werden kann. Falls er compiliert werden kann, geben Sie bitte an,
 * ob er ausgeführt werden kann. Falls er ausgeführt werden kann, geben sie
 * bitte an, ob es bei der Ausführung zu einer Exception kommt oder nicht. Falls
 * es keine Exception gibt, geben Sie bitte die eventuelle Ausgabe(n) an. 
 * 
 * 1. compiles:		ja 	
 * 2. executes: 	ja
 * 3. exceptions: 	nein
 * 4. output:		nix
 */

public class C4 implements CharSequence {
	@Override
	public char charAt(int arg0) { return 0; }

	@Override
	public int length() { return 0; }

	@Override
	public CharSequence subSequence(int arg0, int arg1) { return null; }
}