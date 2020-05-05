package wbs.util;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class NumberUtil {

	// wir schreiben die methode fakultaet()
	// sie berechnet das produkt aller zahlen von 1 bis n
	// 4! => 1 * 2 * 3 * 4 = 24
	// 6! => 1 * 2 * 3 * 4 * 5 * 6 = 720
	// als ergebnistyp BigIngeter (java.math)

	public static BigInteger fakultaet(int n) throws IllegalArgumentException {
		BigInteger fak = BigInteger.ONE;

		if (n < 0)
			throw new IllegalArgumentException("N muss >= 0 sein");
		else {
			for (int i = 1; i <= n; i++) {
				fak = fak.multiply(BigInteger.valueOf(i));
			}
		}
		return fak;
	}

	// wir schreiben die methode parseBruch()
	// sie wandelt einen als string gegebenen bruch in einen double um.

	// "1/2" => 0.5
	// "4/5" => 0.5
	// "4" => 4.0
	// "1/a" => NumberFormatException
	// "3/0" => ArithmeticException

	public static double parseBruch(String bruch) throws NumberFormatException, ArithmeticException {
		double bruchWert = 0;
		double nenner, zaehler;
		int index = bruch.lastIndexOf("/");

		if (index == -1) { // Nur Zähler
			bruchWert = Double.parseDouble(bruch);
		} else if (index == 0) { // Führendes "/"
			throw new NumberFormatException("Führendes \"/\"");
		} else if (index == bruch.length() - 1) { // Abschließendes "/"
			throw new NumberFormatException("Abschließendes \"/\"");
		} else { // Alles andere.
			zaehler = Integer.parseInt(bruch.substring(0, index));
			nenner = Integer.parseInt(bruch.substring(index + 1, bruch.length()));
			bruchWert = zaehler / nenner;
		}
		return bruchWert;
	}

	public static List<Long> teiler(long zahl) throws ArithmeticException {
		long teiler1;		
		List<Long> list = Arrays.asList();
		
		for (long l = zahl/2; l > 1; l-- ) {
			if (zahl % l == 0 ) {
				list.add(l);
			}			
		}
		return list;
	}
}
