package wbs.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoUtilDemo {

	public static void main(String[] args) {
//		System.out.println(LottoUtil.createTipp1());
//		System.out.println(LottoUtil.createTipp5());
//		System.out.println(String.format("%-49s %s %n%s49 %s", 
//				Long.toBinaryString(LottoUtil.createTipp5()),1,
//				Long.toBinaryString(LottoUtil.createTipp5()),2));

		System.out.println("#########");

		List<int[]> listOfintArrays = new ArrayList<int[]>();
		int[] a = { 1, 2, 3 };
		int[] b = { -7, 11, 13 };
		int[] c = { 3, 5, 5, 3 };
		int[] d = { 17, 19, 21, 23, 29, 31, 37 };
		int[] e = {};
		listOfintArrays.add(a);
		listOfintArrays.add(b);
		listOfintArrays.add(c);
		listOfintArrays.add(d);
		listOfintArrays.add(e);

		System.out.println(a);
		
		for (int[] zahlen : listOfintArrays) {
			try {
				System.out.println("Übergeben: " + Arrays.toString(zahlen));
				System.out.println("Ergebnis: " + LottoUtil.createTipp6(zahlen));
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			} finally {
				System.out.println("------");
			}
		}

	}
}
