
public class ConditionalBranchSample2 {

	public static void main(String[] args) {
		// 変数宣言
		int scoreA = 80;
		int scoreB = 79;
		int scoreC = 80;
		int scoreD = 80;
		int scoreE = 79;
		
		if (scoreA >=80 && scoreB >= 80) {
			System.out.println("両方とも80点以上");
		}
		
		if (scoreA >= 80 || scoreB >= 80) {
			System.out.println("いずれか一方でも80点以上");
		}
		
		if ((scoreA >= 80 && scoreB >= 80 && scoreC >= 80) && (scoreD >= 80 || scoreE >= 80)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
	}

}
