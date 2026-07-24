package Aufgaben;

import java.util.Random;

public class Aufgabe002b
{
    static void main()
    {
//        String[][] album = {{"In The End", "Linkin Park"}, {"Breaking The Habit", "Linkin Park"}, {"Faint", "Linkin Park"}, {"Blackout", "Linkin Park"}, {"Emptiness Machine", "Linkin Park"}};
//
//        for (int i = 0; i < album.length; i++)
//        {
//            for (int j = 0; j < album[i].length; j++)
//            {
//                System.out.println(album[i][j]);
//            }
//        }

//        int[][] numpad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int i = 0; i < numpad.length; i++)
//        {
//            System.out.print(numpad[1][i] + " ");
//        }
//
//        int[][] randomZahl = new int[2][4];
        Random random = new Random();
//
//        for (int i = 0; i < randomZahl.length; i++)
//        {
//            for (int j = 0; j < randomZahl[i].length; j++)
//            {
//                randomZahl[i][j] = random.nextInt(10) + 1;
//            }
//        }
//
//        for (int i = 0; i < randomZahl.length; i++)
//        {
//            System.out.print(randomZahl[i][3] + " ");
//        }

        int[][] getLonger = new int[4][];

        for (int i = 0; i < getLonger.length; i++)
        {
            getLonger[i] = new int[i + 1];
        }

    }
}
