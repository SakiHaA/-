
public class ContentSample {

	public static void main(String[] args) {
		// 単価
		int price = 100;
		// 税率
		// finalで定数宣言
		// 定数は大文字アンダーバーが一般的
		final double TAX_RATE = 0.1;
		
		System.out.println(price + price * TAX_RATE);
		
		// 単価
		price = 200;
		
		// 税率を変更できない　定数だから
		// TAX_RATE = 0.2;
		
		System.out.println(price + price * TAX_RATE);
	}

}
