package wbs.selbstlerntag.comparable;

public class Person implements Comparable<Person> {
	private String name, vorname;
	private Integer alter;
	private static int sortMode = 0;

	//Constructor
	public Person(String vorname, String name, Integer alter) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}

	// Getter und Setter
	public static int getSortMode() { return sortMode; }
	public static void setSortMode(int sortMode) { Person.sortMode = sortMode;}
	public String getName() { return name; }	
	public void setName(String name) { this.name = name; }
	public String getVorname() { return vorname; }
	public void setVorname(String vorname) { this.vorname = vorname; }
	public Integer getAlter() { return alter; }
	public void setAlter(Integer alter) { this.alter = alter; }

	// ------------------------------------------------------------------------------
	@Override
	/*
	 * toString überschrieben um eine schönere Spaltendarstellung zu bekommen.
	 */
	public String toString() {
		return String.format("%25s | %15s | %10s", vorname, name, alter);
	}

	@Override
	/*
	 * Implementation der compareTo-Methode.
	 * Abhängig vom Wert von "sortMode" zeigt compareTo() ein anderes Verhalten,
	 * und damit eine andere Sortierung. 
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
}
