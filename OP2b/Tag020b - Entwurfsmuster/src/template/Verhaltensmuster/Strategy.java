/*
 * STRATEGY (Verhaltensmuster)
 * ------------------------------
 * Erklärung:
 * Kapselt austauschbare Algorithmen/Verhaltensweisen in eigene Klassen,
 * sodass zur Laufzeit zwischen ihnen gewechselt werden kann.
 *
 * Analogie: Navi-App mit Routenoptionen – "schnellste Route",
 * "keine Autobahn". Die Sortierlogik/Routenlogik ist austauschbar,
 * ohne die App selbst zu ändern.
 */

interface Routenstrategie {
    void berechneRoute();
}

class SchnellsteRoute implements Routenstrategie {
    public void berechneRoute() {
        System.out.println("Berechne schnellste Route");
    }
}

class OhneAutobahn implements Routenstrategie {
    public void berechneRoute() {
        System.out.println("Berechne Route ohne Autobahn");
    }
}

class Navi {
    private Routenstrategie strategie;

    Navi(Routenstrategie strategie) {
        this.strategie = strategie;
    }

    void starteNavigation() {
        strategie.berechneRoute();
    }
}

/*
 * CODEERKLÄRUNG:
 * Navi kennt nur die Routenstrategie-Schnittstelle. Welche konkrete
 * Strategie (schnellste, ohne Autobahn) genutzt wird, kann beim Erstellen
 * des Navi-Objekts ausgetauscht werden, ohne Navi selbst zu ändern.
 */

public class Strategy {
    public static void main(String[] args) {
        Navi navi1 = new Navi(new SchnellsteRoute());
        navi1.starteNavigation(); // Berechne schnellste Route

        Navi navi2 = new Navi(new OhneAutobahn());
        navi2.starteNavigation(); // Berechne Route ohne Autobahn
    }
}
