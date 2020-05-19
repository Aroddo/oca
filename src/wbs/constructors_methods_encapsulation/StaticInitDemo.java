package wbs.constructors_methods_encapsulation;

import java.io.IOException;

public class StaticInitDemo {

	static double[] da;

	/*
	 * in einem statischen initialisierer initialisieren wir da[] mit 20
	 * zufallszahlen zwischen 0 und 1
	 */

	static {
		da = new double[20];

		for (int i = 0; i < 20; i++) {
			da[i] = Math.random();
		}
		// compilerfehler
		 if(Math.random() > 0.5) {
//		 throw new IOException();
//		 throw new Exception();
//		 throw new RuntimeException();
		}
		
		
	}

	public static void main(String[] args) {
		for (double x : da) {
			System.out.println(x);
		}
	}
}
