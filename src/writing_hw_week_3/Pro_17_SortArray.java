package writing_hw_week_3;

import java.util.Arrays;
// Write a Java program to sort a numeric array and a string array.

public class Pro_17_SortArray {
    public static void main(String[] args) {
        // Numeric Array declaration
        int[] numAarray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //String Array declaration
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numAarray));
        //Sorting the array
        Arrays.sort(numAarray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numAarray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));

    }
}


