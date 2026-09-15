/*
 * FACTORY METHOD (Erzeugungsmuster)
 * ------------------------------
 * Erklärung:
 * Statt Objekte direkt mit "new" zu erzeugen, überlässt man die Entscheidung,
 * WELCHE konkrete Klasse erzeugt wird, einer separaten Methode.
 *
 * Analogie: Eine Pizzeria-Bestellung – du sagst "eine Pizza Margherita",
 * die Küche (die Factory) entscheidet und baut die passende Pizza zusammen.
 */

abstract class Pizza {}
class Margherita extends Pizza {}
class Salami extends Pizza {}

class PizzaFactory {
    Pizza erstellePizza(String sorte) {
        if (sorte.equals("Margherita")) return new Margherita();
        if (sorte.equals("Salami")) return new Salami();
        return null;
    }
}

/*
 * CODEERKLÄRUNG:
 * Der Aufrufer nutzt nur new PizzaFactory().erstellePizza("Salami") –
 * welches konkrete "new" dahintersteckt, ist versteckt. Neue Sorten
 * hinzuzufügen ändert nur die Factory, nicht den restlichen Code.
 */

public class FactoryMethod {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza p1 = factory.erstellePizza("Margherita");
        Pizza p2 = factory.erstellePizza("Salami");

        System.out.println(p1.getClass().getSimpleName()); // Margherita
        System.out.println(p2.getClass().getSimpleName()); // Salami
    }
}
