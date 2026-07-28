package template;

public class Leistenkrokodil extends Krokodil
{

    public Leistenkrokodil(String farbe)
    {
        super(farbe);
    }

    public Leistenkrokodil()
    {
        this("Keine Farbe");
    }

    @Override
    public void zeigeInfoZumLebensraum()
    {
        System.out.println("Ich lebe hier und da und irgendwo.");
    }

    public void imSchlammLiegen()
    {
        System.out.println("Ich liege im Schlamm. Hier mag ich es besonders gern.");
    }

}
