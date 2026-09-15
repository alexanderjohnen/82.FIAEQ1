package EntwurfsmusterStrategie.template.sortieren;

// Kontext
public class Sortierer
{
	// Die Kontext-Klasse hat ein Attribut vom Typ des Interfaces. Dadurch ist der Kontext unabhängig von den konkreten Strategien.
	private Sortieralgorithmus algorithmus;

	public Sortierer(Sortieralgorithmus algorithmus)
	{
		this.algorithmus = algorithmus;
	}

	public Sortieralgorithmus getAlgorithmus()
	{
		return algorithmus;
	}

	public void setAlgorithmus(Sortieralgorithmus algorithmus)
	{
		this.algorithmus = algorithmus;
	}

	public void sortiere(int[] zahlen)
	{
		algorithmus.sortiere(zahlen);
	}
}
