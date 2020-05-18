package wbs.operatoren;

public class TestDemo {

	public static void main(String[] args) {
		double x41 = 1.0e51;
		double x42 = -1.0e51;
		double x43 = 1.0e-51;
		
		System.out.println(x41);
		System.out.println(x42);
		System.out.println(x43);
		
		
		
		String s1 = "abc";
		s1+="A";
		s1 += 0xde;
		
		System.out.println(s1);
		
		double x = 3.2;
		double rest = x % 1.5;
		
		System.out.println(rest);
		
		double d = 1.0/3;
		
		System.out.println(d);
		System.out.println(d*3);
	}

}
