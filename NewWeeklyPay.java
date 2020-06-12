
package newweeklypay;

import java.util.Scanner;
/**
 * Pat is paid every Friday. He is scheduled to receive either a 2% or a 2.5% 
 * raise next week. He would like a program that will calculate and display the
 * amount of his new weekly pay.
 * @author adrianfoster
 * 04/26/2020
 */
public class NewWeeklyPay {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Displays weekly pay
        System.out.print("Enter weekly pay: $");
        double pay = input.nextDouble();
        
        double raise1 = pay * (2 / 100.0); //2% raise
        double raise2 = pay * (2.5 / 100.0); //2.5% raise
        
        double newWeeklyPay = pay + raise1; //Weekly pay with 2% raise
        double newWeeklyPay2 = pay + raise2; //Weekly pay with 2.5% raise
        
        //Display new weekly pay with raise
        System.out.println("Weekly pay with 2% raise is: $" + ((int)(newWeeklyPay * 100) / 100.0) + "   " + "Weekly pay with 2.5% raise is: $" + ((int)(newWeeklyPay2 * 100) / 100.0));
        
        
    }
    
}
