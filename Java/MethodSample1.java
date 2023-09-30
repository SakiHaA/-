
public class MethodSample1 {

	public static void main(String[] args) {
		
		// samplePrint1を呼び出す
		samplePrint1();
		
		// samplePrint2を呼び出す
		samplePrint2(10);
		
		// samplePrint3を呼び出す
		samplePrint3(15, 20);
		
		int scoreX = 80;
		int scoreY = 100;
		double ret;
		
		// avgを呼び出す
		ret = avg(scoreX, scoreY);
		System.out.println("avgの戻り値:" + ret);
		
		int[] scores = {80, 90, 70, 100};
		// avg(引数が配列)を呼び出す
		ret = avg(scores);
		System.out.println("avg(引数が配列)の戻り値" + ret);
		
		int sampleInt = 10;
		// sample1を呼び出す
		sample1(sampleInt);
		// sampleIntの値を画面に表示する
		System.out.println("sampleIntの値:" + sampleInt);
		
		int[] sampleIntArr = {10};
		//sample2を呼び出す
		sample2(sampleIntArr);
		// sampleIntArr[0]の値を画面に表示する
		System.out.println("sampleIntArr[0]の値:" + sampleIntArr[0]);
	}
	
	public static void samplePrint1() {
		System.out.println("samplePrint1が呼び出されました");
	}

	public static void samplePrint2(int x) {
		System.out.println("samplePrint2が呼び出されました");
		System.out.println("引数x:" + x);
	}
	
	public static void samplePrint3(int x, int y) {
		System.out.println("samplePrint3が呼び出されました");
		System.out.println("引数x:" + x + "引数y:" + y);
	}
	
	public static double avg(int x, int y) {
		System.out.println("引数がint2つのavgメソッドが呼び出されました");
		double tempAvg = (x + y) / 2;
		return tempAvg;
	}
	
	public static double avg(int [] scores) {
		System.out.println("引数がint2つのavgメソッドが呼び出されました");
		int total = 0;
		
		for (int i = 0; i < scores.length; i ++) {
			total += scores[i];
		}
		double tempAvg = total / scores.length;
		return tempAvg;
	}
	
	public static void sample1(int x) {
		System.out.println("sampleが呼び出されました。加算前x:" + x);
		x = x + 1;
		System.out.println("sampleが呼び出されました。加算後x:" + x);
	}
	
	public static void sample2(int [] x) {
		System.out.println("sample1が呼び出されました。加算前x:" + x);
		x[0] = x[0] + 1;
		System.out.println("sample2が呼び出されました。加算後x:" + x);
	}
}
