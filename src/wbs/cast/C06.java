package wbs.cast;
//1. compiles:		ja

//2. executes:		ja
//3. exceptions:	nein
//4. output:		true

import java.io.Serializable;

public class C06 {
	public static void main(String[] args) {
		String s1 = "seltsam im nebel zu wandern";
		String s2 = (String) (I) (CharSequence) (Object) s1;
		System.out.println(s1 == s2);
	}
}