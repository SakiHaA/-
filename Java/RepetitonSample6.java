
public class RepetitonSample6 {

	public static void main(String[] args) {
		
		System.out.println("テストの点数を入力してください");
		int score = new java.util.Scanner(System.in).nextInt();
		
		if (score >= 80) {
			System.out.println("合格");
			if (score >= 90) {
				System.out.println("すごい!");
			}
		} else {
			for (int i = 0; i < 3; i ++) {
				System.out.println("勉強します");
			}
		}
		
	}

}
