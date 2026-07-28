package Aufgaben.Aufgabe072b;

public class Aufgabe072b
{
    static void main()
    {
        PKW auto1 = new PKW(25);
        Fahrer fahrer1 = new Fahrer();

        auto1.tankfüllstandBeobachter = fahrer1;

        auto1.fahren();

    }
}
