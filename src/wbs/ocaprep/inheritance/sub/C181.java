package wbs.ocaprep.inheritance.sub;

import java.io.FileNotFoundException;
import java.io.IOException;
import wbs.ocaprep.inheritance.C18;

public class C181 extends C18 {
	int n;

	protected C181() throws IOException {
		n = 55;
		super.n = 66;
	}

	protected void m1() {
		super.m1();
	}

	protected void m2() throws FileNotFoundException {}

	public String m3() {
		return "lalla";
	}

	protected int m4(int n) throws Exception {
		return 0;
	}
}