package EntwurfsmusterStrategie.weitereBeispiele.personen.aktionen;

import EntwurfsmusterStrategie.weitereBeispiele.personen.Person;
import EntwurfsmusterStrategie.weitereBeispiele.personen.Personenverwaltung;

public interface Aktion {
    public abstract void fuehreAktionAus(Personenverwaltung pv, Person p);
}


