package wbs.cast;

//1. compiles:		ja
//2. executes:		ja
//3. exceptions:	nein
//4. output:		nix

public class C11 {
	void m(CharSequence cs) {}

	void m2() {
		m("abc");
		m(new StringBuffer("abc"));
		m(new StringBuilder("abc"));
	}
}