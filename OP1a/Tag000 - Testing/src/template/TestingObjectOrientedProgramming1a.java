package template;

import java.util.Arrays;

public class TestingObjectOrientedProgramming1a
{
    public static void main(String... args) {
        int[] meinIntArray = {2, 1, 7, 3, 4, 9};
        sortArrayFromIndex(meinIntArray);
        getValues(meinIntArray);
    }

    public static void sortArrayFromIndex(int[] meinArray) {
        Arrays.sort(meinArray, 2, 6);
    }

    public static void getValues(int[] meinArray) {
        for (int elem : meinArray) {
            System.out.print(elem + "\t");
        }
    }
}
