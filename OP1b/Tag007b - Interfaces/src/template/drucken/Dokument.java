package template.drucken;

public class Dokument implements Druckbar
{
    protected String text;

    public Dokument(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    @Override
    public void drucken()
    {
        System.out.println("Druckgergeräusche piep piep... Verbindungsfehler zum Drucker. Bitte Tonerkartusche prüfen. Konnte Dokument " + text + " nicht drucken.");
    }
}
