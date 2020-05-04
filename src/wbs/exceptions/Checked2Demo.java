package wbs.exceptions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Checked2Demo {

	// wir machen dasselbe wi in Checked1Demo, verwenden aber kein try-catch

	public static void main(String[] args) throws IOException {
		String file = "src/wbs/exceptions/Checked1Demo.java";
		Path path = Paths.get(file);
		List<String> lines;
		int linenumber = 1;

		System.out.println(file);
		System.out.println(path);

		lines = Files.readAllLines(path);
		System.out.println("Exception");

		for (String line : lines) {
			System.out.println(linenumber++ + ":\t " + line);
		}

	}

}
