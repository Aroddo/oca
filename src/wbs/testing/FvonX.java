package wbs.testing;



import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FvonX {
	public static void main(String[] args) {
		// Gerade Zahlen
		IntPredicate fx1 = x -> {					// definiere Predicate fx1, x ist ein int
			return (x % 2 == 0);						// liefert true wenn x gerade ist
		};												//

		IntStream.rangeClosed(1, 100)				// Erzeuge int-Range von 1 .. 100
				.filter(fx1)							// filter Range nach fx1
				.forEach(								// schiebe alle gefilterten Restelemente
						i -> System.out.print(i + " ")  // in den Consumer System.out.print
				);										//
	}
}
