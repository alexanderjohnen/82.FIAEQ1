package Kompositionen;

public class Kompositionen
{
    public static void main(String[] args)
    {
        // Bei einer Komposition darf es kein Teil ohne ein Ganzes geben:
        // Datei eineDatei = new Datei(); // geht nicht, da private innere Klasse

        // Bei einer Komposition darf das Ganze leer sein:
        Ordner javaOP2 = new Ordner();
        javaOP2.zeigeAlleDateien();

        // Eine Datei (ein Teil) gehoert genau zu einem Ganzen:
        javaOP2.erzeugeNeueDatei("Tag01 Java");
        javaOP2.erzeugeNeueDatei("Erdkunde");
        javaOP2.erzeugeNeueDatei("Klassische Musik");

        javaOP2.zeigeAlleDateien();

        // Wird das Ganze geloescht werden die Teile mitgeloescht:
        javaOP2 = null;
    }
}
