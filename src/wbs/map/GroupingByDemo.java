package wbs.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

//----------------------------------
//wir ordnen alle abgordneten des bundestages in gruppen.
//alle abgeordneten einer gruppe gehören zur selben partei.

//wir ordnen alle wahlberechtigten eines bundeslandes in gruppen.
//alle wahlberechtigten einer gruppe gehören zum selben wahlkreis.

//wir ordnen alle zahlen zwischen 100 und 200 in gruppen.
//alle zahlen in derselben gruppe haben dieselbe quersumme.

//methodenname: groupingBy()

//wir testen in GroupingByDemo
public class GroupingByDemo {
	public static void main(String[] args) {
		Set<Abgeordneter> abgeordnetenSet = new TreeSet<>();	// Initialisierung des Abgeordneten-Sets
		Map<String, Set<Abgeordneter>> abgeordnetenMap = 		// Initialisierung der Map
				new LinkedHashMap<>();							// key ist Partei,
																	// value ist Set von Abgeordneten

		abgeordnetenSet.add(new Abgeordneter("A1", "CDU"));		// Erzeugung von Abgeordneten
		abgeordnetenSet.add(new Abgeordneter("A2", "CDU"));
		abgeordnetenSet.add(new Abgeordneter("A3", "SPD"));
		abgeordnetenSet.add(new Abgeordneter("A4", "Grüne"));
		abgeordnetenSet.add(new Abgeordneter("A5", "CDU"));
		abgeordnetenSet.add(new Abgeordneter("A6", "SPD"));
		abgeordnetenSet.add(new Abgeordneter("A7", "FDP"));
		abgeordnetenSet.add(new Abgeordneter("A8", "Grüne"));

		abgeordnetenMap = groupBy(abgeordnetenSet, 			// Aufruf der groupBy-Methode
				abgeordneter -> abgeordneter.getPartei());	// Das Function-Lambda liefert Key für die Map

		abgeordnetenMap.forEach((k, v) -> System.out.println("Partei: " + k  + v + "\n"));	// Ausgabe der Map

		// GroupBy mit Quersumme-Integern
		Set<Integer> zahlenSet = new TreeSet<>();	// Initialisierung des Zahlen-Sets
		Map<Integer, Set<Integer>> zahlenMap = 		// Initialisierung der Map
				new LinkedHashMap<>();				// key ist Quersumme,
													// value ist Set von Zahlen
		for (int i = 100; i <= 200; i++) { zahlenSet.add(i); }
		zahlenMap = groupBy(zahlenSet, zahl -> wbs.util.NumberUtil.querSumme(zahl));
		zahlenMap.forEach((k, v) -> System.out.println("Queersumme: " + k + " : " + v)); 
		System.out.println();
	}

	public static <K,T> Map<K, Set<T>> groupBy(Set<T> sourceSet, Function<T, K> function) {
		Map<K, Set<T>> returnMap = new LinkedHashMap<>();			// Initialisierung der Ergebnis-Map
		
		sourceSet.forEach(element -> {								// iteration über alle elemente des Quell-Sets
			returnMap.compute(function.apply(element), 				// mappe element mit Function-Lambda.
				(key, set) -> {										// key vom Typ K, set mit Typ T. Durch compute zugewiesen.
					if (set == null) 								// falls key noch nicht existiert
						set = new TreeSet<>();						// dann erzeuge neues set für map-value
					set.add(element);								// füge element zu altem oder neuem set an
					return set;										// rückgabe des sets. referenz wird auf key gemappt
				}
			);
		});
		return returnMap;
	}
}

/*
 * Die Abgeordneten-Klasse
 */
class Abgeordneter implements Comparable<Abgeordneter> {
	private String partei;
	private String name;

	public Abgeordneter(String name, String partei) {
		super();
		this.name = name;
		this.partei = partei;
	}

	@Override
	public String toString() { return "\nAbgeordneter: " + name + "\t Partei:" + partei ; }

	@Override
	public int compareTo(Abgeordneter o) { return this.name.compareTo(o.getName()); }
	public String getPartei() { return partei; }
	public void setPartei(String partei) { this.partei = partei; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}

class Wahlberechtigter implements Comparable<Wahlberechtigter> {

	@Override
	public int compareTo(Wahlberechtigter o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

