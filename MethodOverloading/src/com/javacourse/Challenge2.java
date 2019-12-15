package com.javacourse;

public class Challenge2 {

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println("error bad parameters");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println("Feet, " + feet + " inches " + inches + "= " + centimeters + " cm");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " Inches is equals to " + feet + " feet and " + remainingInches + " inches ");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}

	public static void main(String[] args) {
		Challenge2.calcFeetAndInchesToCentimeters(0, 7);
		Challenge2.calcFeetAndInchesToCentimeters(7);
	}
}
