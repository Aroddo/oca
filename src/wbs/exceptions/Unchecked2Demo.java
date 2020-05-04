package wbs.exceptions;

public class Unchecked2Demo {

	// Das Programm wird mit 2 Argumenten aufgerufen.
	// es wandelt jedes Argument in einen int um.
	// dann gibt es die summe aus.
	// wir bauen exception-handling ein und verwenden try, catch und finally.
	// wir verwenden nur einen einzigen catch-block

	public static void main(String[] args) {
		int a , b ;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.println(a + b);
		} catch (NumberFormatException e) {
			System.out.println("Es müssen 2 Integer übergeben werden.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Mindestens 2 Parameter!");
		} finally {
			System.out.println("Finally Block");
		}

	}

}
