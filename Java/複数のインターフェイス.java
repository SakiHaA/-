interface iVehicle
{
    void vshow();
}
// 材料
interface iMaterial
{
    void mShow();
}

class Car implements iVehicle, iMaterial
{
    private int num;
    private double gas;

    private Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.printIn("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
    }
    public void vShow()
    {
        System.out.printIn("車のナンバーは" + num + "です。")
        System.out.printIn("ガソリン量は" + gas + "です。")
    }
    public void mShow()
    {
        System.out.printIn("車の材質は鉄です。");
    }
}

class Sample4
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1234, 20.5);
        car1.vShow();
        car1.vShow();
    }
}