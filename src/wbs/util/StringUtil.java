package wbs.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Deque;

public class StringUtil {

	public static int countDifferentCharacters(String s) {
		HashSet<Character> charlist = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			charlist.add(s.charAt(i));
		}
		return charlist.size();
	}

	public static int countDifferentCharacters2(String s) {
		return (int) s.chars().distinct().count();
	}

	// Mit predicate. hier eher sinnfrei.
	public static boolean isPalindrome(String testString) {
		Predicate<String> outerMatch = kandidat -> {					// Predicate definieren
			kandidat = kandidat.toLowerCase().replace(" ", "");					// kleinschreibung. space weg.
			String vorderteil = kandidat.substring(0, kandidat.length() / 2);	// string splitten in vorderteil
			String hinterteil = new StringBuffer(kandidat.substring(			// und hinterteil.
					(kandidat.length() / 2) + (kandidat.length() % 2)			// Das % 2 sorgt dafür, dass sowohl
			)).reverse().toString();											// gerade und ungerade klappt.
			return vorderteil.equals(hinterteil);						// Wenn beide teile gleich, dann palindrom
		};

		return outerMatch.test(testString);
	}

	// Warum was anderes nehmen wenn man StringBuffer hat?
	public static boolean isPalindrome2(String kandidat) {
		kandidat = kandidat.toLowerCase().replace(" ", "");					// kleinschreibung. space weg.
		String tadidnak = new StringBuffer(kandidat).reverse().toString();	// string mit stringbuffer umdrehen
		return kandidat.equals(tadidnak);								// wenn gleich, dann palindrom.
	}

	// mit deqeue
	public static boolean isPalindrome3(String kandidat) {
		Deque<String> kandidatDeque = new LinkedList<>(					// definition einer Deque (queue+stack in einem)
				Arrays.asList(kandidat.replace(" ", "").split("")));	// kleinschreibung. space weg.
		boolean b = true;													// rückgabewert auf true initialisieren
		while (b && kandidatDeque.size() > 1) {								// weitermachen solange palindrom sein kann
			b = kandidatDeque.pollFirst().equals(kandidatDeque.pollLast());	// vergleiche und lösche äußersten beiden
		}																	// elemente
		
		return b;
	}

	// einfache for-schleife 
	public static boolean isPalindrome4(String kandidat) {
		kandidat = kandidat.toLowerCase().replace(" ", "");				// kleinschreibung. space weg.
		boolean b = true;
		for (int i = 0; i < kandidat.length() / 2; i++) {				// durchlaufe hälfte der string-länge 
			if (kandidat.charAt(i) != kandidat.charAt(kandidat.length() - i - 1)) {	// vergleiche äußere buchstaben		
				b = false;															// falls kein palindrom => false
				break;																// und vorzeitiger schleifenstopp
			}
		}
		return b;
	}
	
}
