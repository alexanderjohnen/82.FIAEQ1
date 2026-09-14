package template;

public class Wiederholungen2
{
    static void main()
    {
//        Fahrzeug fahrzeug = new Fahrzeug();
//        fahrzeug.kennzeichen = "Mein Kennzeichen";
//
//        Fahrzeug.anzahlTueren = 5;
//        Fahrzeug.ausgabe();
//
//        int ergebnis = summe(6, 7);
//        System.out.println(ergebnis);
//
//        int ergebnis2;
//        System.out.println(ergebnis2 = summe(6, 9));
//        System.out.println(ergebnis2);
//
//        // Durchschnitt
//        System.out.println(durchschnitt(5, 7, 20, 42));
//
        char c = '+';
        int a;
//
//        if (c == '+')
//        {
//            a = 1 + 1;
//        } else
//        {
//            a = 1 - 1;
//        }
//
//        System.out.println("If-Else: " + a);

        a = (c == '+') ? 1 + 1 : 1 - 1;
//      a = c == '+' ? 1 + 1 : 1 - 1; // geht auch ohne Klammern

        System.out.println(a);

    }

    static int summe(int a, int b)
    {
        return a + b;
    }

    public static int durchschnitt(int... werte)
    {
        int gesamt = 0;
        for (int x : werte)
        {
            gesamt += x;
        }

        return gesamt / werte.length;
    }
}
