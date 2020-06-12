
package computechange;

import java.util.Scanner;

/**
 * Chapter 2 Case Study 2.17
 * Counting Monetary Units
 * @author adrianfoster
 */
public class ComputeChange {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter amount as a decimal
        System.out.print("Enter amount of money: ");
        double amount = input.nextDouble();
        
        //
        int remainingAmount = (int)(amount * 100);
        
        //Find the number of dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        //Find the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        //Find the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        //Find number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        //Find the number of pennies
        int numberOfPennies = remainingAmount;
        
        //Display results
        System.out.println("Your amount of " + amount + " consists of: ");
        System.out.println(" " + numberOfOneDollars + " one dollar bills");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
        
    }
    
}
