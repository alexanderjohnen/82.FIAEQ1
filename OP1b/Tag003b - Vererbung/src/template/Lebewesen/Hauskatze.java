package template.Lebewesen;

public class Hauskatze extends Katze {

    public Hauskatze(int alter){
        super(alter);
    }


    // Final bei einer Methode verhindert das Überschreiben in abgeleiteten Klassen
    @Override
    public final void ausgabe() {
        System.out.println("Hallo ich bin eine Hauskatze");
    }
}
