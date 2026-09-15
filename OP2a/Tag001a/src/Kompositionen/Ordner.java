package Kompositionen;

import java.util.ArrayList;
import java.util.List;

public class Ordner
{
    private List<Datei> dateien = new ArrayList<>();

    public void zeigeAlleDateien()
    {
        for(Datei datei : this.dateien)
        {
            System.out.println(datei.getDateiName());
        }
    }

    public void erzeugeNeueDatei(String dateiName)
    {
        dateien.add(new Datei(dateiName));
    }

    public void loescheDatei(String dateiName)
    {
        //  TODO: muss noch implementiert werden
    }

    // Eine Art eine strenge Komposition (also eine bewusste Komposition umzusetzen,
    // ist dieses Muster: Wir verstecken die Teile Klasse als private innere Klasse
    // in der Ganzen-Klasse:
    private class Datei
    {
        private String dateiName;

        public Datei(String dateiName)
        {
            this.dateiName = dateiName;
        }

        public void setDateiName(String dateiName)
        {
            this.dateiName = dateiName;
        }

        public String getDateiName()
        {
            return dateiName;
        }
    }
}
