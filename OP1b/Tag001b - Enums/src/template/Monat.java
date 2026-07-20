package template;

import java.util.ArrayList;

public enum Monat
{
    JANUAR(1, 1), // Januar hat die Zahl 1 und Quartal 1.
    FEBRUAR(2, 1), // Februar hat die Zahl 2 und Quartal 1.
    MÄRZ(3, 1), // usw...
    APRIL(4, 2),
    MAI(5, 2),
    JUNI(6, 2),
    JULI(7, 3),
    AUGUST(8, 3),
    SEPTEMBER(9, 3),
    OKTOBER(10, 4),
    NOVEMBER(11, 4),
    DEZEMBER(12, 4);

    // Zwei Felder, um zu jeder Konstante zwei Werte speichern zu können.
    // Jede Konstante erhält eine Kopie dieser Felder.
    private final int zahl;
    private final int quartal;

    // Die beiden Felder sind "private". Damit aus anderen Klassen auf die Werte zugegriffen werden kann, brauchen wir Getter-Methoden.
    public int getZahl()
    {
        return zahl;
    }

    public int getQuartal()
    {
        return quartal;
    }

    private Monat(int z, int q) // Die Parameter des Konstruktors müssen nicht wie die Felder heißen.
    {
        this.zahl = z;
        this.quartal = q;
    }

    /**
     * Erzeugt eine ArrayList mit allen Monaten passend zum übergebenen Quartal.
     * @param quartal
     * @return Die Liste mit den Monaten im angegebenen Quartal.
     */
    public static ArrayList<Monat> getMonateInQuartal(int quartal)
    {
        ArrayList<Monat> monateInQuartal = new ArrayList<>(); // Enums sind Datentypen und diese Datentypen können auch für Listen und Arrays verwendet werden.

        for (Monat m : Monat.values()) // Alle Konstanten durchsuchen.
            if (m.quartal == quartal) // Wenn der Wert für Quartal in der Konstante dem gesuchten Quartal entspricht,
                monateInQuartal.add(m); // fügen wir den Monat der Liste hinzu.

        return monateInQuartal; // Zum Schluss geben wir die Liste zurück.
    }

    /**
     * Gibt den Monat passend zur übergebenen Zahl zurück, wenn möglich.
     * @param zahl
     * @return Der Monat passend zur übergebenen Zahl, wenn es einen passenden monat gibt. Sonst null.
     */
    public static Monat valueOf(int zahl)
    {
        for (Monat m : Monat.values()) // Alle Monate durchsuchen.
            if (m.zahl == zahl) // Wenn der Wert für Zahl in der Konstante der gesuchten Zahl entspricht,
                return m; // geben wir die Konstante zurück.

        return null; // Sonst geben wir null zurück.
    }

}
