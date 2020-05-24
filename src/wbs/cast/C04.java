package wbs.cast;

//1. compiles:		nope. C04 cannot be resolved to a type.
//2. executes:	
//3. exceptions:	 
//4. output:		

public class C04 {
	public static void main(String[] args) {
		CharSequence cs = Math.random() > 1 ? "nice" : new C04();
		System.out.println(cs instanceof Serializable);
	}
}