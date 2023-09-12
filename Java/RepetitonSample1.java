
public class RepetitonSample1 {

	public static void main(String[] args) {
		
		// テストの点数を入力
		System.out.println("テストの点数を入力してください");
		int score = new java.util.Scanner(System.in).nextInt();
		
		// 不合格(80点未満)の場合、再テストで合格するまで、勉強と再テストを繰り返す
		while (score < 80) {
			System.out.println("勉強する");
			
			System.out.println("再テストの点数を入力してください");
			score = new java.util.Scanner(System.in).nextInt();
		}
		
		System.out.println("合格しました");

	}

}
