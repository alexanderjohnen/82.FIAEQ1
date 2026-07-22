package assoziationen.template;

import java.time.LocalDateTime;

public class Assoziationen
{
    public static void main(String[] args)
    {
        // 1) Auto -> Person (Eine 1:n Beziehung, bei der wir vom Auto auf den Besitzer (Person) schließen können, aber nicht umgekehrt.
        // Lösung: Wir führen ein Attribut 'besitzer' vom Typ Person in der Klasse 'Auto' ein.

        // Instanziierung einer Person:
        Person person1 = new Person(1, "Ivanov");
        // Instanziierung eines Autos:
        Auto auto1 = new Auto(1, "Opel", person1); // -> Wir übergeben das Objekt 'person1' als Besitzer an den Konstruktor 'Auto()'.

        // Nun kann ich vom Auto zur Person navigieren, indem ich über das Attribut 'besitzer' auf dessen Member zugreifen kann.
        // Beispiel: Wie heißt der Besitzer von Auto 'auto1' mit Nachnamen?
        System.out.println("Nachname des Besitzers von auto1: " + auto1.getBesitzer().getNachname());

        new Auto(2, "BMW"); // Ein Auto ohne Besitzer.

        System.out.println();
        // ABER: Navigation von Person zu Auto gelingt uns nicht (unmittelbar).
        // Eine mögliche Lösung wäre, alle Autos abzuklappern und nach einem passenden Besitzer zu suchen.
        for (Auto a : Auto.autoListe)
        {
            System.out.println("Auto-ID: " + a.getId());
            // Die Objekt-Referenzen aus a.besitzer und person1 miteinander vergleichen:
            if (a.getBesitzer() == person1)
                System.out.println("Dieses Auto gehört " + a.getBesitzer().getNachname());
            else
                System.out.println();
        }

        System.out.println();
        // 2) Person <-> Auto (Eine m:n Beziehung. Wir können von Person zu Auto navigieren und von Auto zu Person)
        Person person2 = new Person(2, "Gonzales");
        Auto auto3 = new Auto(3, "Ford", person2);

        auto1.getFahrerListe().add(person1); // Person1 darf Auto1 fahren.
        person1.getDarfFahrenListe().add(auto1);

        auto3.getFahrerListe().add(person1); // Person1 darf Auto3 fahren.
        person1.getDarfFahrenListe().add(auto3);

        auto3.getFahrerListe().add(person2); // Person2 darf Auto3 fahren.
        person2.getDarfFahrenListe().add(auto3);

        // Ausgabe:
        for (Person p : Person.personListe)
        {
            System.out.println("Diese Autos darf " + p.getNachname() + " fahren:");
            for (Auto a : p.getDarfFahrenListe())
                System.out.print(a.getId() + " "); // Von Person zum Auto navigieren.
            System.out.println();
        }

        for (Auto a : Auto.autoListe)
        {
            System.out.println("Diese Personen dürfen " + a.getMarke() + " fahren:");
            for (Person p : a.getFahrerListe())
                System.out.print(p.getNachname() + " "); // Von Auto zur Person navigieren.
            System.out.println();
        }

        System.out.println();

        // 3) Person -> Haustier (m:n Beziehung, bei der wir von Person auf alle dessen Haustiere schließen können.)
        // Lösung: Eine Haustier-Liste in Person.

        // Instanziierung von 2 Haustieren:
        Haustier haustier1 = new Haustier(1, "Bello");
        Haustier haustier2 = new Haustier(2, "Kitty");

        // Hinzufügen der Haustiere in die Liste der Person2 (Person2 wurde weiter oben bereits erzeugt)
        person2.getHaustierListe().add(haustier1);
        person2.getHaustierListe().add(haustier2);

        // Ich kann nun von Person zu allen Haustieren dieser Person navigieren:
        // Beispiel: Name aller Haustiere von 'person2':
        System.out.println("Name aller Haustiere von " + person2.getNachname());
        for (Haustier h : person2.getHaustierListe())
            System.out.println(h.getName());

        System.out.println();

        // 4) Beispiel für eine Assoziationsklasse (Produkt-Person)
        // m:n Beziehung zwischen Produkt und Person, denn ein Produkt kann von mehreren Personen gekauft werden und eine Person kann mehrere Produkte kaufen.
        // Hier besteht eine Aggregation, denn ein Einkauf besteht aus Käufer (Person) und Ware (Produkt).

        Produkt produkt1 = new Produkt(1, 3.50, "Äpfel");
        Produkt produkt2 = new Produkt(2, 4.70, "Kartoffeln");

        new Einkauf(1, LocalDateTime.now(), person1, produkt1);
        new Einkauf(2, LocalDateTime.now(), person1, produkt2);
        new Einkauf(3, LocalDateTime.now(), person2, produkt1);

        System.out.println("Liste aller Produkte, die von " + person1.getNachname() + " gekauft wurden:");
        for (Einkauf e : Einkauf.einkaufListe)
        {
            if (e.getKäufer() == person1) // Objektreferenz vergleichen. (Alternativ die IDs vergleichen)
                System.out.println(e.getWare().getBezeichnung());
        }
    }
}
