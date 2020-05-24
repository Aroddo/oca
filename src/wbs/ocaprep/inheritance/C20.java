package wbs.ocaprep.inheritance;

public class C20 {
	protected static StringBuffer sb = new StringBuffer();
	protected int n;
	static {
		sb.append("aha");
	}
	{
		n++;
	}
	{
		n++;
	}
}