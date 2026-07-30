package Aufgaben.Aufgabe072b;

public class Aufgabe072b
{
    static void main() throws InterruptedException
    {
        PKW auto1 = new PKW(16);
        auto1.tankfüllstandBeobachter = new Fahrer();

        auto1.fahren();

    }
}
