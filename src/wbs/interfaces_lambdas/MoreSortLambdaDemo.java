package wbs.interfaces_lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import wbs.util.NumberUtil;

/*
 * 1. sortierkriterium: Die Anzahl der verschiedenen Ziffern in der Zahl, aufsteigend
 * 2. sortierkriterium: die groesse der zahl, aufsteigend.
 */

public class MoreSortLambdaDemo {

	public static void main(String[] args) {
		List<Integer> list =                                                         // Einzeiler zum Füllen einer Liste
				IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList()); // mit Integer-Werten

		Comparator<Integer> hasMoreDistinctNumerals = (n, m) -> {       // Comparator Definition.
			return (													// Return-Wert ist Ergebnis der
			(Long) n.toString().chars().distinct().count()).compareTo(	// compareTo()-Methode von Long.
					(Long) m.toString().chars().distinct().count());	// Verglichen werden Anzahl unterschiedlicher
		};																// Stellen von n und m.

		// Demonstration des hasMoreDistinctNumerals Comparators
		Collections.shuffle(list); 				// Einmal mischen. 😀
		System.out.println(list);				// Ausgabe von list.
		Collections.sort(list);					// Einmal sortieren mit Collections
		list.sort(hasMoreDistinctNumerals);		// Sortieren mit eigenem Sortierkriterium hasMoreDistinctNumerals.
		System.out.println(list);				// Ausgabe von list.

		
		// Das gleiche nochmal, aber ohne Angeberei mit Einzeilern
		//
//		List<Integer> list = IntStream
//			.rangeClosed(1, 1000)
//			.boxed()
//			.collect(
//				Collectors.toList()
//			);
//						 
//		Comparator<Integer> hasMoreDistinctNumerals = (n, m) -> {       
//			return (													
//				(Long) 
//				n.toString()
//				.chars()
//				.distinct()
//				.count()
//			).compareTo(
//				(Long)m
//				.toString()
//				.chars()
//				.distinct()
//				.count()
//			);	
//		};
//		
//		// Demonstration des hasMoreDistinctNumerals Comparators
//		System.out.println(list);
//		Collections.shuffle(list); 				// Einmal mischen. 😀
//		System.out.println(list);				// Ausgabe von list.
//		Collections.sort(list);					// Einmal sortieren mit Collections
//		list.sort(hasMoreDistinctNumerals);		// Sortieren mit eigenem Sortierkriterium hasMoreDistinctNumerals.
//		System.out.println(list);				// Ausgabe von list.

		
		
//		2. Aufgabenstellung: 
//			Wir sortieren nochmal die zahlen von 1 bis 1000 
// 			1. sortierkriterium: Anzahl primfaktoren 
//			2. sortierkriterium: größe der zahl, aufsteigend

		List<Integer> list2 = 														// Einzeiler zum Füllen einer Liste
				IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());// mit Integer-Werten

		Comparator<Integer> hasMorePrimeFactors = (n, m) -> {						// Comparator Definition.
			return Integer.valueOf(NumberUtil.primfaktoren(n).size()).compareTo( 	// Return-Wert ist Ergebnis
					NumberUtil.primfaktoren(m).size());								// der compareTo() Methode.
		};																			// Veglichen werden Ergebnisse
																					// der primfaktoren-Methode

		Collections.sort(list2);				// Einmal sortieren mit Collections
		list2.sort(hasMorePrimeFactors);		// Sortieren mit eigenem Sortierkriterium hasMorePrimeFactors
		System.out.println(list2);				// Ausgabe von list2.

		// Ausgabe von List2 mit inline Lambda-Notation
		list2.forEach(listWert -> {
			System.out.println(listWert + " --> " + NumberUtil.primfaktoren(listWert));
		});

		// Ausgabe von List2 mit explizit definiertem Consumer, Lambda-Notation
		Consumer<Integer> prettyPrint = listWert -> {										// Consumer Definition.
			System.out.println(listWert + " --> " + NumberUtil.primfaktoren(listWert));		// Formatierte
																							// print-Ausgabe. Kann
		};																					// z.B. an forEach übergeben werden.
		list2.forEach(prettyPrint);															// Ausgabe von list2 in schön

		// Ausgabe von List2 mit explizit definiertem Consumer, 
		// realisiert als Klasse mit Interface-Implementation
		class ConsumerDemo implements Consumer<Integer> {
			@Override
			public void accept(Integer p) {
				System.out.println(p + " -> " + NumberUtil.primfaktoren(p));
			}
		}
		ConsumerDemo prettyPrintObject = new ConsumerDemo();
		list2.forEach(prettyPrintObject);
	}
}
 
