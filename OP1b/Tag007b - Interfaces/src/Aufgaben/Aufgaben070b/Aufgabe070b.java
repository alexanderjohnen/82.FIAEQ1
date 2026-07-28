package Aufgaben.Aufgaben070b;

public class Aufgabe070b
{
    /* Level 1
     * Zwei Interfaces:
     * "IGitarrenspieler" mit der void Methode "gitarreSpielen"
     * "ISänger" mit der void Methode "singen"
     * Eine Klasse:
     * "Musiker", implementiert IGitarrenspieler und ISänger.
     * Die implementierten Methoden sollen etwas in der Konsole ausgeben.
     * Im Main einen Musiker erzeugen und die implementierten Methoden aufrufen.
     * Erstellen Sie ein UML Klassendiagramm.
     */

    static void main()
    {
        Musiker musiker = new Musiker();
        musiker.gitarreSpielen();
        musiker.singen();
    }
}
