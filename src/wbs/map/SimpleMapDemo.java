package wbs.map;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

 
import wbs.generics.SetUtil;
 

import java.util.HashMap;

public class SimpleMapDemo {
	public static void main(String[] args) {

		Map<String, String> dict = new TreeMap<String, String>();
//		Map<String, String> dict = new HashMap<>();
		dict.put("eins", "one");
		dict.put("zwei", "two");
		dict.put("drei", "three");
		dict.put("view", "four");
		dict.put("fünf", "five");
		dict.put("sechs", "six");
		dict.put("sieben", "one");
		dict.put("sieben", "two");

		//v1
		System.out.println("\n V1");
		System.out.println(dict);
			
		// v2
		System.out.println("\n V2");
		dict.forEach( (k, v)      -> System.out.printf("%s \t %s\n", k         , v           ));
		
		// v3
		System.out.println("\n V3");
		dict.entrySet().forEach(e -> System.out.printf("%s \t %s\n", e.getKey(),e.getValue() ));
		
		// v4
		System.out.println("\n V4");
		dict.keySet().forEach(k   -> System.out.printf("%s \t %s\n", k         , dict.get(k) ));
		
		// v5
		System.out.println("\n V5");
		dict.values().forEach(v   -> System.out.printf("   \t %s\n", v                       ));
		
		
		// partitioningByDemo
		Set<Integer> intSet = new TreeSet<>();
		Set<Einwohner> einwohnerSet = new TreeSet<>();
		Random random = new Random();
		
		for (int i = 1; i < 100; i++) {
			intSet.add(0+random.nextInt(1000));
			einwohnerSet.add(new Einwohner(0 + random.nextInt(100)));
		}
		
		Map<Boolean,Set<Integer>> intMap = new TreeMap<>();
		intMap =		SetUtil.partitioningBy(intSet, i -> i % 2 == 0);
		intMap.forEach((k,v) -> System.out.println(k + " => " + v)); 

		Map<Boolean,Set<Einwohner>> einwohnerMap = new TreeMap<>();
		einwohnerMap =		SetUtil.partitioningBy(einwohnerSet, i -> i.alter > 18);
		einwohnerMap.forEach((k,v) -> System.out.println(k + " => " + v)); 

		
//			bausteinPruefungen.add(new BausteinPruefung(0 + random.nextInt(100)) );
//			einwohner.add(new Einwohner(0 + random.nextInt(120)) );
//			pkws.add(new PKW(1000 + random.nextInt(50000)) );
//		}
		
	}
}
