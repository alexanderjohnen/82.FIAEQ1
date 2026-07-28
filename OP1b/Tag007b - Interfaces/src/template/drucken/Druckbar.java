package template.drucken;

public interface Druckbar
{
    public static final String DINA4 = "297 mm x 210 mm"; // Jedes Feld in einem Interface ist automatisch public static final, muss nicht hingeschrieben werden

    public abstract void drucken(); // Jede Methode in einem Interface ist automatisch public abstract, muss nicht hingeschrieben werden

    public static void testDruck()
    {
        System.out.println("Druckergeräusche... Testdruck wird ausgeführt");
    }

    public default boolean pruefeFormat(String format)
    {
        return format.equalsIgnoreCase(DINA4); // ist das gleiche wie if return true else return false
    }
}
