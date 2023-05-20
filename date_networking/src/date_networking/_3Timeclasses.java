package date_networking;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _3Timeclasses {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		ZonedDateTime zdt =ZonedDateTime.now();
		System.out.println(zdt);
		
		ZonedDateTime zdt1 =ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(zdt1);
		
		OffsetDateTime odt= OffsetDateTime.now();//zone info not in this
		System.out.println(odt);
		System.out.println(odt.getDayOfMonth());
		
		MonthDay md =MonthDay.now();
		System.out.println(md);
	
		YearMonth ym=YearMonth.now();
		System.out.println(ym);
		
		Year y=Year.now();
		System.out.println(y);
		
		
		Period p=Period.of(2, 2, 10);
		System.out.println(p.addTo(LocalDate.now()));
		
		Instant i =Instant.now();//gives GMTme
		System.out.println(i);
	}
	

}
