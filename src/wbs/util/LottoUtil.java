package wbs.util;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

// wir schreiben die methode randomTipp(). sie liefert 6 verschiedene zahlen
// zwischen 1 und 49 in geeigneter Form.
public class LottoUtil {

	// variante 1: wir liefern ein sortiertes set von Integer
	public static NavigableSet<Integer> createTipp1() {
		NavigableSet<Integer> t = new TreeSet<>();
		while (t.size() < 6) {
			t.add((int) (Math.random() * 49 + 1));
		}
		return t;
	}

	// variante 2: wir liefern ein array von int
	public static int[] createTipp2() {
		int a[] = new int[6];
		System.out.println(a.length);
		Random random = new Random();
//		for (int i = 1; i< 5000; i++) {
//		if (random.nextInt(49)+1 == 49)
//			System.out.print(49);
//		else if (random.nextInt(49)+1 == 0)
//			System.out.print(0);
//	}
		for (int i = 0; i < a.length; i++) {

		}
//		random.nextInt(49)+1;
		return null;
	}

	// variante 3: wir liefern eine ArrayList
	public static ArrayList<Integer> createTipp3() {

		return null;
	}

	// variante 4: wir liefern ein BitSet
	public static BitSet createTipp4() {

		return null;
	}

	// variante 5: wir liefern einen long, in dem genau 6 bits
	// auf 1 gesetzt werden, und zwar an den positionen zwischen 1 und 49
	public static long createTipp5() {
		long bits = 0;
		while (Long.bitCount(bits) != 6) {
			bits |= (1L << (int) (Math.random() * 49 + 1));
		}
		return bits;
	}

	// die methode liefern ein set mit 6 zahlen zwischen 1 und 49
	// der aufrufer kann bis zu 6 zahlen vorgeben, die fehlenden zahlen werden per
	// randomizer erzeugt.
	// bei fehlerhaften argumenten werfen wir eine passende exception
	// wir testen in LottoUtilDemo.
	public static NavigableSet<Integer> createTipp6(int... zahlen) { 
		if (zahlen.length > 6) {
			throw new IllegalArgumentException("Es können maximal 6 Zahlen übergeben werden.");
		}
		NavigableSet<Integer> t = new TreeSet<>();
		for (int zahl : zahlen) {
			if (zahl < 1 || zahl >49) {
				throw new IllegalArgumentException("Zahlen müssen zwischen 1 und 49 liegen.");
			}
			t.add(zahl);
		}
		
		while (t.size() < 6) {
			t.add((int) (Math.random() * 49 + 1));
		}
		
		return t; 
	}

}
