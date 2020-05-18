package wbs.constructors_methods_encapsulation;

class MutableInteger {

	private int zahl;

	public MutableInteger() {}

	public MutableInteger(int zahl) { this.zahl = zahl; }

	public void increment() { zahl++; }

	public int getZahl() { return zahl; }

	@Override
	public String toString() { return Integer.toString(zahl); }
}

public class ParameterDemo {

	public static void m(int n, Integer i, MutableInteger mi, String s, StringBuffer sb) {

		n++;
		i++;
		mi.increment();
		s = s.concat("def");
		sb.append("def");
		n = 100;
		i = Integer.valueOf(100);
		mi = new MutableInteger();
		s = "blabla";
		sb = new StringBuffer("blabla");
	}

	public static void main(String[] args) {
		int n = 10; // primitiver datentyp
		Integer i = Integer.valueOf(10); // immutable
		MutableInteger mi = new MutableInteger(10); // mutable
		String s = "abc"; // immutable
		StringBuffer sb = new StringBuffer("abc"); // mutable
		m(n, i, mi, s, sb);
		System.out.println("n = " + n); // 10
		System.out.println("i = " + i); // 10
		System.out.println("mi = " + mi); // 11
		System.out.println("s = " + s); // abc
		System.out.println("sb = " + sb); // abcdef
	}
}
