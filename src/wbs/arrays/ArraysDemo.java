package wbs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

public class ArraysDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] a1;
		int a2[];
		// int a[3]; // compilerfehler
		a1 = new int[5];
		System.out.println(a1[0]); // 0

		a2 = a1; 
		
		int[] a3 = { 1, 2, 3, 4, 5 };
		String[] a4 = { "blabla", "lalla", "gaga" };
		Object[] a5 = { "otto", new Integer(3), new Vector<String>(), a3, a4 };

		System.out.println(a5[0]); // otto

		System.out.println(a5.length); // 5

		int[][] b1 = { { 1 }, { 1, 2 }, { 1, 2, 3 } };
		for (int i = 0; i < b1.length; i++) {
			for (int j = 0; j < b1[i].length; j++) {
				System.out.print(b1[i][j] + " "); // 1 1 2 1 2 3
			}
		}
		System.out.println();
		b1[0] = a3;
		System.out.println(b1[0][4]); // 5
		a5[0] = b1;
		System.out.println(a5[0]); // [[I@10b62c9

		// a4 = a5; // compilerfehler
		a5 = a4;

		String s = new String(new char[] { 100, 101, 102 });
		System.out.println(s); // def

		String[] strings = new String[5];
		System.out.println(strings[2]); // null

		Integer[] ia51 = { 1, 2, 3, 4, 5 };
		int ia52[] = { 1, 2, 3, 4, 5,3,4,5 };
 
		
		String[][] ssa = new String[5][]; // ok.
		for (int i = 0; i < 5; i++) {
			ssa[i] = new String[i];
			for (int j = 0; j < ssa[i].length; j++) {
				ssa[i][j] = Integer.toString(j);
			}
		}
		System.out.println(ssa);
		System.out.println(Arrays.toString(ssa));
		System.out.println(Arrays.deepToString(ssa));

		int[] ia61 = { 1, 2, 3 };
		int[] ia62 = { 1, 2, 3 };
		System.out.println(ia61.equals(ia62)); // false
		System.out.println(Arrays.equals(ia61, ia62)); // true
		
		
		int[] iii = new int[5];
		System.out.println(iii[0]);
		
		char[][] ca = {{'1','2','3'},{'1','2','3'}};
	}
}
