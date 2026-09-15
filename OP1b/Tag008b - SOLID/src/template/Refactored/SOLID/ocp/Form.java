package template.Refactored.SOLID.ocp;

public abstract class Form {
    public abstract double berechneUmfang();
}










// Verstoß alles in einem
class FlaechenRechnenBad{
    public double berechneUmfang (String typ, double a , double b){
        if(typ.equals("rechteck")) return 2*(a+b);
        else if(typ.equals("kreis")) return 2 * Math.PI*a;
        // VLl noch dreieck etc.......
        return 0;
    }
}