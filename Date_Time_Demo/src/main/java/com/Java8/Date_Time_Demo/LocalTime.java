package com.Java8.Date_Time_Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class LocalTime {

	public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.now();
		System.out.println("Date and Time: " + d);
		System.out.println(d.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));
		//System.out.println(d.format(DateTimeFormatter.ofLocalizedTime()));
		LocalDate date = d.toLocalDate();
		System.out.println("Local Date:" + date);
		Month month = d.getMonth();
		System.out.println("Month is:" + month);
		
		int days = d.getDayOfMonth();
		int seconds = d.getSecond();
		System.out.println("Month is" + month + "days are" + days + "seconds are" + seconds);
		
		
		//we can create our own date with these methods but time will remian time of system
		LocalDateTime d1 = d.withDayOfMonth(19).withYear(2030);
		System.out.println("Date2:" + d1);
		
		LocalDate d2 = LocalDate.of(2025, Month.OCTOBER, 25);
		System.out.println(d2);
		
		//we can create our own time by this method ans is 22hr 15min.
		//LocalTime date4 = LocalTime.of(22, 15);
		//System.out.println(date4);
		
		// parse a string
		//LocalTime date5 = LocalTime.parse("20:15:30");
		//System.out.println(date5);
 
	}


}
