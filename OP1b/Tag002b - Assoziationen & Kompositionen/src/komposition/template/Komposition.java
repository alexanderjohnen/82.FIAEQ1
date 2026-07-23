package komposition.template;

public class Komposition {
    public static void main(String[] args) {

        Gebaeude schule = new Gebaeude("Schule",1,2,3,4);
        schule.addRaum(5);
        schule.addRaum(6);

        System.out.println("Raumnummern des Gebäudes: ");
        System.out.println(schule.getRaeume());

    }
}
