package writing_hw_week_3;

// Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Pro_2_LeapYear {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the Year : ");
        int year = scanner.nextInt();
        Pro_2_LeapYear leapYear = new Pro_2_LeapYear();
        leapYear.isItLeapyear (year);
        // closing the scanner object
        scanner.close();

    }
    //Checking is it leap yeat or not
    public void isItLeapyear(int year) {
        if (year % 4 == 0 && year % 100  !=0 || year % 400 == 0) {
            System.out.println("The year " + year + "is leap year " );
            return;
        }
        System.out.println("The Year " + year + " is not a leap year");
    }

}
