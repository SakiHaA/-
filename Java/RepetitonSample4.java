
public class RepetitonSample4 {

	public static void main(String[] args) {
		
		// 変数宣言
		int score = 0;
		int cnt = 0;
		
		do {
			cnt ++;
			System.out.println(cnt + "回目");
			System.out.println("勉強する");
			if (cnt == 4) {
				System.out.println("4回目のみ勉強してテストは受けない");
				continue;
			}
			
			if (cnt == 7) {
				System.out.println("7回目は勉強したら繰り返しを終了");
				break;
			}
			System.out.println("テストの点数を入力してください");
			score = new java.util.Scanner(System.in).nextInt();
		} while (score < 80);
		
	}

}
