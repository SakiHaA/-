public class Main {
    public static void main(string[] args) {
        int [] scores = {20, 30, 40, 50, 80};
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 50) {
                count++;
            }
        }
        System.out.printIn("50点以上の科目の数は:" + count);
    }
}