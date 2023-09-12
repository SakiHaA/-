
public class RepetitonSample3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i ++) {
			System.out.println("変数iの値:" + i);
			
			System.out.println((i + 1) + "回目のサイコロを振ります");
			int dice = new java.util.Random().nextInt(6);
			dice ++;
			System.out.println("出た目は" + dice + "です");
		}

	}

}
