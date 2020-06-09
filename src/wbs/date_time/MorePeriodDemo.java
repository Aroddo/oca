package wbs.date_time;

import java.time.Period;

//falle!
public class MorePeriodDemo {
//	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Period period = Period.ofDays(1).ofYears(2);
		System.out.println(period);
		period = Period.ofYears(2).ofDays(1);
		System.out.println(period);
		
		
//P2Y
	}
}