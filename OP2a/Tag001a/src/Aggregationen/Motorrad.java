package Aggregationen;

public class Motorrad
{
    // Sobald eine Klasse andere Klassen als Attribute hat sprechen wir von einer
    // ganzen Teile Beziehung.
    private Motor motor;
    private Rad vorderrad;
    private Rad hinterrad;

    public Motorrad(Motor motor, Rad vorderrad, Rad hinterrad)
    {
        this.motor = motor;
        this.vorderrad = vorderrad;
        this.hinterrad = hinterrad;
    }
}

class Motor {}

class Rad{}
