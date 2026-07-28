package Aufgaben;

public class Ritter extends Kreatur
{
    public Ritter(String name)
    {
        super(name);
    }
    public void angreifen()
    {
        System.out.print(" schwingt Schwert!");
    }
}
