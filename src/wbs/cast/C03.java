package wbs.cast;

//1. compiles:		ja, da StringBuffer CharSequence implementiert
//2. executes:		ja	
//3. exceptions:	ja 
//4. output:		true 

import java.io.Serializable;

public class C03 {
	public static void main(String[] args) {
		CharSequence cs = Math.random() > 0.5 ? "nice" : new StringBuffer("nice, too!");
		System.out.println(cs instanceof Serializable);
	}
}