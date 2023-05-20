package date_networking;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/*		
		y year
		M month
		d day
		
		h hour(0-12)
		H hour(0-23)
		m minute
		s second
		S millisec
		z timezone
		Z offset
 */		
public class _4DateFormatter {

	public static void main(String[] args) {
		ZonedDateTime dt=ZonedDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter df =DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss HH:mm:ss z Z");
		System.out.println(dt.format(df));
		
		System.out.println(dt.get(ChronoField.YEAR));
		
	}

}
