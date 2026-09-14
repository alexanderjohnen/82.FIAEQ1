package template;

import java.util.*;

public class Sammlungen
{
    static void main()
    {
        System.out.println("ARRAYLIST");
        ArrayList<String> autoListe = new ArrayList<>();
        autoListe.add("BMW");           // 0
        autoListe.add("Audi");          // 1
        autoListe.add("Ford");          // 2
        autoListe.add("Mercedes");      // 3

        System.out.println(autoListe);
        System.out.println(autoListe.get(0));
        System.out.println("Größe der Liste: " + autoListe.size());

        String altesAuto = autoListe.set(2, "Porsche");

        System.out.println(altesAuto);
        System.out.println(autoListe);

        try
        {
            System.out.println("Wurde BMW gelöscht? " + autoListe.remove("BMW"));
            System.out.println("An Index 3 gelöscht: " + autoListe.remove(3));
        } catch (Exception e)
        {
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println("Es ist eine allgemeine Exception aufgetreten! " + e.getMessage());
        }

        boolean vorhanden = autoListe.contains("Audi");
        System.out.println("Gibt es einen Audi in unserer List? " + vorhanden);
        System.out.println("Audi befindet sich am Index " + autoListe.indexOf("Audi"));

        ArrayList<Integer> intListe = new ArrayList<>();
        intListe.add(15); //Autoboxing passiert automatisch
        intListe.add(Integer.valueOf(42)); // ausgeschrieben, macht dasselbe
        Integer I = 100;
        intListe.add(I);

        System.out.println(intListe);

        for (int i = 0; i < 5; i++)
        {
            intListe.add(i);

            System.out.println(intListe);
        }

        intListe.remove(0); // Löscht das Element an INDEX 0;
        intListe.remove((Integer) 0); // Löscht das ERSTE Vorkommen des Wertes 0;
        System.out.println(intListe);

        ArrayList<Integer> zuloeschen = new ArrayList<>();
        zuloeschen.add(1);
        zuloeschen.add(3);

        intListe.add(1);
        intListe.add(3);

        intListe.removeAll(zuloeschen);
        System.out.println(intListe);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Collections.sort(intListe);
        Collections.shuffle(intListe);
        Collections.addAll(intListe, 1, 22, 333, 4444, 55555, 67);
        // Collections.binarySearch();
        // Collections.swap();

        HashSet<String> autoSet = new HashSet<>();
        Collections.addAll(autoSet, "BMW", "Audi", "Ford");
        System.out.println(autoSet.add("Hyundai")); // true, Ausgabe sagt uns in diesem Fall, ob hinzufügen erfolgreich war.
        System.out.println(autoSet.add("Hyundai")); // false, weil schon vorhanden

        System.out.println(autoSet);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        HashMap<String, Integer> zahlen = new HashMap<>(Map.of(
                "Eins", 1,
                "Zwei", 2,
                "Drei", 3));

        System.out.println(zahlen);

    }
}
