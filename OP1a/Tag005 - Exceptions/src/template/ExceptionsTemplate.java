package template;

/*Try-Catch-Finally: Exceptions und Ausnahmebehandlung

    ERLÄUTERUNG:
    Immer dann, wenn in einem (Java)-Programm etwas Unzulässiges geschieht, stürzt das Programm ab.
    Das kann Folge eines Programmierfehlers sein
    (der dann natürlich behoben werden kann und der "hoffentlich" bereits im Testlauf auffiel) ...
    ... es kann aber auch "externe" Gründe geben
    (unzulässige User-Eingaben, Werte, die aus einer Datenbank/einem Textfile gelesen werden ...)

    Solche externen Fehler können wir zwar nicht ausschließen, aber wenigstens "abfangen"(catch)
    => Programm stürzt nicht ab, sondern wir bestimmen, "wie es weitergeht"
    (Eigene Fehlermeldung, erneute Input-Abfrage ...))

    https://www.baeldung.com/java-common-exceptions
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExceptionsTemplate
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Eine erste Fehler-Provokation:
        //Integer.parseInt("Eins");
        // -> Fehlermeldung zur Laufzeit -> java.lang.NumberFormatException: For input string: "Eins"
        //System.out.println("Eine wichtige Konsolenausgabe"); // Diese Ausgabe erscheint nicht, da das Programm vorher abgestürzt ist.


        // Um möglicherweise auftretende Exceptions abzufangen und Abstürze des Programms zu vermeiden, verpacken wir den Code in eine Try-Catch-Klausel.
        try
        {
            System.out.println("Versuche Parsen...");
            int ergebnis = Integer.parseInt("Eins"); // Hier wird die Exception geworfen und der Programmfluss springt in den Catch-Block.
            System.out.println("Ergebnis: " + ergebnis); // Dieser Code wird nicht mehr ausgeführt, da die Exception bereits aufgetreten ist.
        }
        catch (NumberFormatException ex) // Wir fangen hier eine eventuell auftretende NumberFormatException und erstellen davon eine Variable mit dem Bezeichner "ex".
        {
            System.out.println("Fehler! " + ex.getMessage()); // Mit getMessage() können wir die Fehlermeldung der Exception abfragen.
        }
        // HINWEIS: Im obigen Fall wird nur die NumberFormatException gefangen.
        // Würde eine andere Exception auftreten, würde das Programm trotzdem abstürzen.
        // Lösung: Weitere Catch-Blöcke.
        catch (IllegalArgumentException ex)
        {
            System.err.println("Illegal Argument Exception! " + ex.getMessage());
        }
        catch (Exception ex) // Jede andere Exception fangen. Wichtig: Allgemeine Exceptions müssen nach den speziellen Exceptions aufgelistet werden.
        {
            System.err.println("Es ist eine allgemeine Exception aufgetreten! " + ex.getMessage());
        }
        // Optionaler Finally-Block: Wird immer ausgeführt, auch wenn keine Exception auftritt.
        finally
        {
            // Finally: Der Code im Finally wird immer ausgeführt, selbst wenn wir eine Return-Anweisung haben oder keine Exception aufgetreten ist.
            // Der Finally-Block wird häufig für Aufräumarbeiten verwendet, um zum Beispiel Ressourcen wieder freizugeben.
            System.out.println("Hier sind wir im Finally-Block!");
        }

        System.out.println("Hier sind wir nach dem try-catch und unser Programm ist nicht abgestürzt.");


        // Diese ganze Technologie ist derartig komfortabel, dass man sich im Einzelfall versehentlich zu sehr auf sie verlassen könnte.
        // Außerdem ist das Abfangen von Ausnahmen etwas teuer und reduziert die Performance des Programms.
        // Ein Beispiel, das zeigen soll, dass wir dennoch unser Programm "auf Herz und Nieren" testen sollten:
        try
        {
            //double division = (double) zahl / (double) teiler; // Die Integer-Werte werden in Double gecastet.
            //System.out.println("Ergebnis der Division ist: " + division);
            // Bei Double-Divisionen durch 0 wird keine Exception geworfen, sondern das Ergebnis ist "Infinity".

            double wurzel = Math.sqrt(-1);
            System.out.println("Die Quadratwurzel von -1 ist: " + wurzel);
            // Ergebnis: NaN = not a number = keine Zahl.
            // ABER: Keine Exception!
        }
        catch (Exception ex)
        {
            // Mögliche Ausgabe der Fehlermeldung, sollte eine auftreten, über printStackTrace();
            ex.printStackTrace();
        }


        // Beispiel aus der Praxis:
        // Es wurde ein Stream auf eine Datei geöffnet, es kam dabei zu einem Fehler, die Methode soll enden, ABER der Stream soll auch noch geschlossen werden.
        // Das Schließen soll aber auch dann passieren, wenn es nicht zu einem Fehler kam.
        BufferedReader reader = null;
        try
        {
            reader = Files.newBufferedReader(Paths.get("Eine Datei, die nicht existiert.txt"));
            // Die angegebene Datei existiert nicht. Dies verursacht eine NoSuchFileException.
            // Die NoSuchFileException ist eine IOException und wird in unserem Catch-Block gefangen.

            // ... weiterer Code
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            // Finally wird in jedem Fall ausgeführt. Hier schließen wir wieder den BufferedReader.
            System.out.println("Im Finally wird der Reader geschlossen!");
            try
            {
                if (reader != null)
                    reader.close(); // Geöffnete Streams auf Dateien und Datenbanken müssen auch immer wieder geschlossen werden.
            }
            catch (IOException ex) // close() könnte auch eine IOException werfen. Die IOException ist eine "Checked Exception" und muss darum gefangen werden.
            {
                ex.printStackTrace();
            }
        }

        /* Zwei Besonderheiten zu Exceptions in Java:
		Sie werden unterteilt in "Checked Exceptions" und "Unchecked Exceptions".
		Checked Exceptions müssen immer entweder gefangen werden oder die Methode muss die Exception deklarieren.
		Alle Exceptions sind Checked Exceptions mit Ausnahme der Runtime Exceptions, welche unchecked sind.
		IOException ist Checked, IllegalArgument ist eine Runtime Exception und daher unchecked.
		*/

        // Throw...
        // Mit dem Befehl 'throw' haben wir die Möglichkeit, selbst Ausnahmen zu werfen.
        // Dies kann nützlich sein, wenn Klassen geschrieben werden, die auch von anderen Entwicklern verwendet werden sollen.
        // Dabei soll, zum Beispiel, der Programmierer auf falsche Übergabewerte hingewiesen werden.
        try
        {
            myCustomThrowMethod(-1);
        }
        catch (IllegalArgumentException ex)
        {
            ex.printStackTrace();
        }

    } // Hier endet die Main

    /**
     * Macht irgendwas, wirft aber eine IllegalArgumentException, wenn das Argument 0 oder negativ ist.
     *
     * @param a
     * @throws IllegalArgumentException Wird geworfen, wenn a < 1.
     */
    static void myCustomThrowMethod(int a) throws IllegalArgumentException
    {
        if (a < 1)
        {
            throw new IllegalArgumentException("Falscher Übergabewert! Nur positive Zahlen sind gültig!");
        }

        System.out.println(a);
        // ... weiterer Code
    }

    /**
     * Fragt eine Eingabe vom Benutzer ab und konvertiert diese in einen Integer.
     * @return Der konvertierte Integer.
     * @throws NumberFormatException Falls die Eingabe nicht in einen Integer konvertiert werden kann.
     */
    static int eingabeInteger() throws NumberFormatException // Um deutlich zu machen, dass diese Methode eine Exception verursachen könnte, fügen wir ihr in der Deklaration die Exception hinzu. Bei den sogenannten "Checked Exceptions" ist dies Pflicht, bei "Unchecked Exceptions" ist es freiwillig.
    {
        System.out.print("Eingabe: "); // Konsolenausgabe als Aufforderung, eine Zahl einzugeben.
        String eingabe = scanner.nextLine(); // Scanner liest einen String von der Konsole.
        int zahl = Integer.parseInt(eingabe); // Wir konvertieren den String in einen Integer...
        return zahl; // und geben die Zahl zurück.
    }

    /**
     * Fragt eine Eingabe vom Benutzer ab und konvertiert diese in einen Integer.
     * Kann die Eingabe nicht konvertiert werden, muss die Eingabe wiederholt werden.
     * @return Der konvertierte Integer.
     */
    static int eingabeIntegerMitTryCatch()
    {
        while (true)
        {
            System.out.print("Eingabe: ");
            String eingabe = scanner.nextLine();

            try
            {
                int zahl = Integer.parseInt(eingabe); // Kann die Eingabe nicht in einen Integer konvertiert werden, wird eine NumberFormatException geworfen.

                return zahl; // Die konvertierte Eingabe wird zurückgegeben. Damit wird auch die Schleife beendet.
            }
            catch (NumberFormatException ex) // Die Exception fangen wir ab und geben eine Fehlermeldung aus.
            {
                System.out.println("Falsche Eingabe! " + ex.getMessage());
            }
        }
    }
}
