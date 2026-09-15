/*
 * ADAPTER (Strukturmuster)
 * ------------------------------
 * Erklärung:
 * Macht zwei inkompatible Schnittstellen kompatibel,
 * indem er zwischen ihnen "übersetzt".
 *
 * Analogie: Ein Reiseadapter für die Steckdose – zwei Systeme
 * (dein Ladegerät, die Steckdose im Ausland) passen nicht zusammen,
 * der Adapter vermittelt dazwischen.
 */

interface Steckdose {
    void europaeischerStecker();
}

class USALadegeraet {
    void amerikanischerStecker() {
        System.out.println("lädt (US-Stecker)");
    }
}

class SteckdosenAdapter implements Steckdose {
    private USALadegeraet geraet;

    SteckdosenAdapter(USALadegeraet geraet) {
        this.geraet = geraet;
    }

    public void europaeischerStecker() {
        geraet.amerikanischerStecker(); // übersetzt den Aufruf
    }
}

/*
 * CODEERKLÄRUNG:
 * USALadegeraet passt nicht in eine Steckdose-Schnittstelle.
 * Der SteckdosenAdapter implementiert Steckdose und leitet den Aufruf
 * intern an das US-Gerät weiter.
 */

public class Adapter {
    public static void main(String[] args) {
        USALadegeraet geraet = new USALadegeraet();
        Steckdose adapter = new SteckdosenAdapter(geraet);

        adapter.europaeischerStecker(); // lädt (US-Stecker)
    }
}
