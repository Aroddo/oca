package wbs.cast;

//1. compiles:		ja
//2. executes:		ja
//3. exceptions:	
//4. output:		false	null
//	s wird mit null belegt und null ist nicht instanceof CharSequence, deshalb false

class C181 {
	String s  ;
}

public class C18 {
	public static void main(String[] args) {
		C181 c181 = new C181();
		System.out.println(c181.s instanceof CharSequence);
		Object o = c181.s;
		CharSequence cs = (String) o;
		System.out.println(cs);
		 ;
	}
}