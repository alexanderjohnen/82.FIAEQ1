package template;

// Enums funktionieren ähnlich wie Klassen. Wir können in ihnen Attribute und Methoden definieren.
public enum Fehlercode
{
    ILLEGAL_ARGUMENT(123), OUT_OF_BOUNDS(456), NULL_REFERENCE(789), NUMBER_FORMAT(147);
    // Ähnlich wie bei dem Erzeugen von Objekten können bei dem Erzeugen der Konstanten Argumente übergeben werden.
    // Diese Argumente stellen den Wert der Konstante dar.

    // Ein Feld, das den Wert der Konstante speichert.
    private final int code; // "final" heißt, dass der Wert nicht mehr verändert werden kann.

    public int getCode() // "code" ist private. Um den Wert trotzdem abfragen zu können, brauchen wir eine öffentliche Methode.
    {
        return code;
    }

    // Ein Konstruktor, der beim Erzeugen der Konstanten aufgerufen wird und der Variable den übergebenen Wert zuweist.
    private Fehlercode(int code)
    {
        this.code = code; // "this" ist hier wichtig, da die Variable für den Wert und der Parameter des Konstruktors gleich heißen.
    }

    /**
     * Macht aus einem übergebenen Integer eine Enum-Konstante, wenn möglich.
     * @param code
     * @return Die Enum-Konstante, wenn es eine passende zu dem übergebenen Code gibt, sonst null.
     */
    public static Fehlercode valueOf(int code)
    {
        Fehlercode[] codes = Fehlercode.values(); // values() gibt uns ein Array mit Konstanten.
        for (Fehlercode f : codes)
        {
            if (f.code == code) // Wenn eine Konstante den Wert hat, der dieser Methode übergeben wurde,
                return f; // dann geben wir diese Konstante zurück.
        }
        return null; // Sonst geben wir null zurück.
    }

}
