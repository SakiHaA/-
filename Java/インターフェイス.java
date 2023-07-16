/* インターフェイスモデル */ 
interface iVehicle
{
    void show();
}

class Car implements iVehicle
{
    private int num;
    private double gas;
    
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.printIn("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
    }
    public void show()
    {
        System.out.printIn("車のナンバーは" + num + "です。");
        System.out.printIn("ガソリン量は" + gas + "です。");
    }
}