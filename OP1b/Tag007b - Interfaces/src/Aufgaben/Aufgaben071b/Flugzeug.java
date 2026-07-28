package Aufgaben.Aufgaben071b;

import java.util.List;

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
