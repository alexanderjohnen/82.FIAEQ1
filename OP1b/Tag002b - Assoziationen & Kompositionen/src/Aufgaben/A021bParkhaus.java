package Aufgaben;

import java.util.ArrayList;

public class A021bParkhaus
{
    private final int idph;
    public ArrayList<A021bEtage> etagenListe = new ArrayList<>();

    public A021bParkhaus(int idph)
    {
        this.idph = idph;
    }

    private class A021bEtage
    {
        private final int idet;
        public ArrayList<A021bParkplatz> parkplatzListe = new ArrayList<>();

        private A021bEtage(int idet)
        {
            this.idet = idet;
        }

        private class A021bParkplatz
        {
            private final int idpp;
            private boolean status = false;

            private A021bParkplatz(int idpp, boolean status)
            {
                this.idpp = idpp;
                this.status = status;
            }
        }
    }

}
