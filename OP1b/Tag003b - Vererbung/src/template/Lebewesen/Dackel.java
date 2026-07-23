package template.Lebewesen;

// Dackel ist Subklasse von Hund, und da Hund Subklasse von Tier ist,
// ist Dackel auch eine Subklasse von Tier.
// Dackel IST EIN Hund UND EIN Tier.
// 'final' bei Klassen: von dieser Klasse kann nicht weiter abgeleitet werden.
public final class Dackel extends Hund {


    public Dackel(int alter, String fellfarbe){
        super(alter, fellfarbe);
        System.out.println("AUfruf des Konstruktors in Dackel WUFFII.");
    }

    @Override
    public void ausgabe() {
        //   super.ausgabe();
        System.out.println("Ich bin ein Dackel.....");
    }

    public void wuffi(){
        System.out.println("WUFFI WUFFI 123");
    }
}
