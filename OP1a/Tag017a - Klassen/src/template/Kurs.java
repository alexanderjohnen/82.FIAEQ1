package template;

import java.util.LinkedList;

public class Kurs
{
    public static final LinkedList<Kurs> kursListe = new LinkedList<>();

    private String kursbezeichnung;

    public String getKursbezeichnung(){
        return kursbezeichnung;
    }

    public void setKursbezeichnung(String kursbezeichnung){
        this.kursbezeichnung = kursbezeichnung;
    }

    public Kurs(){
        this("Keine Bezeichnung");
        System.out.println("Aufurf des parameterlosen Konstruktors.");
    }

    public Kurs(String kursbezeichnung){
        System.out.println("Aufruf des Konstruktors mit dem Parameter.");
        this.kursbezeichnung = kursbezeichnung;
        kursListe.add(this);
    }
}
