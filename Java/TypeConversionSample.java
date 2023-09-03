
public class TypeConversionSample {

	public static void main(String[] args) {
		// 暗黙的型変換 代入時
		byte b = 10;
		short s = 20;
		int i = 30;
		// i = 1.1; エラーなる
		double d = 1.1;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		System.out.println("----------------");
		
		// short型の変数にbyte型の変数に代入
		s = b;
		// double型の変数にint型の変数に代入
		i = s;
		// double型の変数にint型の変数に代入
		d = i;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		System.out.println("----------------");
		
		// byte型の変数にshort型の変数に代入
		// b = s;
		// short型の変数にint型の変数に代入
		// s = i;;
		// int型の変数にdouble型の変数に代入
		// i = d;
		// ↑は全部エラーになる
		
		
		}

}
