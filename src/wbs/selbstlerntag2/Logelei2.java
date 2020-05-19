package wbs.selbstlerntag2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logelei2 {
	// Lösung xxxxxxxx
	// 12345678
	// Bedingungen:
	// x * a = x.reverse()  <==>   x = x.reverse() / a
	// nur digits 1-8
	
	

	public static void main(String[] args) {
		/*
		 * StringBuilder kandidat = new StringBuilder("11111111");
		StringBuilder rev = new StringBuilder(kandidat).reverse();
		Boolean found = false;
		int maxmultiplikator = 8;
		int x, y;

		while (!found) {
			// Kandidat testen
			x = Integer.parseInt(kandidat.toString());
			y = Integer.parseInt(rev.toString());
			if (x * (maxmultiplikator-1) > 99999999) {
				System.out.println(x + "\t" + maxmultiplikator);
				maxmultiplikator--;
			}
			if (kandidat.indexOf("0") < 0 && kandidat.indexOf("9") < 0) { 
				for (int a = 2; a < maxmultiplikator; a++) {
					if (y == a * x) {
						found = true;
						System.out.println("Lösung: " + x + " = " + y + " / " + a);
					}
				}
			}
			kandidat = new StringBuilder("" + (x + 1));
			rev = new StringBuilder(kandidat).reverse();
		}
		*/
		List<Integer> loesungen = new ArrayList<>();
		loesungen.add(21782178);
		loesungen.removeIf(k-> testeKandidat(k,4));
		System.out.println(loesungen);
		
		loesungen.add(12345123);
		loesungen.add(21782178);
		Integer kandidat = 11111111;
		Integer ka = 12345123;
		Integer ka2 = 21782178  ;
		System.out.println(testeKandidat(ka2,2));
		System.out.println(testeKandidat(ka2,3));
		System.out.println(testeKandidat(ka2,4));
		System.out.println(testeKandidat(ka2,5));
		
		
		
	}
	public static Integer reverseInt (Integer n) {										
		return Integer.parseInt(new StringBuilder(n.toString()).reverse().toString());
	}
	
	// x * a = x.reverse()  <==>   x = x.reverse() / a
	public static Boolean testeKandidat(Integer x, int a) {
		Integer y = reverseInt(x);
		return (y % a) == 0 ? x.equals(y / a) : false  ;  
//		return reverseInt(x).equals(x * a);  
	}
}

