package komposition.template;

import java.util.ArrayList;
import java.util.Iterator;

public class Gebaeude {
    // Innere Klasse mit privatem Konstruktor.
    // Kann außerhalb von 'Gebäude' nicht instanziiert werden.
    private static class Raum{
        private int raumNummer;

        // Rückreferenz: Der Raum kennt sein gebäude
        private Gebaeude gebaeude;

        // Privat -> nur 'Gebäude' darf Räume erzeugen
        private Raum(int raumNummer, Gebaeude gebaeude){
            this.raumNummer= raumNummer;
            this.gebaeude = gebaeude;
        }

        public int getRaumNummer(){
            return raumNummer;
        }

        public Gebaeude getGebaeude(){
            return gebaeude;
        }

    }

    private final ArrayList<Raum> raumListe = new ArrayList<>();
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addRaum(int raumNummer){
        // Das Gebäude erzeugt den Raum SELBST und behält ihn in seiner Liste.
        raumListe.add(new Raum(raumNummer, this));
    }

    // Jedes Gebäude braucht mindestens einen RAUM.
    public Gebaeude(String name, int... raumNummer){
        this.name = name;
        for(int i : raumNummer){
            addRaum(i);
        }
    }

   //  Gibt nur die Daten heraus, keine Raum-Referenzen.

    public String getRaeume(){

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Iterator<Raum> iterator = raumListe.iterator(); iterator.hasNext();){
            Raum r = iterator.next();
            sb.append(r.raumNummer);
            if(iterator.hasNext()){
                sb.append(", ");
            }
        }sb.append("]");
        return sb.toString();
    }


    // Modernere Alternative ( Java 8+), macht dasselbe:
//   public String getRaeumeModern(){
//        return raumliste.stream()
//                .map(r-> String.valueOf(r.raumNummer))
//                .collect(java.util.stream.Collectors.joining(", " , " [" , "]"));
//   }
}
