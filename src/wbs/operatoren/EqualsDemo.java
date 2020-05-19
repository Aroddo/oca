package wbs.operatoren;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1.equals(s2): " + s1.equals(s2));

		String s3 = "abc";
		String s4 = "abc";
		System.out.println("s1.equals(s2): " + s1.equals(s2));

		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println("sb1.equals(sb2): " + sb1.equals(sb2));

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println("i1.equals(i2): " + i1.equals(i2));
		Integer i3 = 1;
		Integer i4 = 1;
		System.out.println("i3.equals(i4): " + i3.equals(i4));

		AtomicInteger ai1 = new AtomicInteger(1);
		AtomicInteger ai2 = new AtomicInteger(1);
		System.out.println("ai1.equals(ai2): " + ai1.equals(ai2));

		Set<Integer> set1 = new HashSet<>();
		set1.add(i1);
		set1.add(i2);
		System.out.println(set1.size()); // 1

		Set<AtomicInteger> set2 = new HashSet<>();
		set2.add(ai1);
		set2.add(ai2);
		System.out.println(set2.size()); // 2

		Set<String> set3 = new HashSet<>();
		set3.add(s1);
		set3.add(s2);
		System.out.println(set3.size()); // 1

		Set<StringBuilder> set4 = new HashSet<>();
		set4.add(sb1);
		set4.add(sb2);
		System.out.println(set4.size()); // 2
	}
}
