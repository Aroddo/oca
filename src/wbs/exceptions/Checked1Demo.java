package wbs.exceptions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Checked1Demo {

	// wir geben alle Zeilen der Datei Checed1Demo.java aus.
	// wie verwenden die folgenden Klassen und Interfaces:
	// java.nio.file.Files mit der Methode readAllLines()
	// java.nio.file.Paths mit der Methode get()
	// java.nio.file.Path;

	public static void main(String[] args) {
		String file = "src/wbs/exceptions/Checked1Demo.java";
		Path path = Paths.get(file);
		List<String> lines = null ;
		int linenumber = 1;
		
		System.out.println(file);
		System.out.println(path);
		
		
		try {
		lines = Files.readAllLines(path);
		} catch (IOException e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		
		for (String line: lines) {
			System.out.println(linenumber++ + ":\t " +line);
		}
		System.out.println(lines.getClass());
		
	}

}
