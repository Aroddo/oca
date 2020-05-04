package wbs.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// bir berechnen die summe aller zeilen aus lines.txt
// wir geben diese summe aus und die anzahl aller zeilen, 
// die nicht in eine zahl umgewandelt werden konnten.

public class CheckedUncheckedDemo {
	static int summe, count;
	public static void main(String[] args) {
		String file = "resources/io/lines.txt";
		Path path = Paths.get(file);
		List<String> lines = null;

		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			System.out.println("IOException");
		}
		for (String line : lines) {
			try {					
				summe += Integer.parseInt(line);
			} catch (NumberFormatException e) {	
				System.out.println("NumberFormatException");
				count++;
			}
		}
		System.out.println("Summe: " + summe);
		System.out.println("Nicht-Zahlen: " + count);
	}
}
