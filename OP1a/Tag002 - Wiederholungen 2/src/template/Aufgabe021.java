package template;

import java.util.Scanner;

public class Aufgabe021
{
    /* Level 2
     * In ihrem Unternehmen werden neue Artikelnummern vergeben. Sie bestehen aus 5 Zahlen und einer Prüfziffer.
     * Sie sollen ein Programm entwerfen, dass 5 einstellige Zahlen einliest und daraus die Prüfziffer errechnet und sie auf der Console ausgibt.
     * Wie Sie mit Fehleingaben umgehen, bleibt Ihnen überlassen.
     * Folgende Informationen erhalten Sie für die Berechnung der Prüfziffer:
     * - die geraden Zahlen werden addiert, die ungeraden Zahlen werden mit 3 multipliziert und anschließend addiert.
     * - die Prüfziffer ergibt sich aus der letzten Stelle der Summe.
     * Beispiel:    27493 => 2+4 = 6;
     *              7*3+9*3+3*3 = 57;
     *              6 + 57 = 63 => Prüfziffer 3
     *              Artikelnummer = 27493-3
     */

//    static void main()
//    {
//
//        Scanner scan = new Scanner(System.in);
//
//        int[] eingabe = new int[5];
//
//        for (int i = 0; i < 5; i++)
//        {
//            System.out.print("Geben Sie bitte die " + (i + 1) + ". Zahl: ");
//            eingabe[i] = scan.nextInt();
//
//            while (eingabe[i] < 0 || eingabe[i] > 9)
//            {
//                System.out.println("Ungültige Eingabe! Bitte geben Sie nur eine einestellige Zahl (0-9) ein: ");
//                eingabe[i] = scan.nextInt();
//            }
//        }
//
//        int summe = 0;
//
//        for (int j = 0; j < 5; j++)
//        {
//            if (eingabe[j] % 2 == 0)
//            {
//                // Zahl ist gerade -> normal addieren
//                summe += eingabe[j];
//            }
//            else
//            {
//                // Zahl ist ungerade -> mit 3 multiplizieren und addieren
//                summe += (eingabe[j] * 3);
//            }
//        }
//
//        int pruefziffer = summe % 10;
//
//        System.out.print("Die Artikelnummer lautet: ");
//
//        for (int k = 0; k < 5; k++)
//        {
//            System.out.print(eingabe[k]);
//        }
//
//        System.out.print("-" + pruefziffer);
//
//    }

    public static void main(String[] args)
    {
        int summe = 0;

        System.out.print("Bitte die Artikelnummer ohne Prüfziffer eingeben und mit Return bestätigen: ");

        int artikelnummer = Integer.parseInt(new Scanner(System.in).nextLine());

        int temp = artikelnummer;

        while(temp > 0)
        {
            int zahl = temp % 10;
            temp = temp / 10;

            if (zahl % 2 == 1)
            {
                zahl *= 3;
            }
            summe += zahl;
        }

        String artikelnummerString = artikelnummer + "-" + summe % 10;

        System.out.println();
        System.out.println(artikelnummerString);

    }

}
