package com.javacourse;

public class MethodOverloading {
	public static void main(String[] args) {
		int scored = calculateScore("John", 500);
		System.out.println("New Score is " + scored);
		calculateScore(75);
		calculateScore();
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points ");
		return score * 100;
	}

	public static int calculateScore(int score) {
		System.out.println("UnKnow Player scored " + score + " points ");
		return score * 100;
	}

	public static int calculateScore() {
		System.out.println("Not Player, Not scored");
		return 0;
	}
}
