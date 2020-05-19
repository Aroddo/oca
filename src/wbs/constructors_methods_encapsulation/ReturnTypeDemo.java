package wbs.constructors_methods_encapsulation;

/*
 * wir schreiben 3 methoden, die den unterschied illustrieren,
 * der zwischen primitiven typen und referenztypen als return- type existiert
 */

public class ReturnTypeDemo {

	private int n = 0;
	private StringBuilder sb = new StringBuilder();
	private String s = "abc";
	private int x = 5;
	// getN() kopiert den wert des feldes n
	public int getN() { return n; }

	// getSb() liefert keine kopie des feldes sb, sondern eine referenz darauf
	public StringBuilder getSb() { return sb; }

	// getS() liefert keine kopie des feldes s, sondern eine referenz darauf
	public String getS() { return s; }

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ReturnTypeDemo rtd = new ReturnTypeDemo();
		int n = rtd.getN();
		StringBuilder sb = rtd.getSb();

		String s = rtd.getS();
		s = s.concat("def");
		n++;
		sb.append("aha");

		System.out.println(rtd.getN()); // 0
		System.out.println(rtd.getSb()); // aha
		System.out.println(rtd.getS()); // abc
		System.out.println(s); // abc
	}
}
