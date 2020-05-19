package wbs;

public class OBase {
	private Integer m() {
		return Integer.valueOf(1);
	}
}

class OSub extends OBase {
	public int m() {
		return 1;
	}
}