package template.drucken;

public class PDFDokument extends Dokument implements PDFDruckbar, Mailbar
{
    public PDFDokument(String text)
    {
        super(text);
    }

    @Override
    public void pdfDrucken()
    {
        System.out.println("Digitale Druckegeräusche ... das Dokument wird als PDF gedruckt bzw. gespeichert" + text);
    }

    @Override
    public void mailVersenden()
    {
        System.out.println("Digitale Briefgeräusche ... das Dokument wird per Mail versendet: " + text);
    }
}
