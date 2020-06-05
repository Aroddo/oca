package wbs.selbstlerntag3;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

class C151 {
	String s;
	int n;

	public C151(String s, int n) {
		this.s = s;
		this.n = n;
	}
}

public class C15 {
	public static void main(String[] args) {
		BiFunction<String, Integer, C151> function = (s, n) -> {
			return new C151(s, n);
		};
		Set<C151> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(function.apply(i + "", i));
		}
		System.out.println(set.size());
	}
}

