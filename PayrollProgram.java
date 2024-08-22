//Chong Yang 8/20/24 and 8/22/24
/*
* PayrollProgram.java
*
* Input: User's name, weekly hours worked (no fractions), user's hourly payrate
*
* Processing: total weekly pay including overtime if more than 40
*   hours were worked that week
*
* Output: Polite greeting to the user and regular pay and overtime pay
*
*
*
 */

import java.util.Scanner;

public class PayrollProgram {

    static void theHelloMethod(){
        System.out.println("\n Hello from theHelloMethod() !");
    }

    // Create a method that gets input
    //this is the method's definition
    static void aPersonalGreeting(String someName) {
        System.out.println("\n Hello " + someName + " how are you today?");
    }
    // create a method that gets two integers and returns their sum
    // create two int parameters
    static int sumTwoInts(int num1, int num2){
        int mySum = 0;
        mySum = num1 + num2;

        return mySum;
    }


    public static void main(String[] args) {
//        System.out.println("\n\n...Welcome to the Payroll Program!...\n");

        System.out.println("\n Welcome to the Methods!\n");

        // variables (members)
        String theUsername = "";

        // create a scaner object for user input
        Scanner scanner = new Scanner (System.in);

        // Get users name
        System.out.println("\n Please enter your name: ");
        theUsername = scanner.nextLine();



        // call (invoke) our greeting method
        aPersonalGreeting(theUsername);




        theHelloMethod();

        // variable
        int aSum = 0;

        //call our new sum method
        aSum= sumTwoInts(3,4);

        System.out.println("\n aSum is :" + aSum);

        System.out.println("\n This is the end of my program.");

//        //variables
//        String userName = "";
//        int hoursWorked = 0;
//        int overtimeHours = 0;
//        double hrlyPayRate = 0.0;
//        double overTimePay = 0.0;
//        double regularPay =0.0;
//
//        // Say hello to the user and get user pay information
//        // Get the user's name
//        // Create a Scanner object to get input from the user
//        Scanner myScannerObj = new Scanner(System.in);
//
//        // Get the user's name
//        System.out.println("\n Please enter your name: ");
//        userName = myScannerObj.nextLine();
//
//        System.out.println("\n Hello, " + userName + ". I hope you are doing well.");
//
//        // Get weekly hours work from the user
//        // Output statement
//        System.out.println("\n How many hours did you work this week? \n (please enter whole number): ");
//
//        //use the Scanner object to get input from this prompt, and store what was returned
//        //from your Scanner object in a variable
//        hoursWorked = myScannerObj.nextInt();
//
//        //create an output statement to the used echoing the user's input
//        System.out.println("\n You have worked: " + hoursWorked + " hours this week");
//
//        System.out.println("\n What is your hourly payrate? ");
//
//        hrlyPayRate = myScannerObj.nextDouble();
//
//        //processing
//        if (hoursWorked > 40){
//            overtimeHours = hoursWorked - 40;
//            overTimePay = overtimeHours + 40 * hrlyPayRate * 1.5;
//
//            System.out.println("\n Your overtime pay is: $" + overTimePay );
//        }
//        else {
//            regularPay = hoursWorked * hrlyPayRate;
//            System.out.println("\n Your regular pay is: $ " + regularPay);
//        }

    }
}