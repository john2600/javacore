
public class Challenge1 {

	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into the high position " + position + " on the score table");
	}

	public static int calculateHighScorePosition(int score) {
		int value = 4;
		if (score >= 1000) {
			value = 1;
		} else if (score >= 500) {
			value = 2;
		} else if(score >= 100) {
			value = 3;
		}
		return value;
	}

	public static void main(String[] args) {
		int score = Challenge1.calculateHighScorePosition(1500);
		Challenge1.displayHighScorePosition("Pepe", score);

		score = Challenge1.calculateHighScorePosition(900);
		Challenge1.displayHighScorePosition("Rich", score);

		score = Challenge1.calculateHighScorePosition(400);
		Challenge1.displayHighScorePosition("Bob", score);

		score = Challenge1.calculateHighScorePosition(50);
		Challenge1.displayHighScorePosition("Andrew", score);

	}
}
