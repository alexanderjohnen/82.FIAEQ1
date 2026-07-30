package Aufgaben.Aufgabe072b;

public class Fahrer implements TankfuellstandBeobachter
{
    @Override
    public void onTankfüllstandNiedrig(PKW pkw)
    {
        if (pkw.getTankfuellstandLeuchte() == TankfuellstandLeuchte.GELB)
        {
            System.out.println("Ach, hat noch Zeit...");
        }

        if (pkw.getTankfuellstandLeuchte() == TankfuellstandLeuchte.ROT)
        {
            System.out.println("Jetzt aber dringend tanken...");
            tanken(pkw);
        }
    }

    public void tanken(PKW pkw)
    {
        while (pkw.getTankfuellstand() != 30)
            pkw.addTankfüllstand();
    }
}
