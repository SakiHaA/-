
public class RepetitonSample5 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i ++) {
			System.out.println((i + 1) + "人目");
			
			for (int j = 0; j < 5; j ++) {
				System.out.println((j + 1) + "回目のサイコロを降ります");
				int dice = new java.util.Random().nextInt(6);
				dice ++;
				System.out.println("出た目は" + dice + "です");
			}
		}
		
	}

}
