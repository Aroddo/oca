package wbs.selbstlerntag2;

public class Logelei1 {
	// Lösung xxxxxxxx
	// 12345678
	// Bedingungen:
	// x * a = x.reverse()
	// x = x.reverse() / a

	public static void main(String[] args) {
		StringBuilder kandidat = new StringBuilder("11111111");
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
	}
}
