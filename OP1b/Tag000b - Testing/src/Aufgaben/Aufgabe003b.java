package Aufgaben;

public class Aufgabe003b
{
    static void main()
    {
        AufgabeKlasse003b erstesObject = new AufgabeKlasse003b();
        AufgabeKlasse003b zweitesObject = new AufgabeKlasse003b();

        System.out.println(erstesObject.getAlter());
        System.out.println(zweitesObject.getAlter());

        erstesObject.setAlter(7);

        zweitesObject.setAlter(19);

        System.out.println(erstesObject.getAlter());
        System.out.println(zweitesObject.getAlter());

    }
}
