public class SumChallenge {

	public static boolean isPrime(int number) {

		for (int i = 1; i <= (long) Math.sqrt(number); i++) {
			if ((number % 3 == 0 && number % 5 == 0)) {
				System.out.println(number + " is divisble by both numbers are divisble by 3 and 5");
			}

			if ((number % 3 == 0 || number % 5 == 0)) {
				return true;
			}

		}
		return false;

	}

	public static int sumDigits(int number) {
		if (number < 10) {
			return -1;
		}
		int sum = 0;

		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;

	}

	public static void main(String[] args) {
//		int count = 0;
//		int sum = 0;
//		for (int j = 1; j <= 100; j++) {
//			if (SumChallenge.isPrime(j)) {
//				System.out.println("number " + j);
//				sum +=j;
//				count++;
//				if (count == 5)
//					break;
//			}
//
//		}
//		System.out.println("sum numbers " +sum);

		System.out.println(SumChallenge.sumDigits(-1));
	}

}
