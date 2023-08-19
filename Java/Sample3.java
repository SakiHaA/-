// finallyブロック
class Sample3
{
    public static void main(String[] args)
    {
        try{
            int[] test;
            test = new int[5];

            System.out.printIn("test[10]に値を記入します。");

            test[10] = 80;
            System.out.printIn("test[10]に80を代入しました。");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.printIn("配列の要素を超えています。");
        }
        finally{
            System.out.printIn("最後に必ずこの処理をします。");
        }
        System.out.printIn("無事終了しました。")
    }
}