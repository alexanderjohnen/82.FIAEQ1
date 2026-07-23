package template.Lebewesen;

public class Hund extends Tier{

    private String fellfarbe;

    public Hund(int alter, String fellfarbe){
       super(alter);
        this.fellfarbe = fellfarbe;
        System.out.println("Aufruf des Konstruktors in Hund.");
    }

    public String getFellfarbe(){
        return fellfarbe;
    }

    @Override
    public void ausgabe() {
        //  super.ausgabe();
        System.out.println("Ich bin ein HUND Wuff wuff!!");
    }

    public void bellen(){
        System.out.println("Der Postboote kommt WUFf WUFF dich schnapp ich mir!!!!");
    }
}
