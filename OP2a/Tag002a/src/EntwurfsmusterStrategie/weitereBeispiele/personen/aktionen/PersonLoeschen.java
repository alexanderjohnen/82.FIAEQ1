package EntwurfsmusterStrategie.weitereBeispiele.personen.aktionen;

import EntwurfsmusterStrategie.weitereBeispiele.personen.Person;
import EntwurfsmusterStrategie.weitereBeispiele.personen.Personenverwaltung;

public class PersonLoeschen implements Aktion{
    @Override
    public void fuehreAktionAus(Personenverwaltung pv, Person p) {
        pv.getPersonenList().remove(p);
    }
}
