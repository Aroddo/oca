package wbs.exceptions;
import static java.lang.Integer.parseInt;

public class Unchecked4Demo {

	// programm mit beliebig vielen argumenten.
	// alles int summieren.
	// ausgabe, wieviele nicht erfolgreiche umwandlungen.

	public static void main(String[] args) {
		int sum = 0, count = 0;

		for (String arg : args) {
			try {
				sum += parseInt(arg);
			} catch (NumberFormatException  e) {
				count++;
				System.out.println("Nicht verwertbar: " + arg);
			}
		}
		System.out.println("Summe: " + sum);
		System.out.println("Nicht-Integer Parameter: " + count);

	}
}
