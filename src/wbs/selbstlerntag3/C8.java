package wbs.selbstlerntag3;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class C8 {
	public static <T> void g(Consumer<T> consumer, T t) {
		consumer.accept(t);
	}

	public static void main(String[] args) {
		BinaryOperator<Integer> f 	= (n,m) -> Integer.toString(n + m);
//		BinaryOperator<Integer, Integer, String> f 	= (n, m) -> Integer.toString(n + m);
		Consumer<Integer> consumer 					= (n) -> System.out.println(f.apply(n, n));
		
		g(consumer, 5);
	}
}