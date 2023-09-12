
public class ConditionalBranchSample3 {
	
	public static void main(String[] args) {
		
		// サイコロをふる
		System.out.println("サイコロを降ります");
		// 0から5までの乱数を生成
		int x = new java.util.Random().nextInt(6);
		// 1から6にするためにxに1たす
		x ++;
		
		// xの値に応じてIFを使って分岐処理
		if (x == 1) {
			System.out.println("1が出ました");
		} else if (x == 2) {
			System.out.println("2が出ました");
		} else if (x == 3) {
			System.out.println("3が出ました");
		}else if (x == 4) {
			System.out.println("4が出ました");
		} else if (x == 5) {
			System.out.println("5が出ました");
		} else if (x == 6) {
			System.out.println("6が出ました");
		} else {
			System.out.println("1から6以外が出ました");
		}
		
		System.out.println("--------------");
		
		
		switch(x) {
		case 1:
			System.out.println("1が出ました");
			break;
		case 2:
			System.out.println("2が出ました");
			break;
		case 3:
			System.out.println("3が出ました");
			break;
		case 4:
			System.out.println("4が出ました");
			break;
		case 5:
			System.out.println("5が出ました");
			break;
		case 6:
			System.out.println("6が出ました");
			break;
		default:
			System.out.println("1から6以外が出ました");
		}
	}

}
