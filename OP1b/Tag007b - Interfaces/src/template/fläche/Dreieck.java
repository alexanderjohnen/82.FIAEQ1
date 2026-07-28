package template.fläche;

public class Dreieck implements HatFlaeche
{
    private double g;
    private double h;

    public Dreieck(double g, double h)
    {
        this.g = g;
        this.h = h;
    }

    @Override
    public double berechneFlaeche()
    {
        return (g * h) / 2;
    }
}
