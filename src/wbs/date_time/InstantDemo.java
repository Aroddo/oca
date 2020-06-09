package wbs.date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantDemo {
	public static void main(String[] args) throws InterruptedException {
		Instant i1 = Instant.now();
		Thread.sleep(1000);
		Instant i2 = Instant.now();
		Duration duration = Duration.between(i1, i2);
		System.out.println(duration); // PT1S
// ok
		System.out.println(i1.plus(1, ChronoUnit.DAYS));
// 2018-06-06T18:18:56.520Z
// exception: unsupported unit: Weeks
// System.out.println(i1.plus(1, ChronoUnit.WEEKS));
	}
}