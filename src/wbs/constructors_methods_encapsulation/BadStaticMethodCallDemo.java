package wbs.constructors_methods_encapsulation;

public class BadStaticMethodCallDemo {

//	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Integer i = 3;
		// es ist erlaubt, aber irreführend, eine statische methode
		// einer klasse über eine objektreferenz aufzurufen...
		// es gibt eine warning vom compiler, aber keinen error
		System.out.println(i.bitCount(10));

		// so ist es besser...
		System.out.println(Integer.bitCount(10));

		System.out.println(i.getClass());
	}

}
