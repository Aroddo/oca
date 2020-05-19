package wbs.constructors_methods_encapsulation;

public class InitDemo {
	static {
		System.out.println("statischer initialisierer 1");
	}
	static {
		System.out.println("statischer initialisierer 2");
	}
	private int n;
	{
		System.out.println("elementinitialisierer 1");
		n = 1;
	}
	{
		System.out.println("elementinitialisierer 2");
		n++;
	}

	public InitDemo() {
		System.out.println("InitDemo()");
		n++;
	}

	public static void main(String[] args) {
		System.out.println("PRE");
		InitDemo demo = new InitDemo();
		System.out.println("POST");
		System.out.println(demo.n);
	}
}