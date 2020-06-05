package wbs.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	// wir bestücken eine List von Integer mit einigen Integer-Objekten
	// dann definieren wir einen Comparator für den typ Number.
	// dieser comparator vergleicht die string-repräsentationen der objekte

	// dann sortieren wir die List mit einer geeigneten sort() - methode
	// der klasse collecions unter verwendung dieses comparators.
	//
	// die hier verwendete sort()-methode ist in Collections so definiert:
	// static <T> void sort(List<T> list, Comparator<? superT> c)

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(9, 6, 3, 2, 1, 666, 333, 999, 444, 117, 663, 224, 543, 231, 114, 11, 99,
				55, 77, 33);
		Comparator<Number> cmp = (n1, n2) -> n1.toString().compareTo(n2.toString());
		System.out.println(myList);
		Collections.sort(myList, cmp);
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);

		System.out.println();

		// wir bestücken nun eine list mit einigen büchern.
		// dann sortieren wir die list ohne verwendung eines comparators
		// mit einer geeigneten sort()-methode von collections.

		List<Buch> bookList = new ArrayList<>();
		bookList.add(new Buch("IT -Java-00001", "Java ist auch eine Insel", "978-3836218023"));
		bookList.add(new Buch("Bel-Fant-00001", "Die Prinzen von Amber", "978-3899964387"));
		bookList.add(new Buch("Bel-SciF-00001", "On Basilisk Station (Honor Harrington Book 1)", "978-0743435710"));
		bookList.add(new Buch("Bel-SciF-00002", "Scherben der Ehre", "3-453-12810-9"));
		bookList.add(new Buch("Bel-SciF-00003", "The Vor Game", "3-453-07274-X"));
		bookList.add(new Buch("Sci-Psyc-00003", "Psychologie des Unbewußten", "978-3108227234"));
		bookList.add(new Buch("Sci-Psyc-00002", "Die Traumdeutung", "978-3108227227"));
		bookList.add(new Buch("Sci-Psyc-00002", "Die Traumdeutung", "978-3108227227"));

		Comparator<Buch> compTitel = (b1,b2) -> b1.titel.compareTo(b2.titel);
		Comparator<Buch> compISBN  = (b1,b2) -> b1.isbn.compareTo(b2.isbn);
		Comparator<Buch> compInventar = (b1,b2) -> b1.inventarNummer.compareTo(b2.inventarNummer);
		
		
		bookList.forEach(b -> System.out.printf("isbn=%s \t inventarNummer=%s \t Titel=%s \n", b.isbn, b.inventarNummer, b.titel));

		Collections.sort(bookList);

		System.out.println("\nSort by default");
		bookList.forEach(b -> System.out.printf("isbn=%s \t inventarNummer=%s \t Titel=%s \n", b.isbn, b.inventarNummer, b.titel));
		
		System.out.println("\nSort by Titel");
		Collections.sort(bookList, compTitel);
		bookList.forEach(b -> System.out.printf("isbn=%s \t inventarNummer=%s \t Titel=%s \n", b.isbn, b.inventarNummer, b.titel));

		System.out.println("\nSort by ISBN");
		Collections.sort(bookList, compISBN);
		bookList.forEach(b -> System.out.printf("isbn=%s \t inventarNummer=%s \t Titel=%s \n", b.isbn, b.inventarNummer, b.titel));

		System.out.println("\nSort by inventarNummer");
		Collections.sort(bookList, compInventar);
		bookList.forEach(b -> System.out.printf("isbn=%s \t inventarNummer=%s \t Titel=%s \n", b.isbn, b.inventarNummer, b.titel));
		
		System.out.println("\nSort by default ISBN ");
		Collections.sort(bookList);
		bookList.forEach(b -> System.out.printf("isbn=%s \t inventarNummer=%s \t Titel=%s \n", b.isbn, b.inventarNummer, b.titel));
		
		System.out.println(bookList.get(5).compareTo(bookList.get(6)));
		System.out.println(bookList.get(5).equals(bookList.get(6)));
		
		Collections l;
		
	}
}

class Medium implements Comparable<Medium> {
	String inventarNummer;
	String titel;

	public Medium(String inventarNummer, String titel) {
		this.inventarNummer = inventarNummer;
		this.titel = titel;
	}

	@Override
	public int compareTo(Medium medium) {
		// wir vergleichen aufsteigend nach der inventarNummer
		return inventarNummer.compareTo(medium.inventarNummer);
	}

	@Override
	public String toString() {
		return "Medium [inventarNummer=" + inventarNummer + ", titel=" + titel + "]";
	}
}

class Buch extends Medium {
	public String isbn;

	public Buch(String inventarNummer, String titel, String isbn) {
		super(inventarNummer, titel);
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Buch [isbn=" + isbn + ", inventarNummer=" + inventarNummer + ", titel=" + titel + "]";
	}
	
	public int compareTo(Buch buch) {
		return isbn.compareTo(buch.isbn);
	}
	
	
}