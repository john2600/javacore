
public class FirstLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		int countPosition = 0;
		int lastDigit = 0;
		int sum = 0;
		while (number > 0) {
			if (number < 10) {
				countPosition++;
				break;
			}
			if (countPosition == 0) {
				lastDigit = number % 10;
				countPosition++;
			}
			number /= 10;
		}

		if (countPosition == 1) {
			lastDigit = number;
		}
		sum = lastDigit + number;
		return sum;
	}

}
