package wbs.cast;

//1. compiles:		ja
//2. executes:		ja
//3. exceptions:	nein
//4. output:		nix
import java.io.Serializable;

public class C13 {
	int m(CharSequence cs) {
		return cs.length();

	}

	boolean m2(Serializable s) {
		return s instanceof CharSequence;

	}
}