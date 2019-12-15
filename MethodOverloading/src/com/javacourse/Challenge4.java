package com.javacourse;

public class Challenge4 {

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
			return;
		}
		if (minutes > 0) {
			long d = minutes / 1440;
			long year = d / 365;
			long days = d % 365;
			System.out.println(minutes + " min = " + year + " y and " + days + " d");
		} else {
			System.out.println(minutes + " min = 0 y and 0 d");
		}
	}

	public static void printYearsAndDays(long minutes, long year, long days) {
		System.out.println(minutes + " min = " + year + " y and " + days + " d");
	}

	public static void main(String[] args) {
		Challenge4.printYearsAndDays(1051200);
	}
}
