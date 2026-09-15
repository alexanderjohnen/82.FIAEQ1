public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
}

class Katze
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        // Vorteil Datahiding Principle. Ueber den Setter koennen wir den Input
        // validieren und nur gewuenschte oder gueltige Zustaende zulassen.
        if(name.equals("Horst"))
        {
            throw new IllegalArgumentException("Katzen duerfen nicht Horst heissen!");
        }

        this.name = name;
    }




}