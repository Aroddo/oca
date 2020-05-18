package wbs.constructors_methods_encapsulation;

/*
 * wir illustrieren die verwendung von final bei der deklaration
 * von parametern einer methode
 */
public class FinalParameterDemo {

    public static void m(StringBuilder msb1, final StringBuilder msb2) {
	msb1.append("wirtschaft");
	msb1 = new StringBuilder("besen"); // ok
	msb2.append("wirtschaft"); // ok
//	msb2 = new StringBuilder("besen"); compilerfehler
	
    }

    public static void main(String[] args) {
	StringBuilder sb1 = new StringBuilder("besen");
	StringBuilder dummysb1 = sb1;
	sb1.append("1");
	dummysb1.append("2");
	
	StringBuilder sb2 = new StringBuilder("besen");
	m(sb1, sb2);
	System.out.println(sb1);
	System.out.println(sb2);
    }
}
