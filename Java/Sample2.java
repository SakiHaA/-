/* finalでオーバーライドできないように */

class Car
{
    public final void show()
    {
        ...
    }
}
class RacingCar extends Car
{
    public final void show()
    {
        ...
    }
}