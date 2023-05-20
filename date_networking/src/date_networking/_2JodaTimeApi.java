package date_networking;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class _2JodaTimeApi {

	public static void main(String[] args) {
//		Date d=new Date();
//		d.setHours(15); //mutable
//		System.out.println(d);
		
		
//		LocalDate d =LocalDate.now();
		//or
//		LocalDate d =LocalDate.now(Clock.systemDefaultZone());
		//or
//		LocalDate d =LocalDate.now(ZoneId.of("Asia/Kolkata"));
//		LocalDate d =LocalDate.of(2023, 04, 10);
//		LocalDate d =LocalDate.ofEpochDay(1);
		
		
		LocalDate d =LocalDate.parse("2023-05-01");//it must be in format (YYYY-MM-DD) else error
		
		d.plusMonths(6);//it cant modify need to create new reference
		LocalDate d1=d.plusMonths(5);
		System.out.println(d);
		System.out.println(d1);
		
		
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalTime t1=t.minusHours(3);
		System.out.println(t1);
		
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
	}

}
