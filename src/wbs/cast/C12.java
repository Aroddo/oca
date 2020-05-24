package wbs.cast;

import java.util.ArrayList;

//1. compiles:		ja
//2. executes:		ja
//3. exceptions:	nein
//4. output:		nix

public class C12 {
	void m(CharSequence cs) {}

	void m2() {
		m(Integer.toString(123));
		Object o =  "gaga";
		m((String) o);
		m((CharSequence) o);
	}
}