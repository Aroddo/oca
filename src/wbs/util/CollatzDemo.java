package wbs.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollatzDemo {
	public static void main(String[] args) {
		Integer[] numbers = { 19, 100, 131, 534, 1234, 5747, 4566, 232578 };
		List<Integer> lists = Arrays.asList( 19, 100, 131, 534, 1234, 5747, 4566, 232578 );
		

		for (int i : numbers) {
			System.out.println(NumberUtil.collatz(i));
		}

	}
}