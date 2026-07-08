package template;

public class Fahrzeug
{
    // Hier sind Methoden und Variablen erlaubt (innerhalb einer Klasse)
    // Variablen und Methoden werden zusammengefasst "Klassen-Member" genannt.
    // "Globale" Variablen, auch Felder genannt, (Attribute der Klasse),
    // die innerhalb jeder Methode in dieser klasse bekannt sind;

    static short anzahlTueren = 4;  // Statisch -> "für sich alleine lebensfähig", d.h. ohne Objekt-Verweis
                                    // (Klassen-Variable)

    String kennzeichen = "ABC-123"; // Nicht statisch -> nur über Objekte aufrufbar (Instanz-Variable). no usages

    // Unterschied statisch/nicht-statisch: Jedes Objekt einer Klasse erhält eine eigene Kopie der nicht-statischen Variable

    static void ausgabe() // Parameterlose void Funktion. Keine Parameter und keine Rückgabe. no usages
    {
        System.out.println("Alle meine Fahrzeuge haben " + anzahlTueren + " Türen.");
    }
}
