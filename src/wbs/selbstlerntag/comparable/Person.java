package wbs.selbstlerntag.comparable;
import java.util.Vector;
import java.util.AbstractCollection;
import java.util.AbstractList;

public class Person implements Comparable<Person> {
	/*
	 * -----------------------------------------------------------------------------
	 * Deklarationen
	 */
	private String name, vorname;
	private Integer alter;
	private static int sortMode = 0;

	/*
	 * -----------------------------------------------------------------------------
	 * Konstruktoren
	 */
	public Person() {
		this.name = "#Testname#";
		this.vorname = "#Testvorname#";
		this.alter = 0;
	}
	public Person(String vorname, String name, Integer alter) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}

	/*
	 * -----------------------------------------------------------------------------
	 * Getter und Setter Methoden
	 */
	public static int getSortMode() {
		return sortMode;
	}

	public static void setSortMode(int sortMode) {
		Person.sortMode = sortMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Integer getAlter() {
		return alter;
	}

	public void setAlter(Integer alter) {
		this.alter = alter;
	}

	/*
	 * -----------------------------------------------------------------------------
	 * - Implementationen
	 */
	@Override
	/*
	 * toString �berschrieben um eine sch�nere Spaltendarstellung zu bekommen.
	 */
	public String toString() {
		return String.format("%25s | %15s | %10s", vorname, name, alter);
	}

	@Override
	/*
	 * Implementation der compareTo-Methode. Abh�ngig vom Wert von "sortMode" zeigt
	 * compareTo() ein anderes Verhalten, und damit eine andere Sortierung.
	 */
	public int compareTo(Person o) {
		switch (sortMode) {
		case 0:
			return vorname.compareTo(o.getVorname());
		case 1:
			return name.compareTo(o.getName());
		case 2:
			return alter.compareTo(o.getAlter());
		default:
			return name.compareTo(o.getName());
		}
	}

	/*
	 * -----------------------------------------------------------------------------
	 * Klassenspezifische Methoden 
	 * 
	 */
	public Person buildPerson(Person p) { // Unfug. Nur demo
		
		return new Person(p.vorname, p.name, p.alter);
	}
	
 
	
	
	/*
	 * -----------------------------------------------------------------------------
	 * Main-Methode. 
	 * Sollte normalerweise ausschließlich in einer speziellen Starter-Klasse definiert werden.
	 */
	public static void main(String[] args) {
		
		System.out.println(
				  new Person("Armin", "Otto", 48 )  
				);
	
		System.out.println(
				  new Person("Armin", "Otto", 48 ).getVorname()  
				);
		
		
		System.out.println(
				new Person("fgghdfgh", "hhhjk", 48 ).getName()  
				);
		
		
		 
		
		
	}
	
	
}
