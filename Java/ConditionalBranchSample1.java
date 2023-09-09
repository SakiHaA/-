
public class ConditionalBranchSample1 {

	public static void main(String[] args) {
		
		// 変数の宣言
		int age;
		
		// 画面から年齢を入力
		System.out.println("年齢を入力してください");
		age = new java.util.Scanner(System.in).nextInt();
		
		if(age >= 20) {
			System.out.println("お酒を売りました。");
		
		}
		
		System.out.println("---------------");
		
		// 変数の宣言
		int score;
		
		// 画面からテストの点数を入力
		System.out.println("テストの点数を入力してください");
		score = new java.util.Scanner(System.in).nextInt();
		
		if(score >= 80) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		System.out.println("---------------");
		
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 60) {
			System.out.println("良");
		} else {
			System.out.println("可");
		}
		
		System.out.println("---------------");
		
		if (score > 80) {
			System.out.println("80点超");
		}
		
		if (score >= 80) {
			System.out.println("80点以上");
		}
		
		if (score < 80) {
			System.out.println("80点未満");
		}
		
		if (score <= 80) {
			System.out.println("80点以下");
		}
		
		if (score == 80) {
			System.out.println("80点ちょうど");
		}
		
		if (score != 80) {
			System.out.println("80点ではない");
		}
		
		if (!(score < 80)) {
			System.out.println("80点未満ではない");
		}
		
		System.out.println("---------------");
		
		if (true) {
			System.out.println("true1");
		} else {
			System.out.println("false1");
		}
		
		if (false) {
			System.out.println("true2");
		} else {
			System.out.println("false2");
		}
		
		boolean bool = (score == 80);
		
		if (bool) {
			System.out.println("true3");
		} else {
			System.out.println("false3");
		}
		
		System.out.println("---------------");
		
		String str = "合格";
		
		if (str.equals("合格")) {
			System.out.println("strは 合格 と格納されている。");
		} else {
			System.out.println("strは 合格 と格納されていない。");
		}
		
	}

}
