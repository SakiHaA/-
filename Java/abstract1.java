/* 重要部分のみ書き込み */ 

abstract class Vehicle
{
    protected int speed;
    public void setSpeed(int s)
    {
        speed = s;
        System.out.printIn("速度を" + speed + "にしました。")
    }
    abstract void show();
}