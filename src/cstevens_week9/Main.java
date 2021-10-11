package cstevens_week9;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 9 Assignment
 * @Date: July 18, 2021
 * @Description: Classes & Objects
 */

//Imports
import java.util.Scanner;

//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {

        //Create an object of the Scanner
        Scanner sc = new Scanner(System.in);

        //Declarations
        String again;           //used to run again
        double prev;            //previous reading
        double curr;            //current reading

        System.out.print("\nWelcome to the City Power Bill Calculator!");

        //Begin DO WHILE loop to re-run the calculator
        do {

            System.out.print("\nPlease enter your previous meter reading: ");

            //Take user input for previous meter reading
            prev = sc.nextDouble();

            System.out.print("Please enter your current meter reading: ");

            //Take user input for current meter reading
            curr = sc.nextDouble();
            sc.nextLine();

            //Instantiate subclass MyUtility
            MyUtility myBill = new MyUtility(prev, curr);

            //Report usage
            System.out.printf("\nYour usage was: %.1f KwHs\n",
                    myBill.getUsage());

            //Report rate
            System.out.printf("Your rate was: $%.4f/KwH\n", myBill.getRate());

            //Subtotal
            System.out.printf("Your subtotal is: $%.2f\n",
                    myBill.getSubtotal());

            //Taxes
            System.out.printf("Taxes are: $%.2f\n",
                    myBill.getTaxes());

            //Total
            System.out.printf("Your total bill this month is: $%.2f\n",
                    myBill.getTotal());

            //Ask user if they want to calculate again
            System.out.print("\nWould you like to calculate a new usage?\n"
                    + "(Y for Yes, N to exit): ");

            //Take input for continue selection
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("Y"));

        System.out.print("\nThank you for using this program! "
                + "Goodbye!\n\n");

    } //End Main Method
}
