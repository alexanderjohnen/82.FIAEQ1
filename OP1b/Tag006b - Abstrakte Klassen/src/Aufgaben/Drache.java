package Aufgaben;

public class Drache extends Kreatur
{
    public Drache(String name)
    {
        super(name);
    }

    @Override
    public void angreifen()
    {
        System.out.print(" spuckt Feuer!");
    }
}
