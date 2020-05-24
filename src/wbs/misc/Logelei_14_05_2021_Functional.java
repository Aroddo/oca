
package wbs.misc;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

// https://www.zeit.de/zeit-magazin/2020/21/spiele-logelei-21

public class Logelei_14_05_2021_Functional {

	public static void main(String[] args) {

		IntPredicate hasValidDigits = n -> {											// Predicate 1 parameter n
			String numberAsString = Integer.toString(n);								// String Umwandlung
			return numberAsString.indexOf('0') < 0 && numberAsString.indexOf('9') < 0;	// Bedingung: keine digits 0
																							// oder 9
		};

		IntPredicate reverseIsMultiple = n -> {											// Predicate 1 parameter n
			int reversed = Integer.parseInt(											// erzeugt int aus String
					new StringBuilder(Integer.toString(n)).reverse().toString());		// String wird umgedreht
			return reversed != n && reversed % n == 0;									// Bedingung: n != reverse n &&
																							// reverse ist vielfaches
																							// von n
		};

		IntStream.rangeClosed(11111111, 88888888).                                      // definiert eine range
				filter(hasValidDigits.and(reverseIsMultiple))							// filtert range nach
				.findFirst().ifPresent(System.out::println);							// beiden predicates
	}
}

/*
 * welche funktionalen interfaces werden hier verwendet? zu welchem interface
 * gehört die methode filter()? welchen typ hat der parameter dieser methode?
 * was macht die methode rangeClosed()? zu welchem interface gehört die methode
 * and()? was ist der return-typ der methode findFirst(), und zu welchem
 * interface gehört diese methode? welche lambdas werden hier verwendet? warum
 * können hier (zeile 24 - 26) viele methodenaufrufe aneinandergehängt werden?
 * zu welchem typ gehört die method isPresent()? welchen parameter erwartet
 * diese methode? wo spielt die type inference des compilers hier eine rolle?
 * wie unterscheidet sich die imperative von der funktionalen lösung?
 */
