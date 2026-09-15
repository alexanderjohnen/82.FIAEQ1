/*
 * SINGLETON (Erzeugungsmuster)
 * ------------------------------
 * Erklärung:
 * Stellt sicher, dass es von einer Klasse nur genau EINE Instanz gibt,
 * und bietet einen globalen Zugriffspunkt darauf.
 *
 * Analogie: Der Drucker im Büro – es gibt nur einen,
 * alle greifen auf denselben zu, statt sich jeder einen eigenen anzuschaffen.
 */

class Drucker {
    private static Drucker instanz;

    private Drucker() {
        // privater Konstruktor verhindert "new" von außen
    }

    public static Drucker getInstanz() {
        if (instanz == null) {
            instanz = new Drucker();
        }
        return instanz;
    }
}

/*
 * CODEERKLÄRUNG:
 * Der Konstruktor ist "private", also kann niemand von außen
 * new Drucker() aufrufen. Nur über getInstanz() kommt man an das Objekt –
 * und das erzeugt es nur beim allerersten Aufruf.
 */

public class Singleton {
    public static void main(String[] args) {
        Drucker d1 = Drucker.getInstanz();
        Drucker d2 = Drucker.getInstanz();

        System.out.println(d1 == d2); // true -> beide Variablen zeigen auf dasselbe Objekt
    }
}
