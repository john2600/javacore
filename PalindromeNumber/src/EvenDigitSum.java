
public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		if (number < 10) {
			return -1;
		}
		int sum = 0;

		while (number > 0) {
			int value = number % 10;
			if (value % 2 == 0) {
				sum += value;
			}
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
	}
}
