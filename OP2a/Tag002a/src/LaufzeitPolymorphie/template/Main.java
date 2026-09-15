package LaufzeitPolymorphie.template;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Dynamische (Laufzeit) Polymorphie ermoeglicht so viele tolle Dinge:
        // - Listen die fuer alle Tiere funktionieren.
        // - Methoden die mit allen Tieren funktionieren. usw. usf. :D
        // Tier ist der statische Anteil und Hund der interpretierte dynamische Anteil.
        // Der dynamische Anteil wird zur Laufzeit interpretiert!
        Tier einTier = new Hund();

        // nicht alle Tiere koennen bellen:
        // einTier.bellen();

        // dynamische Polymorphie: Zur Laufzeit wird die richtige ueberschrieben Laufen Methode
        // gefunden und ausgefuehrt. einTier zeigt auf ein Hund-Objekt auf dem Heap und deswegen
        // wird die laufen() Methode von Hund zur Laufzeit gefunden und ausgefuehrt:
        einTier.laufen();

        // Eine Liste fuer alle Tiere. (Statt extra eine Liste fuer Hund, eine Liste fuer Katze etc.)
        List<Tier> alleTiere = new ArrayList<>();
        alleTiere.add(new Hund());
        alleTiere.add(new Katze());
        alleTiere.add(new Hund());

        for(Tier tier : alleTiere)
        {
            // zur Laufzeit wird die richtige ueberschriebene Methode gefunden und ausgefuehrt:
            tier.laufen();
        }

        System.out.println("*******************************************************************");

        Main.lasseEinTierLaufen(new Hund());
        Main.lasseEinTierLaufen(new Katze());
    }

    // Eine Methode fuer alle konkreten Tiere. Gutes Muster: eine Methode die einen
    // breiten input (alle konkreten Tierobjekte) entgegennimmt und dann aber konkrete Dinge ausfuehrt.
    static void lasseEinTierLaufen(Tier tier)
    {
        tier.laufen();
    }

    // Der Rueckgabetyp ist Tier, darum koennen wir konkrete Hund und Katzenobjekte returnieren
    // da Hund und Katze vom Typ Tier sind:
    static Tier erzeugeTier(boolean moechteHund)
    {
        if(moechteHund)
        {
            return new Hund();
        }
        else
        {
            return new Katze();
        }
    }
}

abstract class Tier
{
    void laufen()
    {
        System.out.println("Ich laufe auf tierweise durch die Gegend.");
    }
}

// Hund ist vom Typ Hund und durch die Vererbung zusaetzlich vom Typ Tier. (Typ-Polymorphie)
class Hund extends Tier
{
    @Override
    public void laufen()
    {
        System.out.println("Ich bin ein Hund und trampel durch die Gegend :)");
    }

    void bellen()
    {
        System.out.println("wuff");
    }
}

class Katze extends Tier
{
    void sagMiau()
    {
        System.out.println("Miau! :)");
    }

    void sagMiau(int anzahlMiaus)
    {
        for(int i = 0; i < anzahlMiaus; i++)
        {
            System.out.println("Miau! :D");
        }
    }
}