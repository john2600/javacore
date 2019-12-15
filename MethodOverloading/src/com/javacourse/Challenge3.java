package com.javacourse;

public class Challenge3 {
	public static void getDurationString(long minutes, long seconds) {
		if ((minutes < 0) || ((seconds > 59) || (seconds < 0))) {
			System.out.println("Invalid value");
			return;
		}
		long hour = minutes / 60;
		long remain = minutes % 60;
		String h = "" + hour;
		String r = "" + remain;
		String s = "" + seconds;

		if (hour < 10) {
			h = "0" + hour;
		}
		if (remain < 10) {
			r = "0" + remain;
		}
		if (seconds < 10) {
			s = "0" + seconds;
		}

		System.out.println(h + "h " + r + "m " + s + "s");

	}

	public static void getDurationString(long seconds) {
		if (seconds < 0) {
			System.out.println("Invalid value");
			return;
		}
		long minutes = seconds / 60;
		seconds = seconds % 60;
		getDurationString(minutes, seconds);

	}

	public static void main(String[] args) {
		Challenge3.getDurationString(65, 45);
		Challenge3.getDurationString(30L);
		Challenge3.getDurationString(3945L);
	}
}
