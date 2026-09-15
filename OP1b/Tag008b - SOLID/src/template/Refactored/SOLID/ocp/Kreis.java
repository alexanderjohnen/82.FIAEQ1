package template.Refactored.SOLID.ocp;

public class Kreis extends Form{
    private double radius;

    public Kreis(double radius){
        this.radius = radius;
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI*radius;
    }
}
