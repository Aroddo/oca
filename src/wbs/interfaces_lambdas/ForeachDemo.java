package wbs.interfaces_lambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

// wir bestücken eine list mit einigen integern
//	dann geben wir die list elementweise aus unter verwendung der methode
// foreach() von Iterable

// 1. variante:	wir verwenden eine hilfsklasse (ConsumerImpl)
// 2. variante: wir verwenden eine anonyme Klasse
// 3. variante: wir verwenden einen lambda
// 4. variante: wir verwenden eine method reference

public class ForeachDemo {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(new Integer[] { 42, 31, 23, 55, 99, 12, 53 });	// myList initialisieren
		Consumer<Integer> consumer;

		// v1
		System.out.println("### v1 - consumer mit vordefinierter Klasse	");
		myList.forEach( new ConsumerImpl<>());

		// v2
		System.out.println("\n### v2 - anonyme klasse");
		myList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) { System.out.print(t + "\t"); }
		});

		// v3a
		System.out.println("\n### v3- lambda");
		myList.forEach(v -> System.out.print(v + "\t"));

		// v4a
		System.out.println("\n### v4 - method reference");
		myList.forEach(System.out::print);

		// v3b
		System.out.println("\n### v3- Z lambda");
		consumer = i -> System.out.print(i + "\t");
		myList.forEach(consumer);

		// v4b
		System.out.println("\n### v4- Z method reference");
		consumer = System.out::print;
		myList.forEach(consumer);

	}
}

//
class ConsumerImpl<T> implements Consumer<T> {
	@Override
	public void accept(T t) { System.out.print(t + "\t"); }

}