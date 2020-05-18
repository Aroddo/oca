package wbs.constructors_methods_encapsulation;

public class ArithmetischesMittelDemo {

    // wir schreiben die statische methode arithmetischesMittel().
    // sie wird mit beliebig vielen int- werten als argument aufgerufen,
    // mindestens jedoch einem, und liefert den durchschnitt aller werte

    public static double arithmetischesMittel(int n, int... werte) {
	double summe = n;
	for (int wert : werte) {
	    summe += wert;
	}
	return summe / (werte.length + 1);
    }

    public static void main(String[] args) {
	// wir testen die obige methode mit verschiedenen parametern
	int[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	System.out.println(arithmetischesMittel(1, 2, 3, 4)); // 2.5
	System.out.println(arithmetischesMittel(10, ia)); // 5.5
	System.out.println(arithmetischesMittel(10, new int[] { 5, 8, 15, 2 }));  // 8.0
    }
}
