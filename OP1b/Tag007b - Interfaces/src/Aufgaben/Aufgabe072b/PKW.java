package Aufgaben.Aufgabe072b;

public class PKW
{
    private int tankfuellstand;
    private TankfuellstandLeuchte tankfuellstandLeuchte = TankfuellstandLeuchte.ROT;
    public TankfuellstandBeobachter tankfüllstandBeobachter;

    public PKW(int tankfuellstand)
    {
        this.tankfuellstand = tankfuellstand;
    }

    public int getTankfuellstand()
    {
        return tankfuellstand;
    }

    public TankfuellstandLeuchte getTankfuellstandLeuchte()
    {
        return tankfuellstandLeuchte;
    }

    public void addTankfüllstand()
    {
        tankfuellstand++;
        System.out.println("Wird aufgetankt.");

        if (tankfuellstand >= 15)
            tankfuellstandLeuchte = TankfuellstandLeuchte.GRUEN;

    }

    public void fahren() throws InterruptedException
    {
        while (tankfuellstand > 0)
        {
            System.out.println("Brumm...");

            Thread.sleep(1500);

            tankfuellstand--;

            if (tankfuellstand < 10)
            {
                tankfuellstandLeuchte = TankfuellstandLeuchte.ROT;
                System.out.println("Die Tankleuchte blinkt rot");
                tankfüllstandBeobachter.onTankfüllstandNiedrig(this);
            }
            else if (tankfuellstand < 15)
            {
                tankfuellstandLeuchte = TankfuellstandLeuchte.GELB;
                System.out.println("Die Tankleuchte blinkt gelb.");
                tankfüllstandBeobachter.onTankfüllstandNiedrig(this);
            }
        }
    }
}
