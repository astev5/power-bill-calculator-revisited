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
        
        // create an object of the Scanner
        Scanner sc = new Scanner(System.in);

        // declarations
        String again;           //used to run again
        double prev;            //previous reading
        double curr;            //current reading

        System.out.print("\nWelcome to the City Power Bill Calculator!");

        // begin DO WHILE loop to re-run the calculator
        do {

            System.out.print("\nPlease enter your previous meter reading: ");

            // take user input for previous meter reading
            prev = sc.nextDouble();

            System.out.print("Please enter your current meter reading: ");

            // take user input for current meter reading
            curr = sc.nextDouble();
            sc.nextLine();

            // Instantiate subclass MyUtility
            MyUtility myBill = new MyUtility(prev, curr);

            // report usage
            System.out.printf("\nYour usage was: %.1f KwHs\n",
                    myBill.getUsage());
            
            // report rate
            System.out.printf("Your rate was: $%.4f/KwH\n", myBill.getRate());            
            
            // subtotal
            System.out.printf("Your subtotal is: $%.2f\n", 
                    myBill.getSubtotal());            
            
            // taxes
            System.out.printf("Taxes are: $%.2f\n",
                    myBill.getTaxes());

            // total
            System.out.printf("Your total bill this month is: $%.2f\n",
                    myBill.getTotal());            
            

            // ask user if they want to calculate again
            System.out.print("\nWould you like to calculate a new usage?\n"
                    + "(Y for Yes, N to exit): ");

            // take input for continue selection
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("Y"));

        System.out.print("\nThank you for using this program! "
                    + "Goodbye!\n\n");
    
    } //End Main Method
}
