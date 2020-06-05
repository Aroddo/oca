package wbs.selbstlerntag3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class C12 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Predicate<Number> p = n -> n.intValue() > 4;
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(8);
		numbers.removeIf(p);
		System.out.println(numbers.size());
	}
}