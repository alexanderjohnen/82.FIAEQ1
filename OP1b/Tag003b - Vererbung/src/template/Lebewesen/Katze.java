package template.Lebewesen;

public class Katze extends Tier{




    public Katze(int alter){
        super(alter);
    }


    @Override
    public void ausgabe() {
        System.out.println("ICH bin eine BÖSE Katze!!!!");
    }
}
