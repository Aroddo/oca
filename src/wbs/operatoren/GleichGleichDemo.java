package wbs.operatoren;

// wir illustrieren 3 verwendungen des operators ==

//- eine verwendung, die true liefert
//- eine verwendung, die false liefert
//- eine verwendung, die einen compilerfehler liefert

public class GleichGleichDemo {

	public static void main(String[] args) {
		
		String s11 = "aha";
		String s12 = "aha";
		System.out.println(s11 == s12);  // true! (warum?)
		
		String s21 = new String("nana");
		String s22 = new String("nana");
		System.out.println(s21 == s22);  // false! (warum?)
		
		StringBuilder sb = new StringBuilder("nana");
		System.out.println(sb);  // nana
		
		// compilerfehler (warum?)
		// System.out.println(s21 == sb);
	}
}
