package wbs.date_time;

import java.time.ZoneId;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
//		TreeSet ts = new TreeSet(ZoneId.getAvailableZoneIds());
//		ts.forEach(s -> System.out.println(s));

		new TreeSet(ZoneId.getAvailableZoneIds()).forEach(s -> System.out.println(s));							// aufsteigend
		new TreeSet(ZoneId.getAvailableZoneIds()).descendingSet().forEach(s -> System.out.println(s));			// absteigend

		ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);							// aufsteigend
		ZoneId.getAvailableZoneIds().stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);	// absteigend
		ZoneId.getAvailableZoneIds().stream().sorted(Collections.reverseOrder()).forEach(System.out::println);	// absteigend
		long var = 0b10_01L;
		int a = 5;
		int c, d, e = 0;
		int j, D;
		System.out.println(--a);

		StringBuilder sb = new StringBuilder();
		sb.append("sdfsf" + "sdfsdf");

		String[] table = { "aa", "bb", "cc", "dd" };
		for (String ss : table) {
			System.out.println("start for");
			if ("bb".equals(ss)) {
				continue;
			}
			System.out.println(ss);
			if ("cc".equals(ss)) {
				break;
			}
			System.out.println("end for");
		}

	}
}
