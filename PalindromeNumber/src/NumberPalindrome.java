
public class NumberPalindrome {

	public static boolean isPalindrome(int number) {

		if (number < -10) {
			number *= -1;
		}
		if (number < 10) {
			return true;
		}
		int compareNumber = number;

		int reverse = 0;
		while (number > 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10;
			reverse += lastDigit;
			number /= 10;
		}

		if (compareNumber == reverse) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		NumberPalindrome.isPalindrome(19022);
	}

}
