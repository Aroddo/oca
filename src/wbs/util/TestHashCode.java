package wbs.util;

public class TestHashCode {
	final int zaehler,nenner;
	final Integer i;
	
	
	public static void main(String[] args) {
		TestHashCode t1 = new TestHashCode(3,2);
		TestHashCode t2 = new TestHashCode(3,2);
		TestHashCode t3 = new TestHashCode(6,4);
		
		Integer i1 = Integer.valueOf(1);
		Integer i2 = Integer.valueOf(1);
		Integer i3 = Integer.valueOf(2);				
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());
		
	}
	public void yo () {
		
	}
	
	public TestHashCode(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		this.i = Integer.valueOf(1);
	}
	 
	
}
