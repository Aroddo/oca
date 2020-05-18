package wbs.interfaces_lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class PredicateImpl implements Predicate<Integer> {
	@Override
	public boolean test(Integer i) {
		return i % 3 == 0;

	}
}

public class RemoveIfDemo {

	public static void main(String[] args) {
		List<Integer> zahlen = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			zahlen.add(i);
		}
		System.out.println(zahlen);

		System.out.println("--- hilfsklasse ---");
		zahlen.removeIf(new PredicateImpl());
		System.out.println(zahlen);

		System.out.println("--- anonyme Klasse ---");
		Predicate predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) { return i % 7 == 0; }
		};
		System.out.println(zahlen);

		System.out.println("--- lambda ---");
		zahlen.removeIf(i -> i % 11 == 0);
		System.out.println(zahlen);
	}

}