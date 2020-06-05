package wbs.testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class lambdatest {

	public static boolean checkList (List list, Predicate<List> p) {
		return p.test(list);
	}
	
	public static void main(String[] args) {
		boolean b = checkList(new ArrayList(), a1-> a1.isEmpty());
		System.out.println(b);
		b = checkList(new ArrayList(),(ArrayList a2 )-> a2.add("hello"));
		System.out.println(b);
	}
}


