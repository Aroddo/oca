package wbs.date_time;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

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
		Set<Abgeordneter> abgeordnetenSet = new TreeSet<>();

		// Map mit key == Partei
		Map<String, Set<Abgeordneter>> abgeordnetenMap = new LinkedHashMap<>();
		
		
		abgeordnetenMap = mergeBy(abgeordnetenSet, 
				(k,v) -> ;
			)

	}

	public static <T> Map<String, Set<T>> groupBy(Set<T> sourceSet, Function<T,String> function) {
		Map<String,Set<T>> returnMap = new LinkedHashMap<>();
		BiFunction bifunction = null ;	// TODO
		sourceSet.forEach(
			element -> {
				returnMap.merge(function.apply(element), sourceSet, bifunction);
			}
		);
		return null;
	}
}

class Abgeordneter {
	private String partei;

	public String getPartei() { return partei; }

	public void setPartei(String partei) { this.partei = partei; }

	public Abgeordneter(String partei) {
		super();
		this.partei = partei;
	}
}
