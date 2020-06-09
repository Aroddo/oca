package wbs.date_time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class MoreInstantDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
// ok
		Instant i1 = Instant.now();
		Instant i2 = ZonedDateTime.now().toInstant();
// Instant i3 = LocalDate.now().toInstant();
// Instant i4 = LocalTime.now().toInstant();
// Instant i3 = LocalDateTime.now().toInstant();
	}
}