package wbs.cast;

//1. compiles:		ja
//2. executes:		ja
//3. exceptions:	nein
//4. output:		141	141	142

class C141 {
	int n = 141;
}

class C142 extends C141 {
	int n = 142;
}

public class C14 {
	public static void main(String blabla[]) {
		C141 c141 = new C141();
		System.out.println(c141.n);
		c141 = new C142();
		System.out.println(c141.n);
		System.out.println(((C142) c141).n);
	}
}