package writing_hw_week_3;
// Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Pro_6_OddEven {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Pro_6_OddEven oddEven = new Pro_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        // Closing the scanner object
        scanner.close();
    }

    // Checking the odd or even
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
