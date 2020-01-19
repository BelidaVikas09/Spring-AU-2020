package DateandTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Dateandtime {
	    public static void findDiffInNano(int a,int b,int c,int a1,int b1,int c1){
	    	 LocalDateTime dateTime = LocalDateTime.of(a, b, c, 0, 0);
	         LocalDateTime dateTime2 = LocalDateTime.of(a1,b1,c1,0,0);
	         System.out.println(java.time.Duration.between(dateTime, dateTime2).toNanos());
	         
	    }
	    public static void findDiffInZone(int a,int b,int c,int a1,int b1,int c1) {
	    	LocalDateTime dateTime = LocalDateTime.of(a, b, c, 0, 0);
	        LocalDateTime dateTime2 = LocalDateTime.of(a1,b1,c1,0,0);
	        ZonedDateTime date1 = dateTime.atZone(ZoneId.of("America/Montreal"));
	        ZonedDateTime date2 = dateTime2.atZone(ZoneId.of("America/Montreal"));
	        long diff = ChronoUnit.DAYS.between(date1,date2);
	        System.out.print("Difference between dates in different time zones is:"+diff);
	        
	    }
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Date in yyyy-mm-dd");
			 String s1=sc.next();
			 System.out.println("Date in yyyy-mm-dd");
			 String s2=sc.next();
			 String arr[]=s1.split("-");
			 String arr1[]=s2.split("-");
			 int year=Integer.parseInt(arr[0]);
			 int mon=Integer.parseInt(arr[1]);
			 int day=Integer.parseInt(arr[2]);
			 int year1=Integer.parseInt(arr1[0]);
			 int mon1=Integer.parseInt(arr1[1]);
			 int day1=Integer.parseInt(arr1[2]);
			findDiffInNano(year,mon,day,year1,mon1,day1);
			findDiffInZone(year,mon,day,year1,mon1,day1);
		}
}
