
public class ArraySample3 {

	public static void main(String[] args) {
		
		// 配列の宣言、要素の生成と代入
		int [] scores = new int [3];
		scores [0] = 90;
		scores [1] = 80;
		scores [2] = 70;
		
		// 別の配列を宣言、先ほどの配列を代入
		int [] test = scores;
		
		System.out.println("scoresの各値の値");
		for (int i = 0; i < scores.length; i ++) {
			System.out.println(i + "番目の値" + scores [i]);
		}
		
		System.out.println("testの各値の値");
		for (int i = 0; i < test.length; i ++) {
			System.out.println(i + "番目の値" + test [i]);
		}
		
		System.out.println("------------------");
		
		// testの要素の値を変更する
		test [0] = 50;
		test [1] = 60;
		test [2] = 10;
		
		System.out.println("scoresの各要素の値");
		for (int i = 0; i < scores.length; i ++) {
			System.out.println(i + "番目の値:" + scores[i]);
		}
		
		System.out.println("testの各要素の値");
		for (int i = 0; i < test.length; i ++) {
			System.out.println(i + "番目の値:" + test[i]);
		}
	}

}
