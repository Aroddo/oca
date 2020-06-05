package wbs.selbstlerntag3;

import java.util.function.BiFunction;

public class C4 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> f = (n, m) -> Integer.toString(n + m);
		System.out.println(f.apply(2, 3));
	}
}