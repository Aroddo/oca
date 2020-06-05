package wbs.generics;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDemo {

	public static void main(String[] args) {
		Set<Integer> integerSet = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toSet());
 		
		
		System.out.println(integerSet.getClass());
		System.out.println("Numbers > 900:\t"       + SetUtil.count(integerSet, i -> i > 900));
		System.out.println("genau 3 Einserbits :\t" + SetUtil.count(integerSet, i ->Integer.bitCount(i) == 3));
		
//		System.out.println(SetUtil.allMatch(integerSet, i -> i < 110));
		System.out.println(SetUtil.allMatch(integerSet, i -> i < 1001));
	}

}
