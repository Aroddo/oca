package wbs.vererbung;

public abstract class Figur2D implements Comparable<Figur2D> {

	// felder
	private int id;

	private static int counter = 0;

	// konstruktor
	protected Figur2D() {
		id = ++counter;
	}

	// methoden
	public abstract double flaeche();

	public abstract double umfang();

	public int getId() {
		return id;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		String classname = this.getClass().getSimpleName();
//		return classname + "(" + id + ")" + " \t-> " +  this.flaeche();		
		return classname + "(" + id + ")" + " \t-> " +  (int)(this.flaeche()*100)/100.0;

	}

	@Override
	public int compareTo(Figur2D figur2d) {
		return Double.compare(this.flaeche(), figur2d.flaeche());
	}
}
