package wbs.collections;

import java.util.*;
import java.util.function.*;

public class IterationDemo {

	// wir bestücken eine List mit den Zahlen von 1 bis 5
	public static void main(String[] args) {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);

		// wir geben alle elemente von zahlen aus

		// variante 1 for-schleife
		System.out.println("Variante 1:");
		for (int i = 0; i < liste.size(); i++) {
			System.out.print(liste.get(i) + "  ");
		}

		// variante 2 enhanced for-schleife
		System.out.println("\n\nVariante 2:");
		for (Integer i : liste) {
			System.out.print(i + "  ");
		}

		// variante 3 iterator
		System.out.println("\n\nVariante 3:");
		Iterator<Integer> it = liste.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}

		// variante 4 wir verwenden die methode foreach() und eine anonyme klasse
		// wir erstellen eine anonyme klasse, die das interface Consumer aus
		// dem package java.util.function implementiert.

		// diese anonyme klasse muss die methode accept implementieren.
		// eine instanz dieser anonymen klasse übergeben wir der methode foreach()
		// als argument.

		System.out.println("\n\nVariante 4:");
		liste.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.print(i + " ");
			}
		});

		// Variante ohne anonyme Klasse
		System.out.println("\n\nVariante 4b:");
		Consumer<Integer> myConsumer = new MyConsumer();
		liste.forEach(myConsumer);

		/*
		 * variante 5 wir verwenden die methode foreach() und einen lambda 
		 * was man jetzt wissen muss:
		 * - das interface List erbt die methode foreach() vom interface Iterable
		 * - die methode foreach erwartet als parameter einen Consumer
		 * - Consumer ist ein functional interface, das generisch ist, und
		 *   eine abstrakte methode namens accept() deklariert,
		 *   die genau einen parameter hat und void liefert
		 */
		
		System.out.println("\n\nVariante 5:");
		liste.forEach( n -> System.out.print(n + "  "));

		/*
		 * Variante 6: foreach und merhod reference
		 */
		System.out.println("\n\nVariante 6:");
		liste.forEach(System.out::print);
		
		
		System.out.println("\n\nVariante 6b:");
		liste.forEach(MyConsumer::print);
	}

}

class MyConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer i) {
		System.out.print(i + " ");
	}
	public static void  print (Integer i) {
		System.out.print(i + " ");
	}
	
}
