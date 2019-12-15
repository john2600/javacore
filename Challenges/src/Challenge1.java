
public class Challenge1 {
	// 1.String reverse using recursion.

	public static String reverse(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			char letter = text.charAt(i);
			sb.append(letter);
		}
		return sb.toString();
	}

	public static String reverse(String text, int index) {
		if (index == 0)
			return (text.charAt(0) + "");
		else
			return (text.charAt(index) + reverse(text, index - 1));
	}

	public static void main(String[] args) {
		String reversString = "cadena de texto al reves.";
		String result1 = Challenge1.reverse(reversString);

		String result2 = Challenge1.reverse(reversString, reversString.length() - 1);
		System.out.println(result1);
		System.out.println(result2);

	}
}
