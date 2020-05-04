package wbs.exceptions;

import java.io.IOException;
import wbs.util.NumberUtil;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// wir berechnen die summe aller zeilen aus lines.txt
// wir geben diese summe aus und die anzahl aller zeilen, 
// die nicht in eine zahl umgewandelt werden konnten.

public class MultiCatchDemo {
	static double summe;
	static int count;
	static List<String> lines;

	// wir wandeln alle zeilen der Datei brueche.txt in double-werte um
	// und geben die summe aus.
	// wir verwenden dazu die mathode parseBruch() von NumerUtil.
	// wir verwenden ein multi-catch.

	// zusätzlich zur summe geben wier die anzahl der fehlerhaften zeilen aus.

	public static void main(String[] args) {
		String file = "resources/io/brueche.txt";
		Path path = Paths.get(file);

		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			System.out.println("IOException");
		}
		for (String line : lines) {
			try {
				// Teilen durch 0 wirft keine Exception sondern liefert "infinity"
				if (!Double.isInfinite(NumberUtil.parseBruch(line))) {
					summe += NumberUtil.parseBruch(line);
				}
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("NumberFormatException / ArithmeticException : " + e.getMessage());
				count++;
			}
		}
		System.out.println("Summe: " + summe);
		System.out.println("Nicht-Brüche: " + count);
		
		System.out.println(lines instanceof List);
		System.out.println(lines instanceof java.util.Collection);
		System.out.println(lines instanceof java.util.ArrayList);
	}
}
