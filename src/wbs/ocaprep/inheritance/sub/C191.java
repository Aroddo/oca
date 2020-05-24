package wbs.ocaprep.inheritance.sub;

import wbs.ocaprep.inheritance.C19;

public class C191 extends C19 {
	int n = 2;

	@Override
	public void m() {
		super.m();
	}

	public static void main(String... strings) {
		new C191().m();
	}
}