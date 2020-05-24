package wbs.ocaprep.inheritance.sub;

import wbs.ocaprep.inheritance.C20;

public class C201 extends C20 {
	static {
		sb.append("nana");
	}
	{
		n++;
	}

	public static void main(String[] args) {
		new C201();
		new C201();
		System.out.println(sb);
		System.out.println(new C201().n);
	}
}