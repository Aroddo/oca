package wbs.constructors_methods_encapsulation;

class Base {
	String s = "A";
	void m(String s) {
		this.s = s;
	}
}

class Sub extends Base {
	
	// compilerfehler 
//	 int m() { return 1; }
	 
	int m(int n) { // korrekt
		return 1;
	}
	
}

public class MoreOverloading {
	
	 // wir provozieren 3 compilerfehler durch fehlerhafte überladungen von methoden
	 
	int m1() {
		return 1;
	}
	
	// compilerfehler
	
	//	void m1() {
	//		
	//	}

	
	void m2(int... is) {

	}
	
	// compilerfehler
	
	// void m2(int[] ia) {}
	 

	
//	void m31(int n, double x) {
//		System.out.println("A");
//	}
//
//	void m31(double x, int n) {
//		System.out.println("B");
//	}
	void m31(Integer x, Integer n) {
		System.out.println("C");
	}
	void m31(Integer x, int n) {
		System.out.println("D");
	}
	void m31(int x, Integer n) {
		System.out.println("E");
	}
	void m4(double x) {
		System.out.println("M4");
	}

	void m3() {
		m4(1);
//		 m31(1, 1.0); 
//		 m31(1.0, 1); 
		 m31((Integer) 1, 1); 
		 m31(1, (Integer) 1); 
//		 m31(1.0, 1.0); 
//		 m31(1, 1);  // compilerfehler
	}
	public static void main(String[] args) {
		MoreOverloading mo = new MoreOverloading();
		mo.m3();
	}

}
