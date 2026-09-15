package Assoziationen.LockereAssoziationen;

public class Mensch
{
   public void streichleKatze(Katze katze)
   {
       // Der Mensch kennt die Katze ueber einen Methodenparameter.
       // Das bedeutet der Mensch kann zur Katze navigieren und alle
       // nicht-privaten Methoden der Katze konsumieren.
       katze.schmusen();
   }
}

class Katze
{
    public void schmusen()
    {
        System.out.println("Ich mag so gerne gestreichelt und beschmust werden. Miau!");
    }
}
