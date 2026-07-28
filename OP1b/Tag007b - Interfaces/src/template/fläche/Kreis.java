package template.fläche;

public class Kreis implements HatFlaeche
{
    private double radius;

    public Kreis(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double berechneFlaeche()
    {
        return Math.PI * Math.pow(radius,2);
    }

}
