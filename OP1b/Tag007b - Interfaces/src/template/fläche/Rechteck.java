package template.fläche;

public class Rechteck implements HatFlaeche
{
    private double a;
    private double b;

    public Rechteck(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double berechneFlaeche()
    {
        return a*b;
    }
}
