package template.Refactored.SOLID.isp;

interface TierBad{
    void laufen();
    void schwimmen();
    void fliegen();
}


public class HundBad implements TierBad{
    public void laufen(){
        System.out.println("Er läuft!!!!");
    }

    @Override
    public void schwimmen() {
        System.out.println("Er schwimmt");
    }

    @Override
    public void fliegen() {
        /* Hund kann nicht fliegen -> leer, sinnlos */
    }
}
