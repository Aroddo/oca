package wbs.exceptions;

public class Unchecked1Demo {

	// Das Programm wird mit 2 Argumenten aufgerufen.
	// es wandelt jedes Argument in einen int um.
	// dann gibt es die summe aus.
	// wir bauen kein exception-handling ein.
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(a + b);
	}

}
