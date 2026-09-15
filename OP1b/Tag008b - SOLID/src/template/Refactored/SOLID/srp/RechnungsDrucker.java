package template.Refactored.SOLID.srp;

public class RechnungsDrucker {
    private RechnungsRechner rechner;

    public RechnungsDrucker(RechnungsRechner rechner){
        this.rechner = rechner;
    }

    public void druckeRechnung(){                                                                      // nur zuständig fürs Drucken
        System.out.println("Rechnungsbetrag (brutto): " +rechner.berechneGesamtbetrag() + "EUR");
    }
}
