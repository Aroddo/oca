package wbs.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBigRationalDemo {

	public static void main(String[] args) {
		List<BigRational> fractionList = new ArrayList<>();

		// Fülle fractionList mit Zufallsbrüchen
		for (int n = 0; n < 20; n++) {
			try {
				fractionList.add(new BigRational((int) (Math.random() * 10), (int) (Math.random() * 10)));
			} catch (ArithmeticException e) {
				n--;
			}
		}

		// Abstandszeichen für Ausgabe von fractionList als double-Wert

		System.out.println("--Unsortiert--");
		fractionList.forEach(System.out::print); // Ausgabe in Bruchdarstellung

		System.out.println();
		fractionList.forEach(fraction -> System.out.print(fraction.toDouble(1) + " ")); // Ausgabe in double-Darstellung
																						// (auf 1 Nachkommastelle
																						// gekürzt)
		System.out.println("\n\n---Sortiert---");
		Collections.sort(fractionList); // Sortieren von fractionList
		fractionList.forEach(System.out::print); // Ausgabe in Bruchdarstellung

		System.out.println();
		fractionList.forEach(fraction -> System.out.print(fraction.toDouble(1) + " ")); // Ausgabe in double-Darstellung
																						// (auf 1 Nachkommastelle
																						// gekürzt)
		System.out.println("\n\n--Equals--");
		System.out.println(fractionList.get(0) + " equals " + fractionList.get(0) + " => "
				+ fractionList.get(0).equals(fractionList.get(0)));
		System.out.println(fractionList.get(0) + " equals " + fractionList.get(1) + " => "
				+ fractionList.get(0).equals(fractionList.get(1)));
		System.out.println(fractionList.get(0) + " equals " + fractionList.get(10) + " => "
				+ fractionList.get(0).equals(fractionList.get(10)));

		Double d = 0.5;
		System.out.println(d);
		System.out.println(Math.pow(d, 2));
		System.out.println(Math.pow(d, -2));
		  d = 2.0;
		System.out.println(d);
		System.out.println(Math.pow(d, 2));
		System.out.println(Math.pow(d, -2));
		System.out.println(Math.pow(d, 1/2));
		
		
	}
}
