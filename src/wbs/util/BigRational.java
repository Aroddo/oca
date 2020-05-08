package wbs.util;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * die nachstehende klasse BigRational soll das exakte rechnen mit bruchzahlen ermöglichen.
 * das potenzieren von bruchzahlen mit ganzen zahlen soll möglich sein.
 * der kehrwert soll gebildet werden können.
 * wir wollen also dinge rechnen können wie 2/3 + 4/5, 17/6 * 32/7, ..., 1/(4/5),..., (13/16) ^ 5, ...
 *  1/(4/5) = 1 * (5/4)
 *  5/4
 *  
 *  2/3 + 4/5  = 10/15 + 12/15  = 22/15
 *  
 *  BigRational bd1 = new BigRational(2,3);
 *  BigRational bd2 = new BigRational(4,5);
 *  
 *  Variante 1:
 *  bd1 = bd1 + bd2;
 *  
 *  Variante 2:
 *  bd1.add(bd2);
 *  
 *  
 *  
 * zaehler und nenner eines bruches sollen beliebig grosse ganze zahlen sein.
 * bitte beantworten sie die folgenden fragen:
 */

// was wählen wir als basisklasse?
/* 
 * Number
 */

// soll die klasse ein natural ordering haben?
/*
 * Ja. Rationale Zahlen sind sortierbar.
 */

// falls ja: welches interface müssen wir dann implementieren? welche methode(n)? wie?
/*
 * Comparable<Double> 
 */

// sollen instanzen der klasse immutable sein?
/*
 * Analog zur Klasse Double: ja.
 */

// welche felder bräuchte die klasse?
/*
 *   zaehler,  nenner
 */

// welchen typ sollten diese felder haben?
/*
 *  BigDecimal, BigDecimal
 */

// sollten diese felder als final deklariert werden?
/*
 * Ja.
 */

// sollen wir die methoden equals() / hashCode() überschreiben? falls ja: wie?
/*
 * 2/3 == 4/6  => true
 * equals 	: JA
 * 
 * 2/3 =hashCode= 4/6  => false
 * hashCode : JA
 */

// welche sonstigen methoden von Object sollten überschrieben werden?
/*
 * toString();
 */

// welche methoden und konstruktoren sollte die klasse anbieten?
/*
 * Constructor:	BigInteger zaehler, BigInteger nenner
 * Constructor:	BigRational
 * 
 * add
 * 		BigRational			-	bruch + bruch
 * 		zaehler, nenner		-	bruch + bruch als zaehler/nenner
 * 		zaehler 			-	bruch +	zaehler/1	
 * subtract
 * 		BigRational			-	bruch - bruch
 * 		zaehler, nenner		-	bruch - bruch als zaehler/nenner
 * 		zaehler 			-	bruch -	zaehler/1	
 * multiply
 * 		BigRational			-	bruch * bruch
 * 		zaehler, nenner		-	bruch * bruch als zaehler/nenner
 * 		zaehler 			-	bruch *	zaehler/1	
 * divide
 * 		BigRational			-	bruch / bruch
 * 		zaehler, nenner		-	bruch / bruch als zaehler/nenner
 * 		zaehler 			-	bruch /	zaehler/1	
 */
// welche methoden und konstruktoren sollte die klasse anbieten?
/*
 * Constructor: BigInteger zaehler, BigInteger nenner Constructor: BigRational
 * 
 * add BigRational - bruch + bruch zaehler, nenner - bruch + bruch als
 * zaehler/nenner zaehler - bruch + zaehler/1 subtract BigRational - bruch -
 * bruch zaehler, nenner - bruch - bruch als zaehler/nenner zaehler - bruch -
 * zaehler/1 multiply BigRational - bruch * bruch zaehler, nenner - bruch *
 * bruch als zaehler/nenner zaehler - bruch * zaehler/1 divide BigRational -
 * bruch / bruch zaehler, nenner - bruch / bruch als zaehler/nenner zaehler -
 * bruch / zaehler/1
 */

// welche typen sollten die parameter der methoden / konstruktoren haben?

// was sollte der return-typ der methoden sein?

// welche der methoden sollten static sein, welche nicht?

// welche exceptions sollten die methoden / konstruktoren ggf deklarieren?

// sollten brüche intern immer in gekürzter form vorliegen?
/*
 * ja
 */

public class BigRational extends java.lang.Number implements Comparable<BigRational> {
	private final BigInteger numerator;
	private final BigInteger denominator;

	private static final long serialVersionUID = 1L;

	public BigRational(BigRational r) {
		// TODO bruch kürzen
		this.numerator = r.getNumerator();
		this.denominator = r.getDenominator();
	}

