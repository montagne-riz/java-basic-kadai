package kadai_018;

abstract public class Kato_Chapter18 {
	//フィールド
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区○×";

	//メソッド①
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	//メソッド②(子クラスでこのメソッドを強制できる）
	abstract public void eachIntroduce();

	//メソッド③①②の実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();

	}
}
