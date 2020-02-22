package lab3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class Zone {
	
public static void main(String[] args) {
	LocalDateTime today=LocalDateTime.now();
	ZoneId id=ZoneId.of("Europe/Paris");
	ZoneId i=ZoneId.of("Africa/Cairo");

	ZonedDateTime zoned=ZonedDateTime.of(today, id);
	System.out.println(zoned);
}
}
