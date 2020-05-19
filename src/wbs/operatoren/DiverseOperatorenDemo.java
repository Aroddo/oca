package wbs.operatoren;

public class DiverseOperatorenDemo {
	public static void main(String[] args) {
		int n1 = 3;
		System.out.println(n1++); // 3
		System.out.println(++n1); // 5
		System.out.println(n1 ^ n1); // 0
		int n2 = 5;
		System.out.println(n2 <<= 4); // 80
		System.out.print("1 << 31 : ");
		System.out.println(1 << 31); // -2147483648
		System.out.println(~0); // -1
		
		System.out.println(~0 >>> 1); // 2147483647
		System.out.println(~0 >> 1); // -1
		System.out.println(~0 >> 2); // -1
		String s = (n2 == 5) ? "gleich" : "ungleich";
		System.out.println(s); // ungleich
		boolean b1 = false;
		System.out.println(b1 == true); // false
		System.out.println(b1 = true); // true
		boolean b21 = true;
		boolean b22 = false;
		System.out.println(b21 || (b22 = true)); // true
		System.out.println(b22); // false
		boolean b31 = true;
		boolean b32 = false;
		System.out.println(b31 | (b32 = true)); // true
		System.out.println(b32); // true
		
		
		System.out.println(Integer.toBinaryString(1000
				));
	}
}
