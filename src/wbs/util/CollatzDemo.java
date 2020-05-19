package wbs.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class CollatzDemo {
	public static void main(String[] args) {
		
		Integer[] numbers = { 1, 100, 131, 534, 1234, 5747, 4566, 232578 };
		ArrayList<Integer> lists = new ArrayList(Arrays.asList( 19, 100, 131, 534, 1234, 5747, 4566, 232578 ));

		
		LinkedHashSet<Integer> doneHash  = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> todoHash = new LinkedHashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		for(int i=1;i<100000;i++) {todoHash.add(i);}
		List<Integer> collatzlist ;
		Integer nextint;
		Iterator it;
		for (int i = 1; i<1000;i++) {
			it = todoHash.iterator();
			nextint = (Integer)it.next();
			collatzlist =NumberUtil.collatz(nextint);
			System.out.println("collatz("+nextint+") \t" + collatzlist );
			
			todoHash.removeAll(collatzlist);
			doneHash.addAll(collatzlist);
			System.out.println("todoHash " + todoHash.size() );
		}
		System.out.println(doneHash);
		
		
		for (int i : numbers) {
//			System.out.println(NumberUtil.collatz(i));
		}

	}
}