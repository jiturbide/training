package com.enthuware.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Question_8_2_1867 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2015, 9, 2);
		LocalDateTime ldt = LocalDateTime.of(2015, 9, 2, 1, 0, 0);
		
		Period p = Period.between(ld, LocalDate.of(2015, Month.SEPTEMBER, 1)); 
		System.out.println(p); 
		Duration d = Duration.between(ldt, LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10)); 
		System.out.println(d);
	}
}
