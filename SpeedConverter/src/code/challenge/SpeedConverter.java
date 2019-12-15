package code.challenge;

public class SpeedConverter {
	public static long toMilesPerHour(double kilometersPerHour) {
		double oneMilePerHour = 0.6214;
		if (kilometersPerHour < 0) {
			return -1;
		}
		return (long) (kilometersPerHour * oneMilePerHour);
	}

	public static long toMilesPerHourVersionTwo(double kilometersPerHour) {
		double oneMilePerHour = 1.609;
		return Math.round(kilometersPerHour / oneMilePerHour);
	}

	public static void toMilesPerHourVersionThree(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid value");
		}
		System.out.println(kilometersPerHour + " km/h = " + toMilesPerHourVersionTwo(kilometersPerHour) + " ml/h ");

	}

	public static void main(String[] args) {
		System.out.println(SpeedConverter.toMilesPerHour(-10.25));
		System.out.println(SpeedConverter.toMilesPerHourVersionTwo(-10.25));
		SpeedConverter.toMilesPerHourVersionThree(25.42);
	}
}
