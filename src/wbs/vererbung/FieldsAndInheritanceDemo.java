package wbs.vererbung;

// behauptung: beim zugriff auf felder entscheidet der reference-type und nicht der object-type

class Base2 {
	int n = 2;
	public Base2() {
		System.out.println("Base2 " + n);
	}
	public int getN() { return n; }
	public void setN(int n) { this.n = n; }
	
	
}

class Sub2 extends Base2 {
	int n = 20;
	public Sub2() {
		System.out.println("Sub2 " + n);
	}
//	public int getN() { return n; }
	
}

class Sub3 extends Sub2 {
	int n = 200;
	public Sub3() {
		System.out.println("Sub3 " + n);
	}
//	public int getN() { return n; }
	
}
public class FieldsAndInheritanceDemo {

	public static void main(String[] args) {
		Base2 b = new Sub2();
		System.out.println(b.n); // 2
		System.out.println(b.getN()); // 2
		
		System.out.println(((Sub2) b).n); // 20
		System.out.println(((Sub2) b).getN()); // 20
		
		System.out.println("---");
		Sub3 s3 = new Sub3();
		System.out.println(s3.n);
		System.out.println(s3.n);
	}

}
