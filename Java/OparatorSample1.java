
public class OperatorSample1 {

	public static void main(String[] args) {
		// リテラル
		// \ はバックスラッシュという
		System.out.println(1);
		System.out.println(0.1);
		System.out.println("Javaプログラミング");
		System.out.println("\"Java\"プログラミング");
		System.out.println("\'Java\'プログラミング");
		System.out.println("Java\nプログラミング");
		
		// 式、評価
		System.out.println(2 + 3);
		System.out.println(2 + 3 - 4);
		System.out.println(2 * 3 - 4);
		System.out.println(2 * (3 + 4));
		System.out.println(10 / 5);
		System.out.println(10 % 3);
		
		// 代入をふくぬ演算子
		int x;
		x = 2 + 3 - 4;
		System.out.println(x);
		
		// 文字列の結合
		String str;
		str = "こんにちは" + "世界";
		System.out.println(str);
	}

}
