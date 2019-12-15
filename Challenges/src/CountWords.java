
public class CountWords {
	public static int solutionOne(char letter, String text) {
		int count = 0;
		if (text.length() == 0) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}

	public static int solutionTwo(char letter, String text) {
		if (text.length() == 0) {
			throw new IllegalArgumentException();
		}
		return (int) text.chars().filter(x -> x == letter).count();
	}

	public static void main(String[] args) {
		System.out.println(CountWords.solutionOne('e', "elefante"));
		System.out.println(CountWords.solutionOne('c', "caballo"));
	}

}
