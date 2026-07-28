package template;

public class Nilkrokodil extends Krokodil
{
    public Nilkrokodil(String farbe)
    {
        super(farbe);
    }

    @Override
    public void zeigeInfoZumLebensraum()
    {
        System.out.println("Ich lebe am Nil, auch wenn mein Dozent etwas anderes sagt.");
    }

    public void imGrasLiegen()
    {
        System.out.println("Ich liege im Gras. Hier mag ich es am liebsten.");
    }
}
