package Aufgaben.Aufgabe072b;

public class Aufgabe072b
{
    static void main()
    {
        PKW auto1 = new PKW(25);
        auto1.tankfüllstandBeobachter = new Fahrer();

        auto1.fahren();

    }
}
