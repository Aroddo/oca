package wbs.selbstlerntag2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Logelei2 {
	// Lösung xxxxxxxx
	// 12345678
	// Bedingungen:
	// x * a = x.reverse()  <==>   x = x.reverse() / a
	// nur digits 1-8
	
	

	public static void main(String[] args) {
		List<Integer> loesungen = new ArrayList<>();
		List<Integer> multiplikatoren = Arrays.asList(2,3,4,5,6,7,8,9);
		Integer kandidat = 11111111;
		Boolean found = false;
		while (!found) {
			multiplikatoren.forEach(a -> testeKandidat(kandidat, a)) ;
			
		}
		
		
	}
	public static Integer reverseInt (Integer n) {										
		return Integer.parseInt(new StringBuilder(n.toString()).reverse().toString());
	}
	
	// x * a = x.reverse()  <==>   x = x.reverse() / a
	public static Boolean testeKandidat(Integer x, int a) {
		Integer y = reverseInt(x);
		return (y % a) == 0 ? x.equals(y / a) : false  ;  
	}
}

