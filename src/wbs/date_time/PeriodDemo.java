package wbs.date_time;

import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {
		Period p1 = Period.of(0, 0, 1);
		Period p2 = Period.of(0, 1, 0);
		Period p3 = Period.of(0, 1, 1);
		Period p4 = Period.of(1, 0, 1);
		Period p5 = Period.of(1, 1, 1);
		System.out.println(p1); // P1D
		System.out.println(p2); // P1M
		System.out.println(p3); // P1M1D
		System.out.println(p4); // P1Y1D
		System.out.println(p5); // P1Y1M1D
// exception
// Unit must be Years, Months or Days, but was Seconds
// p1.plus(Duration.ofHours(1));
		System.out.println();
		
		String s6 = "P1Y1M1W4D";
		Period p6 = Period.parse(s6);
		System.out.println(s6 + " --- " + p6);
		
		System.out.println(Period.of(0,0,731));
		System.out.println(Period.of(0,25,0));
		System.out.println(Period.of(2,0,0));
		System.out.println(Period.of(0,0,731).getDays());
		System.out.println(Period.of(0,25,0).getDays());
		System.out.println(Period.of(2,0,0).getDays());
		
		System.out.println(	Period.of(2,0,0)
				.plusMonths(Period.of(0,25,0).getMonths())
				.plusDays(	Period.of(0,0,731).getDays()));
		
		

	}
}