//Chong Yang 8/20/24
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
    public static void main(String[] args) {
        System.out.println("\n\n...Welcome to the Payroll Program!...\n");

        //variables
        String userName = "";
        int hoursWorked = 0;
        double hrlyPayRate = 0.0;
        int overtimeHours = 0;
        double weeklyPayWoOverTime = 0.0;
        int payRate = 0;
        double overTimePay = 0;

        // Say hello to the user and get user pay information
        // Get the user's name
        // Create a Scanner object to get input from the user
        Scanner myScannerObj = new Scanner(System.in);

        // Get the user's name
        System.out.println("\n Please enter your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello, " + userName + ". I hope you are doing well.");

        // Get weekly hours work from the user
        // Output statement
        System.out.println("\n How many hours did you work this week? \n (please enter whole number): ");

        //use the Scanner object to get input from this prompt, and store what was returned
        //from your Scanner object in a variable
        hoursWorked = myScannerObj.nextInt();

        //create an output statement to the used echoing the user's input
        System.out.println("\n You have worked: " + hoursWorked + " hours this week");

        System.out.println("\n What is your hourly payrate? ");

        hrlyPayRate = myScannerObj.nextDouble();

        System.out.println("\n Your hourly pay rate is: $" + hrlyPayRate );

        //processing
        overtimeHours = hoursWorked - 40;
        if (hoursWorked > 40 ){
            overTimePay = overtimeHours * payRate * 1.5;
        }
        else {
            overTimePay = 0;
        }

        //calculate weekly regular pay
        if (hoursWorked <= 40) {
            weeklyPayWoOverTime = hrlyPayRate * hoursWorked - 40;
        }





    }
}