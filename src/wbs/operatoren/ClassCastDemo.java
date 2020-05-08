package wbs.operatoren;

// wir illustrieren eine erfolgreiche anwendung des cast-operatos,
// bei der dieser cast-operator überflüssig ist.

// wir illustrieren eine erfolgreiche anwendung des cast-operatos,
// bei der dieser cast-operator notwendig ist.

// wir illustrieren eine anwendung des cast-operatos,
// bei der dieser eine ClassCastException auslöst.

// wir illustrieren eine anwendung des cast-operatos,
// bei der dieser einen compilerfehler auslöst.

public class ClassCastDemo {

	public static void main(String[] args) {
		// erfolgreich, überflüssig
		Object o = (Object) "aha";
		System.out.println(o);
		
		// erfolgreich, notwendig
		CharSequence cs1 =  "nana";  // impliziter cast
		String s1 = (String) cs1;  // expliziter cast
		System.out.println(s1);
		
		// ClassCastException
		CharSequence cs2 = new StringBuilder("nanu");
		try {
			String s2 = (String) cs2;
			System.out.println(s2);
		}
		catch(ClassCastException e) {
			System.out.println(e);
		}
		
		StringBuilder sb = new StringBuilder("strange...");
		System.out.println(sb);
		// compiler fehler
		// String s = (String) sb;
	}
}
