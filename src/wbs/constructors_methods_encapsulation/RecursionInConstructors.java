package wbs.constructors_methods_encapsulation;

/*
 * wir untersuchen, was passiert, wenn konstruktoren einer klasse
 * sich wechselseitig aufrufen...
 * 
 * BISSL FIES... :)
 */

@SuppressWarnings(value = "all")
public class RecursionInConstructors {

	public RecursionInConstructors() {
		this(1);
	}

	public RecursionInConstructors(int n) {
		this("1");
	}

	public RecursionInConstructors(String s) {
//		 this(); // compilerfehler!
	}

	public void RecursionInConstructors() {
		RecursionInConstructors(1);
	}

	public void RecursionInConstructors(int n) {
		RecursionInConstructors("1");
	}

	public void RecursionInConstructors(String s) {
		RecursionInConstructors(); // kein compilerfehler!
	}
}
