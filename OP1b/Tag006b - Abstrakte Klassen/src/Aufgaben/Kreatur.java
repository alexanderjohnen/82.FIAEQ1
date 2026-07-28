package Aufgaben;

public abstract class Kreatur
{
    protected String name;

    protected Kreatur(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract void angreifen();
}
