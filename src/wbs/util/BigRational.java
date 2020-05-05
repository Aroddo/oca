package wbs.util;

import java.math.BigDecimal;

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
 * mir ist das egal.
 */

// welche felder bräuchte die klasse?
/*
 * (rationalwert),  zaehler,  nenner
 */

// welchen typ sollten diese felder haben?
/*
 * double, BigDecimal, BigDecimal
 */

// sollten diese felder als final deklariert werden?
/*
 * Nein.
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


// welche typen sollten die parameter der methoden / konstruktoren haben?

// was sollte der return-typ der methoden sein?

// welche der methoden sollten static sein, welche nicht?

// welche exceptions sollten die methoden / konstruktoren ggf deklarieren?

// sollten brüche intern immer in gekürzter form vorliegen?

public class BigRational extends java.lang.Number {
	public static void main(String[] args) {

		BigDecimal bd;
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

}
