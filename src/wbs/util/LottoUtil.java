package wbs.util;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.function.Consumer;

public class LottoUtil {

	// wir schreiben die methode randomTipp(). sie liefert 6 verschiedene zahlen
	// zwischen 1 und 49 in geeigneter form.

	// wie könnte diese methode deklariert werden?

	// variante 1: wir liefern ein sortiertes set von Integer
	// methodenname: createTipp1()

	
	// für die zufallszahlen können wir mit der klasse Random oder
	// der methode Math.random() arbeiten
	public static NavigableSet<Integer> createTipp1() {
		// TreeSet IS A NavigableSet
		// Integer has a natural ordering (the class Integer implements Comparable)
		// Integer overrides equals()
		// Set does not allow duplicates
		NavigableSet<Integer> zahlen = new TreeSet<>();
		while (zahlen.size() < 6) {
			zahlen.add((int) (Math.random() * 49 + 1));
		}
		return zahlen;
	}

	// variante 2: wie liefern ein array von int
	public static int[] createTipp2() {
		// TODO
		return null;
	}

	// variante 3: wie liefern eine ArrayList

	public static ArrayList<Integer> createTipp3() {
		// TODO
		return null;
	}

	// variante 4: wie liefern ein BitSet
	public static BitSet createTipp4() {
		// TODO
		return null;
	}

	// variante 5: wie liefern einen long, in dem genau 6 bits
	// auf 1 gesetzt werden, und zwar an den positionen zwischen 1 und 49
	public static long createTipp5() {
		// wir durchlaufen eine schleife so lange, bis bits genau 6 einserbits hat.
		// die methode bitCount() von Long ist hier nützlich.
		long bits = 0;
		while (Long.bitCount(bits) != 6) {
			bits |= (1L << (int) (Math.random() * 49 + 1));
		}
		return bits;
	}

	
	// die methode liefert ein set mit 6 verschiedenen zahlen zwischen 1 und 49.
	// der aufrufer kann bis zu 6 zahlen vorgeben, die fehlenden zahlen werden
	// per randomizer erzeugt.
	// bei fehlerhaften argumenten werfen wir eine passende exception.
	// wir testen in LottoUtilDemo.
	public static NavigableSet<Integer> createTipp6(int... zahlen) throws IllegalArgumentException {
		if (zahlen.length > 6) {
			throw new IllegalArgumentException("too many arguments...");
		}
		NavigableSet<Integer> tipp = new TreeSet<>();
		for (int zahl : zahlen) {
			if (zahl < 1 || zahl > 49) {
				throw new IllegalArgumentException("invalid value...");
			}
			tipp.add(zahl);
		}
		if (tipp.size() < zahlen.length) {
			throw new IllegalArgumentException("duplicates not allowed...");
		}
		while (tipp.size() < 6) {
			tipp.add((int) (Math.random() * 49 + 1));
		}
		return tipp;
	}

	
	
	
	
	
	
	
	
	/*
	 * wir schreiben die methode isValidTipp(). sie prüft, ob ein long-wert einem
	 * gültigen tipp entspricht (also genau 6 einserbits an positionen zwischen 1
	 * und 49 hat).
	 */
	public static boolean isValidTipp(long zahl) {
		return zahl >= 126 && zahl <= 554_153_860_399_104L && Long.bitCount(zahl) == 6;
//		return zahl > 1 && Long.bitCount(zahl) == 6 && Long.highestOneBit(zahl) < (1 << 50)  && (zahl & 1L) == 0;  
//		return zahl > 1 && Long.bitCount(zahl) == 6 && Long.highestOneBit(zahl) < (1L << 50);
	}

	
	
	
	
	
	
	
	// wir schreiben die methode tippAsString(). sie liefert zu einem als
	// long-wert gegebenen tipp eine brauchbare string-repräsentation.
	// bsp.:
	// 0000000000000000000000000000000000000000000000010000000101110010
	// sollte folgenden string liefern: "1 4 5 6 8 16"

	// die methode wirft eine IllegalArgumentException, falls die
	// übergebene zahl keinen gültigen tipp darstellt.

	public static String tippAsString(long tippAsBits) throws IllegalArgumentException {
		// TODO
		return null;
	}

	// die methode liefert die gewinnklasse, zu der ein tipp im spiel
	// 6 aus 49 gehört.
	// tippZahlen und ziehungsZahlen sind als long-werte mit genau
	// 6 einserbits gegeben.
	public static int gkl6Aus49(long ziehungsZahlen, long tippZahlen, int superzahl, int losnummer) {
		// TODO
		return 0;
	}

}
