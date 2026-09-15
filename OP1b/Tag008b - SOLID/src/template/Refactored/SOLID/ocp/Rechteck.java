package template.Refactored.SOLID.ocp;

public class Rechteck extends Form {
    private double  breite, hoehe;

    public Rechteck(double breite, double hoehe){
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public double berechneUmfang() {
        return 2* (breite+hoehe);
    }

}

