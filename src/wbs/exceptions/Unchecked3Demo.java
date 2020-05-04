package wbs.exceptions;

public class Unchecked3Demo {

	// Das Programm wird mit 2 Argumenten aufgerufen.
	// es wandelt jedes Argument in einen int um.
	// dann gibt es die summe aus.
	// wir bauen exception-handling ein und verwenden try, catch und finally.
	public static void main(String[] args) {
		int a , b ;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.println(a + b);
		} catch (RuntimeException e) {
			System.out.println("Fehler:" + e.getClass());
			
		} finally {
			System.out.println("Finally Block");
		}

	}
}
