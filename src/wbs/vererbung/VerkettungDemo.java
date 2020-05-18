package wbs.vererbung;

public class VerkettungDemo {

	public static void main(String[] args) {
		new C11();
		new C11(1);
		new C11Sub();

		new C12();
	}

}

class C11 {
	public C11() {
		System.out.println("C11");
	}
	public C11(int i) {
		System.out.println("C11:"+i);
	}
}

class C11Sub extends C11 {
	public C11Sub() {
		System.out.println("C11Sub()");
	}
}

class C12 {

	public C12() {
		super();
		System.out.println("C12");
	}

}
