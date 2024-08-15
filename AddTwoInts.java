// This is a comment
/*
* Chong Yang
* 8/15/24
* AddTwoInts.java
*
 */

import java.util.Scanner;  // Import the Scanner class

public class AddTwoInts {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the Double Int Program!\n\n");

        int firstNum = 0;
        int secNum = 0;
        int sumOfBothNumbers = 0;

        System.out.println("\n The value of sumOfBothNumbers is: " + sumOfBothNumbers);

        // Create a Scanner Object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Unit test for our first user input
        System.out.println("\n The value of firstNum is: " + firstNum);

        // Ask user for the second int
        System.out.println("\n Please enter a second whole number: ");
        secNum = myScannerObject.nextInt();

        // Unit test for our second user input
        System.out.println("\n The value of secNumb is: " + secNum);

        // Processing
        // Add the two ints input from the user.
        // the total of firstNum and secondNum will be stored
        // in the variable named: sumOfBothNumbers

        sumOfBothNumbers = firstNum + secNum;

        // Output the value of the variable named: setOfBothNumbers
        System.out.println("\n The value of sumOfBothNumbers is: " + sumOfBothNumbers);

    }
}