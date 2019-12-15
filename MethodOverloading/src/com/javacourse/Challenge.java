package com.javacourse;

public class Challenge {
	public static void main(String[] args) {
		double centimeters = Challenge.calcFeetAndInchesToCentimeters(0, 7);
		System.out.println(centimeters);
	}

	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
		if (isFeetValid(feet) || isInchesValid(inches)) {
			return -1;
		} else {
			return calculateFeetAndInchesToCent(feet, convertToCentimeters(inches));
		}

	}

	private static double convertToCentimeters(int value) {
		if (isInchesValid(value)) {
			return -1;
		} else {
			return (double) value * 2.54;
		}
	}

	private static double calculateFeetAndInchesToCent(int feet, double inches) {
		return ((double) (feet * 30.48)) + inches;
	}

	public static boolean isFeetValid(int feet) {
		if (feet < 0) {
			return true;
		}
		return false;
	}

	public static boolean isInchesValid(int inches) {
		if (inches < 0 && inches < 12) {
			return true;
		}
		return false;
	}
}
