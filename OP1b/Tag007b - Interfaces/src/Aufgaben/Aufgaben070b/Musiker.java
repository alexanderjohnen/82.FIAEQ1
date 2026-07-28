package Aufgaben.Aufgaben070b;

public class Musiker implements IGitarrenspieler, ISänger
{
    @Override
    public void gitarreSpielen()
    {
        System.out.println("Der Musiker spielt Gitarre.");
    }

    @Override
    public void singen()
    {
        System.out.println("Der Musiker singt ein Lied.");
    }
}
