package date_networking;
//old depricated dont use below
import java.util.*;

public class _1DateTImeAPi {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());//from 1jan 1970
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
		System.out.println(Long.MAX_VALUE);
		
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getDay());//sunday is 0
		System.out.println(d.getMonth());//january is 0
		System.out.println(d.getYear()+1900);//year started from 1900
		
		GregorianCalendar gc =new GregorianCalendar();
		
		System.out.println(gc.isLeapYear(2000));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));//how many days passed
		
		
		TimeZone tz=gc.getTimeZone();
		System.out.println(tz);
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getID());
	}

}
