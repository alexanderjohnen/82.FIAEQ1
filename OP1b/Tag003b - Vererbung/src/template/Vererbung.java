package template;

import template.Lebewesen.*;

public class Vererbung {
    public static void main(String[] args) {

        Tier tier1 = new Tier(5);
        System.out.println(tier1.getAlter());
        tier1.ausgabe();

        System.out.println("_____________________________");
        System.out.println();
        Hund hund = new Hund(10,"Braun");
        System.out.println(hund.getAlter());            // Geerbt von TIER!
        System.out.println(hund.getFellfarbe());        // in Hund deklariert
        hund.ausgabe();

        Dackel dackel = new Dackel(3,"Grau");
        System.out.println(dackel.getAlter());              // von Tier
        System.out.println(dackel.getFellfarbe());          // von Hund
        dackel.ausgabe();                                   // 3 stufen
        dackel.bellen();                                    // von Hund


        System.out.println("________Katzen______");
        Katze katze = new Katze(56);
        System.out.println(katze.getAlter());
        katze.ausgabe();

        Hauskatze hauskatze = new Hauskatze(3);
        System.out.println(hauskatze.getAlter());
        hauskatze.ausgabe();

        System.out.println();
        System.out.println("_____POLYMORPHIE____");

        Tier tier = new Hund(8,"Schwarz");
        System.out.println(tier.getAlter());
      //  System.out.println(tier.getFellfarbe());            // CompilerFehler!!!!!

        // Möchte ich die Member aus 'Hund' , muss gecastet werden.
        String fellfarbe = ((Hund)tier).getFellfarbe();
        System.out.println(fellfarbe);
       //((Hund)tier).ausgabe();             // cast unnötig auf die Methode ausgabe
        tier.ausgabe();                        // nimmt die ausgabe von Hund da letzte überschrieben instanz
        ((Hund) tier).bellen();                 // cast notwendig , weil TIER kein bellen kennt

      //  System.out.println(((Hund)tier).getFellfarbe());
        // Selbe wie oben nur das wir nicht in eine extra Variable gespeichert haben

        // Alternative Schreibweise fürs Casten :
//         String  fellfarbe1 = Hund.class.cast(tier).getFellfarbe();
//        System.out.println(fellfarbe1);


        Tier tier2 = new Dackel(4,"Braun");
        tier2.ausgabe();                                // Dank Override wird immer die Methode
                                                        // der tatsächlich instanziierten Klasse aufgerufen
        ((Dackel)tier2).bellen();


        System.out.println();

        // Polymorphie- Vielgestaltigkeit
        // Alle Objekte passen in eine gemeinsame Liste.
        // So können wir mit EINER Schleife über alle Tiere iterieren
        for(Tier t : Tier.tierListe){

            // getclass() liefert zur Laufzeit die Klasse und die Metadaten.

            System.out.println(t.getClass());
            System.out.println(t.getClass().getSimpleName());

            // Alle Tiere haben ein Alter:
            System.out.println("Alter : " + t.getAlter());
            // Welchen Typ hat unser Objekt wirklich? -> instanceof
           if( t instanceof Hund)           // ist das Objekt eine Intanz von Hund?
           {
               Hund h = (Hund) t;
               System.out.println("Fellfarbe : " + h.getFellfarbe());
           }
           if(t instanceof Dackel){
               Dackel d = (Dackel)t;
               d.wuffi();
           }
           // Ohne instanceof-Prüfung riskieren wir eine ClassCastException

//            if( t instanceof Hund h ){                          // Prüfen und casten in einem Schritt
//                System.out.println("Fellfarbe : " + h.getFellfarbe());
//            }

        }


    }
}
