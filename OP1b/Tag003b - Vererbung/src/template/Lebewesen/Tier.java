package template.Lebewesen;

import java.util.ArrayList;

// SUPERKLASSE (auch : Basisklasse, ElternKlasse)
public class Tier {

    // Statische Liste für alle Tiere
    // Dank Polymorphie können dort auch die subklassen gespeichert werden.
    public static final ArrayList<Tier> tierListe = new ArrayList<>();

    // Alle TIERE haben ein Alter.
    private int alter;

    public Tier (int alter){
        System.out.println("Aufurf des Konstruktors in Tier.");
        this.alter = alter;

        tierListe.add(this);
    }

    public int getAlter(){
        return alter;
    }

    public  void ausgabe(){
        System.out.println("Ich bin ein TIER!!!!!!");
    }

}
