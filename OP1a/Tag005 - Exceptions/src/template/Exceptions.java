package template;

public class Exceptions
{
    static void main()
    {
//        try
//        {
//            System.out.println("Versuche Parsen...");
//            int ergebnis = Integer.parseInt("Eins");
//            System.out.println("Ergebnis : " + ergebnis);
//        } catch (NumberFormatException ex)
//        {
//            System.out.println("Fehler!" + ex.getMessage());
//        }
//        System.out.println("Programm läuft weiter!");

//        try
//        {
//            System.out.println("Versuche Division...");
//            int a = 10 / 0;
//            System.out.println("Ergebnis: " + a);
//        } catch (ArithmeticException ex)
//        {
//            System.out.println("Wer Frauen versteht, kann auch durch Null teilen." + ex.getMessage());
//        }
//        System.out.println("Gott schuf den Mann, sah ihn an und sagte: \"Das kann ich besser.\" Dann schuf er die Frau.");

        try
        {
            int ergebnis = Integer.parseInt("Eins");
            System.out.println("Ergebnis +" + ergebnis);
        } catch (NumberFormatException ex)
        {
            System.out.println("Fehler: " + ex.getMessage());
        } catch (IllegalArgumentException ex)
        {
            System.err.println("Illegal Argument Exception! " + ex.getMessage());
        } catch (Exception ex)
        {
            System.err.println("Es ist eine allgemeine Exception aufgetreten! " + ex.getMessage());
        }

    }
}
