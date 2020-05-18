package wbs.vererbung.sub;

import wbs.vererbung.base.Base;

public class Sub extends Base {
	Sub() {
		super(123); // ok!
	}

	@Override
	 public void m() {
		super.m(); // ok!
		n = 4; // ok!
// Base base = new Base(321); // compiler-fehler!
		Base base = new Base(); // ok!
// base.m(); // compiler-fehler!
// base.n = 4; // compiler-fehler!
	}
}