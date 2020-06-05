package wbs.arrays;

public class C6 {
	static void m(int[] mia, Integer mi) {
		mia[0] = 12345;
		mi = 0;
		mia = null;
		System.out.println("leaving m");
	}

	public static void main(String[] args) {
		int[] ia = { 1, 2, 3, 4 };
		Integer i = 10;
		m(ia, i);
		System.out.println(ia[0]); // 12345
		System.out.println(ia != null); // true
	}
}