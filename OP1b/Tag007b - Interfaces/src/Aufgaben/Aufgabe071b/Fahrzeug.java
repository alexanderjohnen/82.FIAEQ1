package Aufgaben.Aufgabe071b;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug
{
    public static List<Fahrzeug> fahzeugListe = new ArrayList<>();

    protected Fahrzeug()
    {
        fahzeugListe.add(this);
    }
}
