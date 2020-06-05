package wbs.generics;

import java.util.ArrayList;
import java.util.List;

class Frucht {
}

class Apfel extends Frucht {
}

class Birne extends Frucht {
}

public class WildCardDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Frucht> fruechte = new ArrayList<>();

		// uaf extendsFruechte darf jede list zugewiesen werden,
		// dere element-typ Frucht oder subtyp von Frucht ist.
		List<? extends Frucht> extendsFruechte = new ArrayList<>();

		// uaf superFruechte darf jede list zugewiesen werden,
		// dere element-typ Frucht oder supertyp von Frucht ist.
		List<? super Frucht> superFruechte = new ArrayList<>();

		fruechte.add(new Apfel()); // ok
		fruechte.add(new Birne()); // ok

		List<Birne> birnen = new ArrayList<>();

//		birnen = fruechte ;	// compilerfehler
//		fruechte = birnen;	// compilerfehler
		
		extendsFruechte.add(new Frucht()); // compilerfehler
//		extendsFruechte.add(new Birne()); // compilerfehler
		extendsFruechte.add(null); // ok
		Frucht frucht = extendsFruechte.get(0); // ok
		superFruechte.add(new Birne()); // ok
		superFruechte.add(null);
		frucht = superFruechte.get(0); // compilerfehler
		Object o = superFruechte.get(0); // ok
	}
}