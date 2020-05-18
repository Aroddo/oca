package wbs.vererbung;

public class FigurDemo {

	public static void main(String[] args) {
		Kreis k1 = new Kreis(2);
		Kreis k2 = new Kreis(4);
		Kreis k3 = new Kreis(6);
		System.out.println("\nKreise:");
		System.out.printf("%s \t%s \t%s \t\t%s \n", "id", "count", "umfang", "flaeche");
		System.out.printf("%s \t%s \t%.8s \t%.8s \n", k1.getId(), Kreis.getCounter(), k1.umfang(), k1.flaeche());
		System.out.printf("%s \t%s \t%.8s \t%.8s \n", k2.getId(), Kreis.getCounter(), k2.umfang(), k2.flaeche());
		System.out.printf("%s \t%s \t%.8s \t%.8s \n", k3.getId(), Kreis.getCounter(), k3.umfang(), k3.flaeche());

		Rechteck r1 = new Rechteck(1, 1);
		Rechteck r2 = new Rechteck(3, 4);
		Rechteck r3 = new Rechteck(5, 2);
		System.out.println("\nRechtecke:");
		System.out.printf("%s \t%s \t%s \t\t%s \n", "id", "count", "umfang", "flaeche");
		System.out.printf("%s \t%s \t%.8s \t\t%.8s \n", r1.getId(), Rechteck.getCounter(), r1.umfang(), r1.flaeche());
		System.out.printf("%s \t%s \t%.8s \t\t%.8s \n", r2.getId(), Rechteck.getCounter(), r2.umfang(), r2.flaeche());
		System.out.printf("%s \t%s \t%.8s \t\t%.8s \n", r3.getId(), Rechteck.getCounter(), r3.umfang(), r3.flaeche());

	}

}

class Kreis extends Figur2D {
	double radius;

	public Kreis(double radius) {
		this.radius = radius;
	}

	@Override
	public double flaeche() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double umfang() {
		return 2 * Math.PI * radius;
	}

}

class Rechteck extends Figur2D {
	double hoehe, breite;

	public Rechteck(double hoehe, double breite) {
		this.hoehe = hoehe;
		this.breite = breite;
	}

	@Override
	public double flaeche() {

		return hoehe * breite;
	}

	@Override
	public double umfang() {
		return hoehe * 2 + breite * 2;
	}

}