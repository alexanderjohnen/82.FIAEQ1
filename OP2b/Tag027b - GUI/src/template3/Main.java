package template3;

import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib deinen Vornamen ein: ");
        String vornamen = scanner.nextLine();
        System.out.println("Bitte gib deinen Nachnamen ein: ");
        String nachname = scanner.nextLine();
        System.out.println("Bitte gib dein Alter ein: ");
        int alter = Integer.parseInt(scanner.nextLine());

        // boolean popoklatscher = true;
        while (true)
        {
            System.out.print("Bitte gib dein Geschlecht an: ");
            String geschlecht = scanner.nextLine();
            if (geschlecht.equals("männlich") || geschlecht.equals("weiblich"))
                break;
            else
                System.out.println("Oh! Da ist etwas schief gelaufen. Bitte versuche es erneut!");

        }

        while (true)
        {
            System.out.print("Bitte gib dein Pronomen an: ");
            String pronomen = scanner.next();
            if (pronomen.equals("er/ihn") || pronomen.equals("sie/ihr"))
                break;
            else
                System.out.println("Oh! Da ist etwas schief gelaufen. Bitte versuche es erneut!");

        }


    }
}
