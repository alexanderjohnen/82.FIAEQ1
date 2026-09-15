package template.Refactored.SOLID.srp;

public class RechnungsRechner {

    private double betrag;
    public RechnungsRechner(double betrag){
        this.betrag = betrag;
    }

    public double berechneGesamtbetrag(){
        return betrag * 1.19;                               // nur zuständig fürs rechnen
    }


}



// Falsche art
class RechnungBad{
    private double betrag;

    public RechnungBad(double betrag){this.betrag = betrag; }

    public double berechneGesamtbetrag(){                            // Aufgabe 1: Rechnen
        return betrag *1.19;
    }

    public void druckeRechnung(){                                   // Aufgabe 2 : Ausgabe
        System.out.println("Betrag: " + berechneGesamtbetrag());
    }

    public void SpeichereInDatenbank(){                              // Aufgabe 3: Persistenz
        System.out.println("In DB gespeichert....");
    }
}




//