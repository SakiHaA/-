
public class ArraySample2 {

	public static void main(String[] args) {
		
		// 点数を入力する, 人数を画面から入力する
		System.out.println("点数を入力する人数を入力してください");
		
		int num = new java.util.Scanner(System.in).nextInt();
		
		int [] scores = new int[num];
		
		// 画面から点数を入力する
		for (int i = 0; i < scores.length; i ++) {
			System.out.println(i + "番目の点数を入力してください");
			scores [i] = new java.util.Scanner(System.in).nextInt();
		}
		
		int total = 0;
		double avg = 0;
		
		for (int i = 0; i < scores.length; i ++) {
			total += scores [i];
		}
		
		avg = total / scores.length;
		
		System.out.println("合計点" + total);
		System.out.println("平均点" + avg);

	}

}
