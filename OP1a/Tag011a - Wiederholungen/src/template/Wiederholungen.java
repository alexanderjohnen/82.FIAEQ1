package template;

public class Wiederholungen
{
    static void main(String[] args)
    {
        int zahl1 = 10;
        int zahl2 = 20;

        System.out.println("Der Wert der Variable zahl1 lautet: "+ zahl1 + " und zahl2: " + zahl2 + "." );
        System.out.println();

        String s = String.format("Der Wert der Variable zahl1 lautet : %s und zahl2 lautet: %s <- String.format()", zahl1,zahl2);
        System.out.println(s);


        System.out.printf("Der Wert der Variable zahl1 lautet : %s und zahl2 lautet: %s.", zahl1,zahl2);
        System.out.println();

        StringBuilder builder = new StringBuilder();
        builder.append("Der Wert der Variable zahl1 lautet: ");
        builder.append(zahl1);
        builder.append(" und zahl2: ").append(zahl2).append(" <- mit Stringbuilder");

        System.out.println(builder);  // früher builder.toString()


        // Primitiven Datentypen
        float float32 = 3.5F;
        double double64 = 50.5;
        int int32 = 3;
        char character = 'c';
        boolean bool = true;   // True oder False
        long long64 = 4L;
        short short16 = 2;
        byte b8 = 1;

        float f = 1.0F;
        f = (float)2.0;
        long l = 10_000_000_000L;


        // Casten

        int integer = 1234567890;
        long integerInLong = integer;
        // short integerInShort = integer; // Fehler!
        short integerInShort = (short)integer;
        System.out.println(integerInShort);

        // Verzweigungen

        int zahl = 10;
        if(zahl>20){
            System.out.println("Die zahl ist größer als 20");
        } else if (zahl<20) {
            System.out.println("Die Zahl ist kleiner als 20");
        }else{
            System.out.println("Die Zahl ist genau 20");
        }

        String zustand = "gefroren";

        if(zustand.equals("gefroren")){
            System.out.println("Eis ist da");
        }else {
            System.out.println("Wasser ist da");
        }


        // der Ternäre Operator ist     (Bedingung)    ?   true  :  false
        //                                             ?         :
        System.out.println((zustand.equals("gefroren")) ? "Eis ist da." : "Wasser ist da.");

        zahl2 = 42;
        String ergebnis = (zahl2 % 10 == 0) ? "Restlos durch 10 teilbar." : (zahl2 % 2 ==0) ?
                                                                            "Nicht restlos durch 10 teilbar, aber durch 2." : "Weder restlos durch 10 noch durczh 2 teilbar.";
        System.out.println(ergebnis);


        // Switch-Case

        int meineZahl = 1;

        switch(meineZahl){

            case 0:
                System.out.println("Meine Zahl ist 0.");
                break;
            case 1:
                System.out.println("Meine Zahl ist 1.");
                break;
            case 2:
                System.out.println("Meine Zahl ist 2.");
                break;
            default:
                System.out.println("Meine Zahl entspricht nicht der Vorgabe");
        }

        String farbe= "gruen";
        switch(farbe){
            case "rot":
                System.out.println("Ich enthalte die Farbe rot");
                break;
            case "gruen":
                System.out.println("Ich bin die Farbe grün");
            case "blau":
                System.out.println("Ich enhalte die Farbe blau");
            case "gelb":
                System.out.println("Ich enthalte die Farbe gelb");
                break;
        }

        // For und Foreach Schleifen

        for(int i = 0 ; i<7 ; i++){
            System.out.println("Meine aktuelle runde ist " + (i+1));
        }
        //   0 1 2 3 4 5 6 7 8 9
        //    1 2 3 4 5 6 7 8 9 10
        int[] intArray = new int[100];
        for(int i =0 ; i< intArray.length; i++){
            intArray[i] = i*2;
        }

        System.out.println("Erstes Element im Array: " + intArray[0]);

        for(int zahlImArray : intArray){
            System.out.println(zahlImArray + " ");
        }


        // While und do While

        int i = 0;
        while(i<10){
            System.out.println("WHILE -Schleife läuft....");
            System.out.println(i);
            i++;
        }
        System.out.println();

        i=0;
        do{
            System.out.println("DO-WHILE- Schleife läuft...");
            System.out.println(i);
            i++;
        }while(i<10);


        // Break und Continue;
        for(int j = 0; j< intArray.length; j++){
            if(intArray[j] == 10){
                System.out.println("Gefunden and Index " + j + "!");
                break;
            }
        }
        System.out.println();

        int n = 0 ;
        while(n<10){
            n++;
            if(n==5){
                System.out.println("Überspringen! ");
                continue;
            }
            System.out.print(n + " ");
        }
    }
}
