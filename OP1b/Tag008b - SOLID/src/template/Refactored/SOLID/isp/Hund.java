package template.Refactored.SOLID.isp;

public class Hund implements Laeufer,Schwimmer{

    @Override
    public void laufen() {
        System.out.println("Der Hund läuft!");
    }

    @Override
    public void schwimmen() {
        System.out.println("Der Hund schwimmt");
    }


}
