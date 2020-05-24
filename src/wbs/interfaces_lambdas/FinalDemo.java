package wbs.interfaces_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FinalDemo {

	public static <T, R> void m(List<T> values, Function<T, R> function) {
		for (T t : values) {
			R r = function.apply(t);
			System.out.println(r);
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1 = "hier der funktionswert von ";
		String s2 = "hier der funktionswert von ";
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		// ok
		m(list, t -> {
			System.out.print(s1 + t + ":");
			return t * t;
		});
		// compilerfehler
		// m(list, t -> {System.out.print(s2 + t + ":");return t * t;});
		// s2 = "abc";
		
		
		// wir bestücken eine weitere list mit einigen strings.
		// dann geben wir diese strings aus, zusammen mit ihrer länge
		// und benutzen dazu die methode m()
		
		List<String> listOfStrings = Arrays.asList("asd","fgjh","lllhlhlh","yxvxcvblh","o7n59n6b");
		m(listOfStrings, u -> {
			System.out.printf("length(%s) = " ,u);
			return u.length();
		});
		
		
		
	}
}