package Aggregationen;

public class Aggregationen
{
    public static void main(String[] args)
    {
        // Bei einer Aggregation duerfen die Teile unabhaengig von ihrem ganzen
        // existieren:
        Motor einMotor = new Motor();
        Rad vorrderrad = new Rad();
        Rad hinterrad = new Rad();

        // Das Ganze erschaffen und die Teile hinzufuegen.
        Motorrad harley = new Motorrad(einMotor, vorrderrad, hinterrad);

        // Die selben Teile koennen in verschiedenen Ganzen verbaut werden:
        Motorrad suzuki = new Motorrad(einMotor, vorrderrad, hinterrad);

        // Ein anderes Ganzes mit ganz neuen Teilen:
        Motorrad honda = new Motorrad(new Motor(), new Rad(), new Rad());
        honda = null;
    }
}
