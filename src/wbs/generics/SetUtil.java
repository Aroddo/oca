package wbs.generics;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

interface hasValue {
	public Number getNumericValue();
}

class Pair<F, S> {
	private F first;
	private S second;

	public Pair(F first, S second) {
		super();
		this.first = first;
		this.second = second;
	}

	public F getFirst() { return first; }

	public void setFirst(F first) { this.first = first; }

	public S getSecond() { return second; }

	public void setSecond(S second) { this.second = second; }

	@Override
	public String toString() {
		return "\nPaar : " + first + " -- " + second;
	}

}

public class SetUtil {

	// wir schreiben die methode count(). sie zählt, wie viele elemente
	// eines sets eine gegebene eigenschaft haben.

	public static <T> long count(Set<T> set, Predicate<? super T> predicate) {
		long count = 0;
		for (T t : set) {
			count += (predicate.test(t)) ? 1 : 0;
		}
		return count;
	}

	// wir schreiben die methode allMatch(). sie ermittelt, ob alle elemente
	// eines sets eine gegebene eigenschaft haben.
	public static <T> boolean allMatch(Set<T> set, Predicate<? super T> predicate) {
		for (T t : set)
			if (!predicate.test(t))
				return false;
		return true;
	}

//          wir schreiben die methode pairBuilder(). sie liefert ein Set von Paaren.
//          die elemente eines paares "passen zueinander".
//          
//          bsp.: ein set von paaren von stellensuchenden und stellenangeboten (die
//          zueinander passen...)
//          
//          bsp.: ein set von Paaren von partnersuchenden (die zueinander passen...).
//        
//          wir testen in PairBuilderDemo

	public static <F, S> Set<Pair<F, S>> pairBuilder(Set<F> set1, Set<S> set2,
			BiPredicate<? super F, ? super S> biPredicate) {
		Set<Pair<F, S>> resultSet = new HashSet<>();
		for (F f : set1) {
			for (S s : set2) {
				if (biPredicate.test(f, s))
					resultSet.add(new Pair<F, S>(f, s));
			}
		}
		return resultSet;
	}
// wir berechnen den durchschnitt aller noten einer bausteinprüfung
// wir ermitteln das durchschnittsalter alle einwohner esslingens.
// wir ermitteln die durchschnittliche leistung aller 2010 neu zugelassenen pkws

// methode soll heißen: average

	public static <T> double average(Set<T> set, ToDoubleFunction<T> function) {
		double sum = 0;
		for (T t : set) {
			sum += function.applyAsDouble(t);
		}
		return sum / set.size();
	}

	// wir zerlegen eine menge von zahlen in 2 gruppen, die geraden und die
	// ungeraden.
	// wir zerlegen die einwohner einer stadt in 2 gruppen, die volljährigen
	// und minderjährigen
	// methodenname: partitioningBy( Set<T> s  )
	
	// Map<K,V>
	// Set<T>
	
	// Zahlen:   2 , 5 , 8 , 12 , 15, 20
	//	gerade:  2 , 8 , 12 , 20
	//ungerade:  5 , 15
	
	// TreeMap:		Key 	| 	Value
	//				eins	|	one
	//				zwei	|	two
	//
	//				true	|	Set( 2 , 8 , 12 , 20)	
	//				false	|	Set( 5 , 15 )
	
	
	public static <T> Map<Boolean, Set<T>> partitioningBy (Set<T> sourceSet, Predicate<? super T> predicate) {
		Set trueSet  = new TreeSet();
		Set falseSet = new TreeSet();

		for (T t : sourceSet) {
			if (predicate.test(t))
				trueSet.add(t);
			else
				falseSet.add(t);
		}
		
		TreeMap<Boolean,Set<T>> resultMap = new TreeMap<>();
		resultMap.put(true, trueSet);
		resultMap.put(false, falseSet);
		
		return resultMap;
	}

}
