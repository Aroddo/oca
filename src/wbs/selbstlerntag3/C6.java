package wbs.selbstlerntag3;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class C6 {
	public static Number[] f(int n, Supplier<? extends Number> supplier) {
		Number[] na = new Number[n];
		for (int i = 0; i < na.length; i++) {
			na[i] = supplier.get();
		}
		return na;
	}

	public static void main(String[] args) {
		Supplier<Double> supplier = () -> {
			return Math.random();
		};
		System.out.println(Arrays.toString(f(10, supplier)));
		Random random = new Random();
		System.out.println("----");
		System.out.println(Arrays.toString(f(10, () -> Integer.valueOf(random.nextInt(1000)))));
	}
}