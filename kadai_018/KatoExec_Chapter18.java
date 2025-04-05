package kadai_018;

public class KatoExec_Chapter18 {

	//開始
	public static void main(String[] args) {

		//インスタンス化
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();

		//実行

		taro.setGivenName();
		taro.execIntroduce();

		hanako.setGivenName();
		hanako.execIntroduce();

		ichiro.setGivenName();
		ichiro.execIntroduce();

	}
}
