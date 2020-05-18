package wbs.constructors_methods_encapsulation;

import java.io.IOException;

/*
 * was passiert, wenn der konstruktor einer basisklasse
 * checked exceptions deklariert? was muss dann im konstruktor der
 * subklasse berücksichtigt werden?
 * der konstruktor der subklasse muss mindestends die checked exceptions deklarieren,
 * die der von ihm aufgerufene konstruktor der basisklasse deklariert. er darf durchaus
 * allgemeinere exceptions deklarieren.
 */

// mit blick auf (checked) exceptions sind methoden k o v a r i a n t
// mit blick auf (checked) exceptions sind konstruktoren k o n t r a v a r i a n t

class Base1 {
	Base1() throws IOException {
	}
}

/*
 * compilerfehler
 * class Sub1 extends Base1 { Sub1() { super(); }
 * 
 * }
 */

/*
 * compilerfehler 
 * class Sub1 extends Base1 {}
 */

// ok
class Sub11 extends Base1 {
	Sub11() throws IOException {
	}
}

// auch ok
class Sub12 extends Base1 {
	Sub12() throws Exception {
	}
}

// compilerfehler
/*
 * class Sub13 extends Base1 { Sub13() throws FileNotFoundException { } }
 */

public class ConstructorAndExceptionDemo {
	// compilerfehler, wenn der constructor keine IOException deklariert
	Sub11 sub11 = new Sub11(); 
	// @SuppressWarnings("unused")
	//private Sub11 sub11;

	public ConstructorAndExceptionDemo() throws IOException {
		 sub11 = new Sub11();
	}
public static void main(String[] args) {
	
}
}
