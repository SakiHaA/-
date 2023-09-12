
public class RepetitonSample2 {

	public static void main(String[] args) {
		// 変数宣言
		int score = 0;
		
		do {
			System.out.println("勉強する");
			
			System.out.println("テストの点数を入力してください");
			score = new java.util.Scanner(System.in).nextInt();
		} while (score < 80);
		
		System.out.println("合格しました");

	}

}
