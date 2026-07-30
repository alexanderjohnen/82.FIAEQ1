package template;

public class Abstrakt
{
    static void main()
    {
        Leistenkrokodil leistenkrokodil = new Leistenkrokodil("Grau bis graubraun");
        System.out.println("Farbe des Leistenkrokodils: " + leistenkrokodil.getFarbe());
        leistenkrokodil.schwimmen();
        leistenkrokodil.zeigeInfoZumLebensraum();
        leistenkrokodil.imSchlammLiegen();

        System.out.println("_________________");

        Nilkrokodil nilkrokodil = new Nilkrokodil("Oberseits Olivegrün, Bauch leicht weislich grün gelb!");
        System.out.println("Farbe des Krokodils: " + nilkrokodil.getFarbe());
        nilkrokodil.schwimmen();
        nilkrokodil.zeigeInfoZumLebensraum();
        nilkrokodil.imGrasLiegen();

        Krokodil krokodil = new Nilkrokodil("Graubraun");
        krokodil.zeigeInfoZumLebensraum();

        krokodil = new Leistenkrokodil("Dunkel-Olivfarben");
        krokodil.zeigeInfoZumLebensraum();

        System.out.println();
        System.out.println("Ausgabe aller Elemente der Krokodil-Liste");

        for (Krokodil k : Krokodil.krokodilListe)
        {
            // Echten Klassennamen zur Laufzeit ausgeben:
            System.out.println(k.getClass().getSimpleName());
            System.out.println(k.getFarbe());

            // Aus der Oberklasse -> immer erlaubt, Verhalten je nach Objekt (Polymorphie)
            k.zeigeInfoZumLebensraum();

            // Für spezielle Methoden der Unterklasse: erst prüfen, dann casten
            if (k instanceof Leistenkrokodil)
            {
                ((Leistenkrokodil) k).imSchlammLiegen();
            }

            if (k instanceof Nilkrokodil)
            {
                ((Nilkrokodil) k).imGrasLiegen();
            }

        }
    }
}
