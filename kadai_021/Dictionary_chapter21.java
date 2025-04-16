package kadai_021;

import java.util.HashMap;

public class Dictionary_chapter21 {

	//メソッド

	public void referer(String[] word) {

		//HashMap キーと値を紐づけ
		HashMap<String, String> map = new HashMap<String, String>();

		//宣言
		String result = "";

		map.put("apple", "りんご");
		map.put("peach", "桃");
		map.put("banana", "バナナ");
		map.put("lemon", "レモン");
		map.put("pear", "梨");
		map.put("kiwi", "キウィ");
		map.put("strawberry", "いちご");
		map.put("grape", "ぶどう");
		map.put("muscat", "マスカット");
		map.put("cherry", "さくらんぼ");

		for (int i = 0; i < word.length; i++) {
			result = map.get(word[i]);

			//条件文         
			if (result == null) {

				System.out.println(word[i] + "は辞書には存在しません");

			} else {
				System.out.println(word[i] + "の意味は" + result);

			}
		}
	}

}
