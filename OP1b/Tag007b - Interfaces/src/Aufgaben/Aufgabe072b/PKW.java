package Aufgaben.Aufgabe072b;

public class PKW
{
    private int tankfuellstand;
    private TankfuellstandLeuchte tankfuellstandLeuchte = TankfuellstandLeuchte.Rot;
    public TankfuellstandBeobachter tankfüllstandBeobachter;

    public PKW(int tankfuellstand)
    {
        this.tankfuellstand = tankfuellstand;
        if (this.tankfuellstand >= 15)
        {
            this.tankfuellstandLeuchte = TankfuellstandLeuchte.Gruen;
        } else if (this.tankfuellstand >= 10)
        {
            this.tankfuellstandLeuchte = TankfuellstandLeuchte.Gelb;
        }
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
            tankfuellstandLeuchte = TankfuellstandLeuchte.Gruen;

    }

    public void fahren()
    {
        while (tankfuellstand > 0)
        {
            System.out.println("Brumm...");

            if (tankfuellstand < 10)
            {
                tankfuellstandLeuchte = TankfuellstandLeuchte.Rot;
                tankfüllstandBeobachter.onTankfüllstandNiedrig(this);
            }
            else if (tankfuellstand <= 15)
            {
                tankfuellstandLeuchte = TankfuellstandLeuchte.Gelb;
                tankfüllstandBeobachter.onTankfüllstandNiedrig(this);
            }

            tankfuellstand--;
        }
    }
}
