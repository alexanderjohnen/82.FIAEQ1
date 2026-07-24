package Aufgaben;

import java.util.Scanner;

public class Aufgabe001b
{
    static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wie viele Zahlen? ");
        int anzahlZahlen = Integer.parseInt(scan.nextLine());

        int zahl1;
        int zahl2 = 0;
        int zahl3 = 0;

        for (int i = 0; i < anzahlZahlen; i++)
        {
            System.out.println("Gib die " + (i + 1) + ". Zahl ein: ");
            zahl1 = Integer.parseInt(scan.nextLine());
            if (zahl2 == 0 || zahl2 > zahl1)
            {
                zahl2 = zahl1;

            }

            if (zahl3 == 0 || zahl3 < zahl1)
            {
                zahl3 = zahl1;
            }
        }

        System.out.println(zahl2);
        System.out.println(zahl3);
    }
}
