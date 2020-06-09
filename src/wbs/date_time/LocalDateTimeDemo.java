package wbs.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2018, 6, 1);
		LocalTime time1 = LocalTime.of(16, 0);
		LocalDateTime ldt1 = LocalDateTime.of(date1, time1);
		System.out.println(ldt1);
// 2018-06-01T16:00
		LocalDate date2 = LocalDate.of(2018, 7, 2);
		LocalTime time2 = LocalTime.of(12, 0);
		LocalDateTime ldt2 = LocalDateTime.of(date2, time2);
		System.out.println(ldt2);
// 2018-07-02T12:00
		System.out.println(ChronoUnit.DAYS.between(ldt1, ldt2));
// 30
		System.out.println(ldt1.until(ldt2, ChronoUnit.DAYS));
// 30
		LocalDateTime ldt3 = LocalDateTime.parse("2018-07-02T12:00"	);
		System.out.println(ldt3);
		ldt3.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(ldt3);
		LocalDateTime ldt4 = LocalDateTime.now();
		System.out.println(ldt4);
		System.out.println(ldt4.format(DateTimeFormatter.ISO_DATE_TIME));
		
			

	}
}