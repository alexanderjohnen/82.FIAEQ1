package assoziationen.template;

public class Produkt
{
    private final int id;
    private double preis;
    private String bezeichnung;

    public int getId()
    {
        return id;
    }

    public double getPreis()
    {
        return preis;
    }

    public void setPreis(double preis)
    {
        this.preis = preis;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }

    public Produkt(int id, double preis, String bezeichnung)
    {
        this.id = id;
        this.preis = preis;
        this.bezeichnung = bezeichnung;
    }
}
