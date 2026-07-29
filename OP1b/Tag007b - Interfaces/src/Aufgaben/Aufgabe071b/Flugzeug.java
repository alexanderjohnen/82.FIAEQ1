package Aufgaben.Aufgabe071b;

public class Flugzeug extends Fahrzeug implements Fahrbar
{
    public Flugzeug()
    {
        super();
    }

    @Override
    public void fahren()
    {
        System.out.println("Das Flugzeug kann fahren, da es ein Fahrwerk hat.");
    }
}
