package wbs.map;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import wbs.generics.SetUtil;

class Einwohner  implements Comparable{
	public int alter;

	public Einwohner(int alter) {
		super();
		this.alter = alter;
	}

//	@Override
	public int compareTo(Object o) {
		return ((Integer) this.alter).compareTo(((Einwohner) o).alter);
	}

	public String toString() {
		return   "Alter: " + this.alter;
	}
}

public class PartitionByDemo {

	public static void main(String[] args) {

		// wir zerlegen eine menge von zahlen in 2 gruppen, die geraden und die
		// ungeraden.

		// wir zerlegen die einwohner einer stadt in 2 gruppen, die volljährigen
		// und minderjährigen

		// methodenname: partitioningBy()

		Set<Integer> intSet = new TreeSet<>();
		Set<Einwohner> einwohnerSet = new TreeSet<>();
		Random random = new Random();

		for (int i = 1; i < 10; i++) {
			intSet.add(random.nextInt(100));
			einwohnerSet.add(new Einwohner( random.nextInt(100)));
		}

		
		Map<Boolean, Set<Integer>> intMap = new TreeMap<>();
		
						intMap 		= SetUtil.partitioningBy(intSet			, i -> i % 2 == 0);
		
		System.out.println("#######" + intSet);
		intMap.forEach((k, v) -> System.out.println(k + " => " + v));

		System.out.println();

		Map<Boolean, Set<Einwohner>> einwohnerMap = new TreeMap<>();
		
						einwohnerMap = SetUtil.partitioningBy(einwohnerSet	, i -> i.alter > 18);
						
		einwohnerMap.forEach((k, v) -> System.out.println(k + " => " + v));

//			bausteinPruefungen.add(new BausteinPruefung(0 + random.nextInt(100)) );
//			einwohner.add(new Einwohner(0 + random.nextInt(120)) );
//			pkws.add(new PKW(1000 + random.nextInt(50000)) );
//		}	
	}
}
