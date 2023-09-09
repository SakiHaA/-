
public class InstructionExecutionSample {

	public static void main(String[] args) {
		// 準備
		String name = "田中";
		int age = 20;
		
		// 画面に出力する命令実行(引数1つ)
		System.out.println("自己紹介します。");
		
		// 画面に出力する命令実行(引数2つ)
		// %sは文字列, %dは10進数
		System.out.printf("私の名前は%sです。年齢は%dです。\n" ,name ,age);
		System.out.println("-----------------");
		
		// 最大値を返す命令
		int i = Math.max(10, 20);
		System.out.println("最大値:" + i);
		System.out.println("-----------------");
		
		// 名前の入力を案内
		System.out.println("名前を入力してください");
		name = new java.util.Scanner(System.in).nextLine();
		
		// 年齢の入力を案内
		System.out.println("年齢を入力してください");
		age = new java.util.Scanner(System.in).nextInt();
		
		// 画面に出力する命令実行(引数2つ)
		// %sは文字列, %dは10進数
		System.out.printf("私の名前は%sです。年齢は%dです。\n" ,name ,age);
		System.out.println("-----------------");
		
		// サイコロを振り結果を画面に表示する
		int x = new java.util.Random().nextInt(6);
		// サイコロの目に合わせて1足す;
		x ++;
		System.out.println("サイコロの出た目:" +x);
		
	}

}
