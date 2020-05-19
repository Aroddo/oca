package wbs.vererbung;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PolymorphieDemo {

	public static void main(String[] args) {
		String s = "aha";
		Collection<String> collection = Math.random() > 0.5
				? new HashSet<>()
				: new ArrayList<>();
		System.out.println(collection.add(s));
		System.out.println(collection.add(s));
		System.out.println(collection.getClass().getSimpleName()); // liefert HashSet oder ArrayList, da getClass RuntimeClass liefert.
		System.out.println(collection.size());	// liefert 1 wenn HashSet, da HashSet nur einzigartige Objekte aufnimmt. 
												// liefert 2 wenn ArrayList
	}
}
