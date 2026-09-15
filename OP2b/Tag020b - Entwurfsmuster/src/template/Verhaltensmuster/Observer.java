import java.util.ArrayList;
import java.util.List;

/*
 * OBSERVER (Verhaltensmuster)
 * ------------------------------
 * Erklärung:
 * Ein Objekt (Subject) benachrichtigt automatisch mehrere abhängige
 * Objekte (Observer), wenn sich sein Zustand ändert.
 *
 * Analogie: Ein YouTube-Kanal und seine Abonnenten – lädt der Kanal
 * ein neues Video hoch, werden alle Abonnenten automatisch benachrichtigt,
 * ohne dass der Kanal jeden einzeln anschreiben muss.
 */

interface Abonnent {
    void benachrichtigen(String titel);
}

class Kanal {
    private List<Abonnent> abonnenten = new ArrayList<>();

    void abonnieren(Abonnent a) {
        abonnenten.add(a);
    }

    void neuesVideo(String titel) {
        for (Abonnent a : abonnenten) {
            a.benachrichtigen(titel);
        }
    }
}

/*
 * CODEERKLÄRUNG:
 * Kanal kennt nur die Liste der Abonnenten. Bei neuesVideo() werden
 * alle automatisch informiert, ohne dass der Kanal wissen muss,
 * wer/was genau sie sind.
 */

public class Observer {
    public static void main(String[] args) {
        Kanal kanal = new Kanal();

        Abonnent alex = titel -> System.out.println("Alex sieht: " + titel);
        Abonnent sam = titel -> System.out.println("Sam sieht: " + titel);

        kanal.abonnieren(alex);
        kanal.abonnieren(sam);

        kanal.neuesVideo("Neues Java-Tutorial online!");
    }
}
