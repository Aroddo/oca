package wbs.date_time;

import java.time.ZoneId;

public class ZoneIdDemo {
	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);
		System.out.println("--------");
		System.out.println(ZoneId.of("Europe/Berlin"));
	}
}