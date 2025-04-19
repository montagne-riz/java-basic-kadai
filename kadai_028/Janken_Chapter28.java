package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Janken_Chapter28 {

	public String getMyChoice() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("自分のじゃんけんの手を入力しましょう");

		System.out.println("グーはrockのｒを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		String input = scanner.nextLine().trim().toLowerCase();

		return input;
	}

	public String getRandom() {

		String[] janken = { "r", "s", "p" };

		String choice = janken[(int) Math.floor(Math.random() * 3)];

		return choice;
	}

	public void playGame() {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");

		String myChoice = getMyChoice();
		String randomChoice = getRandom();

		System.out.println(map.get(myChoice));

		//System.out.println("自分の勝ちです");
		//System.out.println("自分の負けです");

		if (myChoice.equals(randomChoice)) {

			System.out.println("あいこです");

		} else if (myChoice.equals("r") && randomChoice.equals("s") ||
				myChoice.equals("s") && randomChoice.equals("p") ||
				myChoice.equals("p") && randomChoice.equals("r")) {

			System.out.println("自分の勝ちです");

		} else {

			System.out.println("自分の負けです");
		}
	}
}
