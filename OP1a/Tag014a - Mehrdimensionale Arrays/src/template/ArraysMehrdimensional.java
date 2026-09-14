package template;

import java.util.Arrays;

public class ArraysMehrdimensional
{
    public static void main(String[] args)
    {

        // Einstieg am Bekannten : Ein 1-dimensionales Array
        // Beispiel: Schulnoten in diesem Jahr (wir behaupten, es gab 4 Prüfungen)
        int[] schulnoten2018 = new int[]{4, 3, 2, 1};
        //Beispielausgabe
        System.out.println("Die 3. Note im Jahr 2018 war: " + schulnoten2018[2]);
        // 3. Schulnote -> Index 2, denn unsere Aufzählung beginnt bei 0

        // Übergang zu 2- Dimensionalität:
        // Wir wollen weiterhin die Noten pro Jahr zählen ( 1.Dimension)
        // ... nun aber auch die Jahre(2.Dimension)
        // in diesem Beispiel interessieren wir uns für die letzten 3 Jahre und behaupten weiterhin: Pro Jahr 4 Prüfungen
        int[][] schulKarriere = new int[][]
                {
                        {3, 4, 5, 6},      // 4 Noten 1 Jahr  (Index 0)
                        {1, 2, 3, 4},      // 4 Noten 2 Jahr  (Index 1)
                        {6, 3, 2, 2}       // 4 Noten 3 Jahr  (Index 2)
                };
        // Beispielausgabe:
        System.out.println("2. Note im Jahr 1 war: " + schulKarriere[0][1]);    // Antwort : 4

        // Hinweis: Die Zählung der Dimension wird oft auch umgedreht. Zum Beispiel bei int[3][4] könnte man auch sagen,
        // das die 3 die 1. Dimension ist und die 4 die zweite Dimension. Da wir hier aber die eigentlich Daten zur 4 speichern,
        // nehmen wir das als unsere 1. Dimension.
        // Was wir jetzt eigentlich tatsächlich als 1. Dimension bezeichnen, was als 2. Dimension, etc., liegt ganz allein an der Betrachtungsweise des Arrays


        // Überganzg zur 3.Dimension
        // Beispiel :2 Schüler, von beiden 3 Jahre, jeder schrieb jedes Jahr 4 Prüfungen.
        // int[2][3][4]
        int[][][] schulStatistik = new int[][][]
                {
                        {
                                {3, 4, 5, 6},  // Schüler 1 (Index 0), Jahr1 (Index 0), Noten 1 bis 4 (Index 0 bis 3)
                                {1, 2, 3, 4},  // Schüler 1 (Index 0), Jahr2 (Index 1), Noten 1 bis 4 (Index 0 bis 3)
                                {2, 6, 1, 3}   // Schüler 1 (Index 0), Jahr3 (Index 2), Noten 1 bis 4 (Index 0 bis 3)
                        },
                        {
                                {2, 1, 2, 5},  // Schüler 2 (Index 1), Jahr1 (Index 0), Noten 1 bis 4 (Index 0 bis 3)
                                {4, 1, 5, 4},  // Schüler 2 (Index 1), Jahr2 (Index 1), Noten 1 bis 4 (Index 0 bis 3)
                                {1, 1, 2, 4}   // Schüler 2 (Index 1), Jahr3 (Index 2), Noten 1 bis 4 (Index 0 bis 3)
                        }
                };
        // Beispielausgabe:
        System.out.println("Schüler 1 / Jahr 3 / Prüfung 4 : " + schulStatistik[0][2][3]); // Antwort: 3

        // Zu beachten ist, dass Arrays immer mit 0 beginnen, Schüler 1 ist also Stelle 0 im Array

        // Über toString() erhalte ich bei mehrdimensionalen Arrays den Hashcode.
        System.out.println(Arrays.toString(schulStatistik));
        // Icxh muss die ersten Dimensionen ( damit meine ich hier in diesem Beispiel die 3. und 2. Dimension angeben
        System.out.println(Arrays.toString(schulStatistik[0][0]));
        // Oder über die deepToString() alle Werte im Array
        System.out.println(Arrays.deepToString(schulStatistik));

        // Length bei mehrdimensionalen Arrays
        System.out.println("Length bei Array schulStatistik:");
        System.out.println(schulStatistik.length); // -> 2
        System.out.println(schulStatistik[0].length); // -> 3
        System.out.println(schulStatistik[0][0].length); // -> 4

        System.out.println();

        // int [4]   [5]   [6]

        // Ausgabe eines 3-Dimensionalen Arrays mit for-Schleife
        System.out.println("Ausgabe Schulstatistik: ");


        for (int schueler = 0; schueler < schulStatistik.length; schueler++)
        {
            System.out.println("Für Schüler/in " + (schueler + 1));
            for (int jahr = 0; jahr < schulStatistik[schueler].length; jahr++)
            {
                System.out.println("Für das Jahr " + (jahr + 1));
                for (int note = 0; note < schulStatistik[schueler][jahr].length; note++)
                {
                    System.out.print(schulStatistik[schueler][jahr][note] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Mehrdimensionale Arrays mit nachträglicher Zuweisung:
        // 3 Klassen : Klasse 1 hat 20 Schüler , Klasse 2 hat 15 Schüler , Klasse 3 hat 25 Schüler
        String[][] schuelerArray = new String[3][];
        // Der Zweite Eintrag fehlt : wir wissen, wie viele Klassen (3),
        // aber die Schüleranzahl pro klasse ist unterschiedlich

        // Klasse 1
        schuelerArray[0] = new String[20];
        // Klasse 2
        schuelerArray[1] = new String[15];
        // Klasse 3
        schuelerArray[2] = new String[25];

        // Füllen des Schülerarrays mithilfe verschachtelter Schleifen
        for (int klasse = 0; klasse < schuelerArray.length; klasse++)
        {
            for (int name = 0; name < schuelerArray[klasse].length; name++)
            {
                schuelerArray[klasse][name] = "Unbekannt" + klasse + name;
            }
        }
        // Schnelle Ausgabe:
        System.out.println(Arrays.deepToString(schuelerArray));


        // Alle Arrays direkt in einem Schritt instanziieren
        String[][][] schulenArray = new String[][][]{
                // Zwei Schulen
                new String[][]  // Schule 1 - 3 Klassen
                        {
                                new String[10], // Schule 1 - Klasse 1 - 10Schüler
                                new String[20], // Schule 1 - Klasse 2 - 20 Schüler
                                new String[12]  // Schule 1 - Klasse 3 - 12 Schüler
                        },

                new String[][]  // Schule 2 - 4 Klassen
                        {
                                new String[11], // Schule 2 - Klasse 1 - 11 Schüler
                                new String[21], // Schule 2 - Klasse 2 - 21 Schüler
                                new String[13], // Schule 2 - Klasse 3 - 13 Schüler
                                new String[23]  // Schule 2 - Klasse 4 - 23 Schüler
                        }
        };

        String[][][] schuelenArray2 = new String[2][][];    // Anzahl der SChulen

        // Schule 1 hat 3 Klassen:
        schuelenArray2[0] = new String[3][];

        // Schule 1, Klasse 1, hat 10 Schüler:
        schuelenArray2[0][0] = new String[10];

        // und so weiter für jede Stelle im Array,
        // am besten mit einer Schleife statt von Hand

        // Füllen von SchulenArray
        for (int schule = 0; schule < schulenArray.length; schule++)
        {
            for (int klasse = 0; klasse < schulenArray[schule].length; klasse++)
            {
                for (int schueler = 0; schueler < schulenArray[schule][klasse].length; schueler++)
                {
                    schulenArray[schule][klasse][schueler] =
                            String.format("Schüler/in %s %s %s", schule + 1, klasse + 1, schueler + 1);
                }
            }
        }

        // Ausgabe aller Einträger mit foreach
        for (String[][] schule : schulenArray)
        {                     // Jedes 2D-Array 'schule' im 3D-Array
            for (String[] klasse : schule)
            {                         // Jedes 1D-Array 'klasse' im 2D-Array 'schule'
                for (String schueler : klasse)
                {                     // Jeder Schüler im 1D-Array 'klasse'
                    System.out.println(schueler);
                }
            }
        }
        System.out.println("In der Schule 1 , Klasse 3, heißt die Person 8 : " + schulenArray[0][2][7]);


    }
}
