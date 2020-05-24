package wbs.interfaces_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import wbs.util.NumberUtil;

public class ConflictingNamesDemo {
	public static <T> int count(List<T> list, Predicate<T> predicate) {
		int n = 0;
		for (T t : list) {
			if (predicate.test(t)) {
				n++;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int n;
// n = count(list, n -> n % 2 == 0); compilerfehler
		n = count(list, e -> e % 2 == 0);
		System.out.println(n);

		
		List<Integer> listInteger = 
			IntStream.rangeClosed(100, 999).boxed().collect(Collectors.toList());

		Predicate has3PrimeFactorials = t -> {
			return NumberUtil.primfaktoren((Integer) t).size() == 3;
		};

		System.out.println("Anzahl Zahlen mit genau 3 Primfaktoren: " + 
			count(listInteger, has3PrimeFactorials)
		);

	}

	// wie viele 3-stellige zahlen haben genau 3 primfaktoren
	// wie verwenden methode count() und primfaktoren() von NumberUtil

}