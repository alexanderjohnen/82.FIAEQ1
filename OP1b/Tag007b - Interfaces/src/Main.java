import template.drucken.*;
import template.fläche.Dreieck;
import template.fläche.HatFlaeche;
import template.fläche.Rechteck;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    static void main()
    {
        Dokument dokument = new Dokument("Redacted");
        dokument.drucken();

        Druckbar.testDruck();

        PDFDruckbar pdfDruckbar = new PDFDokument("Hallo Welt! (in einem PDF Dokument)");

        pdfDruckbar.drucken();          // geht: kommt über Druckbar
        pdfDruckbar.pdfDrucken();       // geht: ist in PDFDruckbar deklariert

        // pdfDruckbar.mailVersenden(); // geht NICHT !!!!!!

        ((PDFDokument) pdfDruckbar).mailVersenden(); // Möglichkeit 1 um mailVersenden nutzen zu können

        Mailbar mailbar = (Mailbar) pdfDruckbar; // Möglichkeit 2 um mailVersenden nutzen zu können
        mailbar.mailVersenden();

        System.out.println("____________________");
        List<Druckbar> liste = new ArrayList<>();

        liste.add(dokument);
        liste.add(pdfDruckbar);
        liste.add((PDFDokument) mailbar);

        for(Druckbar d : liste)
        {
            d.drucken();
        }


        HatFlaeche rechteck = new Rechteck(6,7);

        System.out.printf("Die Fläche unseres Rechtecks ist %.2f.", ((Rechteck) rechteck).berechneFlaeche());

        System.out.println();

        Dreieck dreieck = new Dreieck(6,7);

        System.out.printf("Die Fläche unseres Dreiecks ist %.2f.", dreieck.berechneFlaeche());
    }
}
