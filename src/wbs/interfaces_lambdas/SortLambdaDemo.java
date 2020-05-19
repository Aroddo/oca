package wbs.interfaces_lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringBuilderComparator implements Comparator<StringBuilder> {
	@Override
	public int compare(StringBuilder sb1, StringBuilder sb2) {
		return sb2.toString().compareTo(sb1.toString());
	}
}

public class SortLambdaDemo {
	public static void main(String[] args) {
		String[] strings = { "a", "z", "b", "y", "c", "x" };
		List<StringBuilder> list = new ArrayList<>();
		for (String s : strings) {
			list.add(new StringBuilder(s));										// füllt list mit Stingbuilder aus strings
		}
		
		// hilfsklasse
		Collections.sort(list, new StringBuilderComparator());					// list sortieren
		System.out.println(list);												// list ausgeben
		Collections.shuffle(list);												// list mischen
		System.out.println(list);												// list wieder ausgeben
		System.out.println();

		// anonyme klasse
		Collections.sort(list, new Comparator<StringBuilder>() {				// list sortieren, Comparator erzeugen
			@Override															//
			public int compare(StringBuilder sb1, StringBuilder sb2) {          // 
				return sb2.toString().compareTo(sb1.toString());                // 
			}                                                                   // 
		});                                                                     // 
		System.out.println(list);                                               // list ausgeben         
		Collections.shuffle(list);                                              // list mischen          
		System.out.println(list);                                               // list wieder ausgeben  
		System.out.println();                                                   // 

		// lambda_1
		Collections.sort(list, (a, b) -> b.toString().compareTo(a.toString()));
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println();

		// lambda_2
		Collections.sort(list, (StringBuilder a, StringBuilder b) -> b
				.toString().compareTo(a.toString()));
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println();

		// lambda_3
		Collections.sort(list, (StringBuilder a, StringBuilder b) -> {
			return b.toString().compareTo(a.toString());
		});
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println();

		// lambda_4 + default method in interface
		list.sort((a, b) -> b.toString().compareTo(a.toString()));
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println();

		// lambda_5 + variable declaration + default method in
		// interface
		Comparator<StringBuilder> cmp = (a, b) -> b.toString()
				.compareTo(a.toString());
		list.sort(cmp);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println();
	}
}