	public BigRational(BigInteger numerator, BigInteger denominator) throws ArithmeticException {
		// da unsere brüche immer in gekürzter form vorliegen sollen,
		// müssen wir zähler und nenner durch den groessten gemeinsamen Teiler
		// dividieren.
		// die klasse BigInteger bietet dazu die Methode gcd() an (greatest common
		// divisor).
		// wir müssen auch sicherstellen, dass ein eventuelles vorzeichen im zähler
		// liegt

		// TODO bruch kürzen
		BigInteger ggT = numerator.gcd(denominator);
		if (denominator.equals(BigInteger.ZERO))
			throw new ArithmeticException("NULL im Zähler? Tsktsktsk.");
		if (!numerator.equals(BigInteger.ZERO)) { // Bei numerator = 0 wollen wir den Bruch 0/1 haben
			BigInteger gcd = numerator.gcd(denominator);
			numerator = numerator.divide(gcd);
			denominator = denominator.divide(gcd);
			if (denominator.compareTo(BigInteger.ZERO) < 0) {
				numerator = numerator.negate();
				denominator = denominator.negate();
			}
		} else {
			denominator = BigInteger.ONE;
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public BigRational(long numerator, long denominator) throws ArithmeticException {
		// TODO bruch kürzen
		this(BigInteger.valueOf(numerator), BigInteger.valueOf(denominator));
	}

	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	public static BigRational valueOf(String s) throws ArithmeticException, NumberFormatException {
		BigInteger numerator;
		BigInteger denominator;

		int pos = s.indexOf('/');
		if (pos < 0) {
			numerator = new BigInteger(s);
			denominator = BigInteger.ONE;
		} else {
			numerator = new BigInteger(s.substring(0, pos));
			denominator = new BigInteger(s.substring(pos + 1));
		}
		return new BigRational(numerator, denominator);
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(BigRational o) {
		BigInteger z1 = this.numerator.multiply(o.getDenominator());
		BigInteger z2 = o.getNumerator().multiply(this.denominator);
		return z1.compareTo(z2);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		if (obj != null) {
			if (obj instanceof BigRational) {
				if (this.numerator.equals(((BigRational) obj).getNumerator())
						& this.denominator.equals(((BigRational) obj).getDenominator())) {
					b = true;
				}
			}
		}
		return b;
	}

	@Override
	public String toString() {
		String s = " ";
		if (this.numerator.signum() < 0) {
			s = "";
		}
		s = s + this.numerator + "/" + this.denominator;
		return s;
	}

	public double toDouble() {
		return this.toDouble(2);
	}

	public double toDouble(int stellen) {
		return Math.round(
				(numerator.doubleValue() / denominator.doubleValue()) * Math.pow(10, stellen))
				/ Math.pow(10, stellen);
	}

	/*
	 * Arithmetische Methoden
	 */
	/**
	 * Returns the inverse of this fraction as BigRational
	 * 
	 * @return inverted BigRational
	 * @throws ArithmeticException
	 */
	public BigRational inverse() throws ArithmeticException {
		return new BigRational(this.denominator, this.numerator);
	}

	/**
	 * Returns the negative value of this fraction
	 * 
	 * @return negated BigRational
	 */
	public BigRational negate() {
		return new BigRational(this.numerator.negate(), this.denominator);
	}

	/**
	 * Adds another fraction to this fraction.
	 * 
	 * @param r the fraction to be added
	 * @return The sum of both fractions as BigRational
	 */
	public BigRational add(BigRational r) {
		return new BigRational(
				(this.getNumerator().multiply(r.getDenominator()))
						.add(r.getNumerator().multiply(this.getDenominator())),
				this.getDenominator().multiply(r.getDenominator()));
	}

	/**
	 * Subtracts another fraction from this fraction.
	 * 
	 * @param r the fraction to be subtracted
	 * @return The subtracted result of both fractions as BigRational
	 */
	public BigRational subtract(BigRational r) {
		return this.add(r.negate());
	}

	/**
	 * Multiply this fraction with given fraction.
	 * 
	 * @param r the fraction to be multiplied with
	 * @return The sum of both fractions as BigRational
	 */
	public BigRational multiply(BigRational r) {
		return new BigRational((this.getNumerator().multiply(r.getNumerator())),
				(this.getDenominator().multiply(r.getDenominator())));
	}

	/**
	 * Divide this fraction by given fraction.
	 * 
	 * @param r the fraction dividing this fraction
	 * @return
	 */
	public BigRational divide(BigRational r) {
		return this.multiply(r.inverse());
	}

	public BigRational pow(int n) throws ArithmeticException {
		return this;
	}
}
