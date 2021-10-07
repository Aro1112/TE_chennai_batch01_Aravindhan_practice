package com.te.java8features;

import java.time.LocalDate;

public class LocalDateTest {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate date2 = LocalDate.parse("1997-12-11");
		System.out.println(date);
		
		System.out.println("Day of month "+date.getDayOfMonth());
		
		System.out.println("Day of year "+date.getDayOfYear());
		
		System.out.println("month value "+date.getMonthValue());
		
		System.out.println(date.isLeapYear());
		
		System.out.println(date.isAfter(date2));
		
		System.out.println(date.isBefore(date2));
		System.out.println(date.plusDays(2));
		
		
		
	}

}
