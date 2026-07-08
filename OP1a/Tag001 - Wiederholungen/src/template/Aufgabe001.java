package template;

import java.util.Scanner;

public class Aufgabe001
{
    /* Level 1
     * Schreiben Sie ein Java-Programm das kontrolliert, ob eine Zahl gerade oder ungerade ist
     * und dann einen String ausgibt der sagt "Die Zahl ist ungerade" oder "Die Zahl ist gerade".
     * Hinweis: Zur Vergleichsberechnung bietet sich der Modulo-Operator % an.
     */

    static void main()
    {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        if (input % 2 == 0)
        {
            System.out.println("Die Zahl ist gerade.");
        }
        else
        {
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}
