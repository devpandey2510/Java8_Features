package com.Java8.Date_Time_Demo;

import java.time.Duration;
import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PeriodDuration {

	public static void main(String[] args) {
		PeriodDuration c = new PeriodDuration();
		c.testPeriod();
	}
	
	public void testPeriod() {
		LocalDate date1 = LocalDate.now();
		//current date
		System.out.println("current date:" );
		System.out.println(date1.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));
		
		//adding 1 month to current date
		//LocalDate date2 = date1.plus(1, ChronoUnit.YEARS);
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next MOnth is: " + date2.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));
		//adding weeks to current date
		LocalDate date3 = date1.plus(6, ChronoUnit.WEEKS);
		System.out.println("6 weeks ahead is:" + date3.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));
		
		Period period = Period.between(date2, date1);
		System.out.println("Period between two date is " + period);
		
		Period period1 = Period.between(date3, date1);
		System.out.println("Period between two date is " + period1);
		
	}
	
	public void testDuration() {
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);
		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1, time2);
		System.out.println("Duration: " + duration);
	}

}
