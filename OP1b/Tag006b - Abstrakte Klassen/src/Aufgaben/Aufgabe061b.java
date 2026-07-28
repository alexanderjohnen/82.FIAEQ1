package Aufgaben;

public class Aufgabe061b
{
    /* Level 1
     * Erstellen Sie die abstrakte Klasse "Kreatur" mit einem protected Attribut "name",
     * einer abstrakten Methode "angreifen" und einem Konstruktor, der name initialisiert.
     * Erstellen Sie zwei weitere Klassen "Ritter" und "Drache", die beide von "Kreatur" erben.
     * Die beiden Subklassen implementieren die Methode der Basisklasse.
     * Der Ritter nutzt sein Schwert, der Drache spuckt Feuer.
     * In main() erzeugen Sie je ein Objekt von Ritter und Drache.
     * Rufen Sie in der main-Methode() für beide Objekte die überschriebene angreifen()-Methode auf.
     */

    static void main()
    {
        Ritter ritter = new Ritter("Kunibert");
        Drache drache = new Drache("Roooaaaarrrrrr");

        System.out.print(ritter.getName());
        ritter.angreifen();

        System.out.println();

        System.out.print(drache.getName());
        drache.angreifen();
    }
}
