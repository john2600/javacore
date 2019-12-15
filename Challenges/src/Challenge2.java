import java.util.HashMap;
import java.util.Map;

public class Challenge2 {

	public static String countWords(String text) {
		Map<String, Integer> countWords = new HashMap<>();
		// 5.Write an array program for the below and don't use any collections.
		// Input: aabbbccdddaaaa
		// Output: a2b3c2d3a4
		for (int i = 0; i < text.length(); i++) {
			if (countWords.containsKey(text.charAt(i) + "")) {
				Integer value = countWords.get(text.charAt(i) + "");
				countWords.put(text.charAt(i) + "", value + 1);
			} else {
				countWords.put(text.charAt(i) + "", 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		countWords.forEach((x, y) -> sb.append(x + y));
		return sb.toString();
	}

	public static String countWords2(String text) {
		// 5.Write an array program for the below and don't use any collections.
		// Input: aabbbccdddaaaa
		// Output: a2b3c2d3a4
		String tmp2 = "";
		String result = "";
		int count = 1;
		String current =  text.charAt(0) + "";
		String next = "";
		for (int i = 1; i < text.length(); i++) {
			next = text.charAt(i) + "";
			if (next.equals(current)) {
				count++;
			} else {
				result = result + current + count;
				count = 1;
				current = next;
			}
		}
		return result + next + count;
	}

	public static void main(String[] args) {
		String result = "aaaaabbbccdddaaaaaaaeeeeuuu";
		String text = Challenge2.countWords2(result);
		System.out.print(text);
	}

}
