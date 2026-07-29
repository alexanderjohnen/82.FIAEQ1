package Aufgaben.Aufgabe071b;

public class Aufgabe071b
{
    /* Level 2
     * Erstellen Sie folgende Interfaces:
     * "Flugfähig" mit einer void Methode "fliegen()".
     * "Fahrbar" mit einer void Methode "fahren()".
     * "Schwimmfähig" mit einer void Methode "schwimmen()".
     *
     * Erstellen Sie weiterhin fünf Klassen:
     * - abstrakte Klasse "Fahrzeug" mit einer statischen Liste vom Typ "Fahrzeug" und einem parameterlosen Konstruktor, der das aktuelle Objekt der Liste hinzufügt.
     * - "Flugzeug", welche von "Fahrzeug" erbt und die Interfaces "Flugfähig" und "Fahrbar" implementiert.
     * - "Auto", erbt von "Fahrzeug" und implementiert das Interface "Fahrbar".
     * - "Bagger", erbt von "Fahrzeug" und implementiert "IFahrbar" und "Schwimmfähig".
     * - "Boot", erbt von "Fahrzeug" und implementiert "Schwimmfähig".
     * Die implementierten Methoden sollen einen passenden Text auf der Konsole ausgeben.
     *
     * Erstellen Sie in der Main je ein Objekt der nicht-abstrakten Klassen. Über eine Schleife iterieren Sie durch die statische Liste in Fahrzeug, ermitteln, welches Interface die Objekte implementieren und rufen dann für jedes Objekt die verfügbaren Methoden auf.
     * Erstellen Sie ein UML Klassendiagramm.
     */

    static void main()
    {
        Fahrzeug flugzeug = new Flugzeug();
        Fahrzeug bagger = new Bagger();

        for(Fahrzeug f : Fahrzeug.fahzeugListe)
        {
            if (f instanceof Fahrbar)
            {
                ((Fahrbar)f).fahren();
            }

            if (f instanceof Flugfähig)
            {
                ((Flugfähig)f).fliegen();
            }

            if (f instanceof Schwimmfähig)
            {
                ((Schwimmfähig)f).schwimmen();
            }

        }
    }
}
