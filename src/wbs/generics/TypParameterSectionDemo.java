package wbs.generics;

class C11 {
}

interface I11 {
}

interface I12 {
}

class GC<T extends TypParameterSectionDemo & I11 & I12> {
}

class C11Sub1 extends TypParameterSectionDemo {
}

class C11Sub2 extends TypParameterSectionDemo implements I11 {
}

class C11Sub3 extends TypParameterSectionDemo implements I11, I12 {
}

public class TypParameterSectionDemo {
	public static void main(String[] args) {
		//GC<C11Sub1> gc1;
		//GC<C11Sub2> gc2;
		GC<C11Sub3> gc3;
	}
}