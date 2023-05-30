package com.Java8.Date_Time_Demo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App 
{
   

	public static void main( String[] args )
    {
       LocalDateTime dev = LocalDateTime.now();
       System.out.println(dev);
       System.out.println(dev.atZone(ZoneId.of("America/New_York")));
       System.out.println(DayOfWeek.from(dev));
       
       ZonedDateTime zd = ZonedDateTime.now();
       System.out.println(zd);
       System.out.println(zd.format(DateTimeFormatter.ofPattern(" 'The day is' dd 'of month' MMMM 'of year' YYYY 'of zone is' z ")));  
       System.out.println(zd.toInstant());
       System.out.println(zd.withZoneSameInstant(ZoneId.of("America/Chicago")));
       System.out.println(zd.withZoneSameLocal(ZoneId.of("America/Chicago")));
    }
}
