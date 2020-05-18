package wbs.util;

import java.math.BigInteger;

public class EulerscheZahlDemo {

	// wir berechnen näherungsweise die eulersche zahl
	// 1/0! + 1/1! + 1/2! ... 1/10!
	// das ergebnis geben wir aus als BigRational und als double
	public static void main(String[] args) {

		int genauigkeit = 18;	// bei 18 wird die Genauigkeit von double Überschritten
		BigRational eule = new BigRational(1, 1);

		for (int i = 1; i < genauigkeit; i++) {
			eule = eule.add(new BigRational(BigInteger.ONE, factorial(BigInteger.valueOf(i))));
//			System.out.println(i + " : " + eule.doubleValue());
		}
		System.out.println(eule);
		System.out.println(eule.doubleValue());
	}

	public static BigInteger factorial(BigInteger fact) {
		for (BigInteger i = fact; i.compareTo(BigInteger.ONE) > 0;) {
			i = i.subtract(BigInteger.ONE);
			fact = fact.multiply(i);
		}
		return fact;
	}
}
