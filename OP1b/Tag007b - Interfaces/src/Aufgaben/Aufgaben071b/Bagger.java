package Aufgaben.Aufgaben071b;

public class Bagger extends Fahrzeug implements Fahrbar, Schwimmfähig
{
    public Bagger()
    {
        super();
    }

    @Override
    public void fahren()
    {
        System.out.println("Der Bagger kann auf seinen Ketten fahren.");
    }

    @Override
    public void schwimmen()
    {
        System.out.println("Der Bagger kann auf seinen Ketten scheinbar auch schwimmen.");
    }
}
