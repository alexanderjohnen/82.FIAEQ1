package template;

import java.util.ArrayList;

public abstract class Krokodil
{
    private String farbe; // Privates Feld -> Kapselung, Zugriff nur über Methoden
    public static final ArrayList<Krokodil> krokodilListe = new ArrayList<>();

    // Konstruktor ist protected -> nur für Unterklassen gedacht
    protected Krokodil(String farbe) {
        this.farbe = farbe;
        krokodilListe.add(this);
    }

    public String getFarbe() {
        return farbe;
    }

    public void schwimmen() {
        System.out.println("Ich schwimme im Wasser.");
    }

    // Abstrakte Methode -> Nur Signatur, KEIN Rumpf, endet mit Semikolon
    public abstract void zeigeInfoZumLebensraum();
}
