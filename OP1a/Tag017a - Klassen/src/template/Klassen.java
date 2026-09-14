package template;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class Person
{
    private int id;
    private String name;
    private LocalDate geburtsdatum;
    public static ArrayList<Person> personen = new ArrayList<>();

    public Person(int id, String name, LocalDate geburtsdatum)
    {
        this.id = id;
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        personen.add(this);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getGeburtsdatum()
    {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum)
    {
        this.geburtsdatum = geburtsdatum;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getAlter()
    {
        return Period.between(geburtsdatum, LocalDate.now()).getYears();
    }

    public boolean isVollJaehrig()
    {
        return getAlter() >= 18;
    }

    public void ausgabe()
    {
        System.out.printf("ID: %d, Name: %s, Geburtsdatum: %s, Alter: %d, Volljährig: %s", id, name, geburtsdatum, getAlter(), isVollJaehrig());
    }
}

public class Klassen
{
    public static void main(String[] args)
    {
        Person p1 = new Person(1, "Astrid", LocalDate.of(1990, 7, 22));
        Person p2 = new Person(2, "Olaf", LocalDate.of(1992, 6, 7));

        p1.setId(42);

        p2.setName("Marvin");

        System.out.println();
        System.out.println("_______________");

        System.out.println();
        System.out.println("Ausgabe aller Personen der statischen Liste: ");
        for (Person p : Person.personen)
        {
            p.ausgabe();
            System.out.println();
        }
    }
}
