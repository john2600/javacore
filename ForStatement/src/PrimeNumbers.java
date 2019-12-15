
public class PrimeNumbers {

	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		} else {
			for (int i = 2; i <= (long) Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		for (int j = 1; j <= 8000; j++) {
			if (PrimeNumbers.isPrime(j)) {
				System.out.println("number " + j);
				count++;
				if (count == 8000)
					break;
			}

		}
		System.out.println("primes numbers found " + count);
	}
}
