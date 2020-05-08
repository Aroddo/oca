package wbs.util;

import java.util.ArrayList;

public class BigRationalDemo {
	// wir bestücken ein array mit einigen strings.
	// wir iterieren über alle elemente des arrays und wendeln jeden
	// string in ein BigRational-objekt um und geben dieses objekt aus.
	// wir fangen alle möglichen exceptions ab.
	public static void main(String[] args) {
		String[] sBrueche = { "2/3", "3/4", "10/100", "100/10", "100", "pause?", "100/0", "10/", "/100", "100/x", "-41/-11", "-41/10",
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
		
		
		// Teste Grundrechenarten
		
		BigRational zweiDrittel = BigRational.valueOf("2/3") ;
		BigRational dreiViertel = BigRational.valueOf("3/4") ;
				
		System.out.println(zweiDrittel + "  +  " + dreiViertel + "  =  " + zweiDrittel.add(dreiViertel));
		System.out.println(zweiDrittel + "  -  " + dreiViertel + "  =  " + zweiDrittel.subtract(dreiViertel));
		System.out.println(zweiDrittel + "  *  " + dreiViertel + "  =  " + zweiDrittel.multiply(dreiViertel));
		System.out.println(zweiDrittel + "  /  " + dreiViertel + "  =  " + zweiDrittel.divide(dreiViertel));
		
		System.out.println("inverse " + zweiDrittel + " = " +  zweiDrittel.inverse());
		System.out.println("negate  " + zweiDrittel + " = " +  zweiDrittel.negate());
		
		System.out.println(zweiDrittel + "  compareTo  " + zweiDrittel + "  =  " + zweiDrittel.compareTo(zweiDrittel));
		System.out.println(zweiDrittel + "  compareTo  " + dreiViertel + "  =  " + zweiDrittel.compareTo(dreiViertel));
		System.out.println(dreiViertel + "  compareTo  " + zweiDrittel + "  =  " + dreiViertel.compareTo(zweiDrittel));
	}
}
