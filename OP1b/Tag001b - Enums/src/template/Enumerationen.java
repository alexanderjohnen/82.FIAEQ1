package template;

// Typsichere Aufzählungen können als spezielle Art von Klassen mit dem Schlüsselwort "enum" realisiert werden.

import java.util.Arrays;

public class Enumerationen
{
    // Erstes Enum:
    // Mit einem Enum können wir wichtige Konstanten in unserem Programm zusammenfassen.
    enum Ampelfarbe
    {
        // Konstanten werden großgeschrieben.
        ROT, GELB, GRÜN
    }

    /**
     * Macht eine Ausgabe passend zur übergebenen Enum-Konstante.
     */
    static void info(Ampelfarbe farbe) // Enums können als Parameter für Methoden verwendet werden.
    {
        switch (farbe)
        {
            case ROT:
                // ordinal() gibt den Zahlenwert der Konstante zurück. Diese beginnt bei 0.
                System.out.println(farbe.ordinal() + ": Anhalten");
                break;
            case GELB:
                System.out.println(farbe.ordinal() + ": Achtung");
                break;
            case GRÜN:
                System.out.println(farbe.ordinal() + ": Weiterfahren");
                break;
        }
    }


    public static void main(String[] args)
    {
        // Aus dem Enum können wir eine Variable erzeugen und ihr eine Konstante zuweisen.
        Ampelfarbe farbe = Ampelfarbe.ROT;

        info(farbe); // Variable an die Methode übergeben.

        info(Ampelfarbe.GELB); // Konstanten direkt an die Methode übergeben.
        info(Ampelfarbe.GRÜN);

        // In einer Foreach-Schleife können wir über die verfügbaren Konstanten iterieren:
        for (Ampelfarbe ampelfarbe : Ampelfarbe.values()) // Mit values() erzeugen wir ein Array aus den verfügbaren Konstanten.
            System.out.println(ampelfarbe.name()); // name() gibt den Bezeichner der Konstante zurück, so wie sie im Enum deklariert wurde.

        System.out.println();

        System.out.println(Arrays.toString(Fehlercode.values()));

        Fehlercode fehler = Fehlercode.ILLEGAL_ARGUMENT;
        System.out.println("Die Konstante " + fehler.name() + " hat den Wert " + fehler.getCode());

        Fehlercode fehler2 = Fehlercode.valueOf(456);
        if (fehler2 != null) // Unsere eigene valueOf()-Methode gibt null zurück, wenn es zu dem Code keine Konstante gibt.
            System.out.println("Die Konstante " + fehler2.name() + " hat den Wert " + fehler2.getCode());

        // Beispiel:
        Fehlercode fehler3;
        try
        {
            // Diese Methode könnte eine IllegalArgumentException werfen...
            fehler3 = Fehlercode.valueOf("NULL");
        }
        catch (IllegalArgumentException ex)
        {
            // was dann unserem Fehlercode ILLEGAL_ARGUMENT entsprechen würde.
            fehler3 = Fehlercode.ILLEGAL_ARGUMENT;
        }

        System.out.println("Die Konstante " + fehler3.name() + " hat den Wert " + fehler3.getCode());

        System.out.println();

        System.out.println("Quartal: ");
        System.out.println(Monat.getMonateInQuartal(3));
        System.out.println("Monat: ");
        Monat monat = Monat.valueOf(10);
        System.out.println("Zahl: " + monat.getZahl() + ", Name: " + monat.name() + ", Quartal: " + monat.getQuartal());

    }
}
