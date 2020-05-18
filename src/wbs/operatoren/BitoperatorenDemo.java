package wbs.operatoren;

import java.math.BigInteger;

public class BitoperatorenDemo {
	static String toBinaryString(int zahl) {
		StringBuffer sb = new StringBuffer(32);
		for (int n = (1 << 31); n != 0; n >>>= 1) {
			sb.append((zahl & n) != 0 ? 1 : 0);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 29;
		int n3 = -1;
		System.out.println(toBinaryString(n1));
		System.out.println(toBinaryString(n2));
		System.out.println(toBinaryString(n1 & n2) + " & ");
		System.out.println();
		System.out.println(toBinaryString(n1));
		System.out.println(toBinaryString(n2));
		System.out.println(toBinaryString(n1 | n2) + " | ");
		System.out.println();
		System.out.println(toBinaryString(n1));
		System.out.println(toBinaryString(n2));
		System.out.println(toBinaryString(n1 ^ n2) + " ^ ");
		System.out.println();
		System.out.println(toBinaryString(n1 << 3) + " << ");
		System.out.println();
		System.out.println(toBinaryString(n3 >> 1) + " >> ");
		System.out.println();
		System.out.println(toBinaryString(n3 >>> 1) + " >>> ");
		System.out.println();

		String s;
		for (int j = 0; j < 33; j++) {
			s = Integer.toBinaryString(1 << j);
			System.out.println(
					j 							+ "\t" + // shift-counter
					String.format("%33s", s) 	+ "\t" + // binärwert nach shift
					new BigInteger(s, 2));				 // Dezimalwert nach shift
		}
	}
}
