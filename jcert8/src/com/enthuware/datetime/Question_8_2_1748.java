package com.enthuware.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question_8_2_1748 {
	public static void main(String[] args) {
		//Given: Daylight Savings Time ends on Nov 1 at 2 AM in US/Eastern time zone. 
		// As a result, 2 AM becomes 1 AM.

		//What will the following code print ?

		LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

		ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Duration.ofDays(1));
		System.out.println(date);

		date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Period.ofDays(1));
		System.out.println(date);
		
	}
}




