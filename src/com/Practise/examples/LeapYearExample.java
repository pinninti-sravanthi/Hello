package com.Practise.examples;

import java.time.LocalDate;


public class LeapYearExample {
public static void main(String[] args) {
	LocalDate date=LocalDate.of(2017, 04, 28);
	System.out.println(date.isLeapYear());
	LocalDate date2=LocalDate.of(2012, 04, 28);
	System.out.println(date2.isLeapYear());
}
}
