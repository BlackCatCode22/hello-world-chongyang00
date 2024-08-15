// This is a comment
/*
 * Chong Yang
 * 8/15/24
 * LargestOfThree.java
 *
 */

import java.util.Scanner;  // Import the Scanner class

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the Largest Of Three Program!\n\n");

        int firstNum = 0;
        int secNum = 0;
        int thirdNum = 0;
        int LargestOfThree = 0;

        System.out.println("\n The value of the LargestOfThree is: " + LargestOfThree);

        // Create a Scanner Object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();


        // Ask user for the second int
        System.out.println("\n Please enter a second whole number: ");
        secNum = myScannerObject.nextInt();

        // Ask user for the third int
        System.out.println("\n Please enter a third whole number: ");
        thirdNum = myScannerObject.nextInt();

        // Processing:
        // Compare the inputs with nested if statements

        if (firstNum > secNum) {
            if (firstNum > thirdNum) {
                LargestOfThree = firstNum;
            } else {
                LargestOfThree = thirdNum;
            }
        }
        else {
            if (secNum > thirdNum) {
                LargestOfThree = secNum;
            }
            else {
                LargestOfThree = thirdNum;
            }
        }

        //Output largest of three
        System.out.println("\n The value of the LargestOfThree is: " + LargestOfThree);


    }
}