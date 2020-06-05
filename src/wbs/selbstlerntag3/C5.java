package wbs.selbstlerntag3;

import java.util.Arrays;
import java.util.function.Supplier;

public class C5 {
	public static double[] f(int n, Supplier<Double> supplier) {
		double[] da = new double[n];
		for (int i = 0; i < da.length; i++) {
			da[i] = supplier.get();
		}
		return da;
	}

	public static void main(String[] args) {
		Supplier<Double> supplier = () -> {
			return Math.random();
		};
		System.out.println(Arrays.toString(f(10, supplier)));
	}
}