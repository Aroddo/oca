package wbs.util;

import java.util.Arrays;
import java.util.List;


public class NumberUtilDemo {

	public static void main(String[] args) {
		// Fakultät von 100
//		System.out.println(NumberUtil.fakultaet(10));

		String[] brueche = { "10/100", "100/10", "100", "pause?", "100/0", "10/", "/100", "100/x" };

		for (String bruch : brueche) {
			try {
				System.out.println(NumberUtil.parseBruch(bruch));

			} catch (NumberFormatException e) {
				System.out.println("NumberFormatException: " + e.getMessage());
			}
		}
		
		
		List<Long> list = NumberUtil.teiler(100);
//		Arrays.asList(10,28,100).forEach(n -> System.out.println(NumberUtil.teiler(n)));
		
		
		
	}

}
