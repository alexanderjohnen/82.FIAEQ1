package Aufgaben;

import java.util.ArrayList;
import java.util.Collections;

public class Aufgabe061
{
    /* Level 1
     * Eine Einkaufsliste:
     * Im Main erzeugen Sie eine Liste vom Typ String und fügen ihr fünf Dinge (Brot, Butter, Käse, Rasierschaum, Schokolade) hinzu.
     * Lassen Sie anschließend alle Strings der Liste über eine Foreach-Schleife ausgeben.
     */

    static void main()
    {
        ArrayList<String> einkaufsListe = new ArrayList<>();
        Collections.addAll(einkaufsListe, "Brot", "Butter", "Käse", "Rasierschaum", "Schokolade");

        for (String eintraegeListe : einkaufsListe)
        {
            System.out.println(eintraegeListe);
        }
    }

}
