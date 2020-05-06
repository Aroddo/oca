package wbs.util;

import java.util.ArrayList;

public class BigRationalDemo {
	// wir bestücken ein array mit einigen strings.
	// wir iterieren über alle elemente des arrays und wendeln jeden
	// string in ein BigRational-objekt um und geben dieses objekt aus.
	// wir fangen alle möglichen exceptions ab.
	public static void main(String[] args) {
		String[] sBrueche = { "10/100", "100/10", "100", "pause?", "100/0", "10/", "/100", "100/x", "-41/-11", "-41/10",
				"44/-9" };

		ArrayList<BigRational> rBrueche = new ArrayList<BigRational>();

		for (String bruch : sBrueche) {
			try {
				rBrueche.add(BigRational.valueOf(bruch));
			} catch (NumberFormatException e) {
				System.out.println("Exception!  " + e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println("Exception!  " + e.getMessage());
			}
		}

		rBrueche.forEach(System.out::println);
	}
}
