
package calculatetips;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 2.5 
 *  (Financial application: calculate tips) Write a program that reads the subtotal
 *   and the gratuity rate, then computes the gratuity and total. 
 * @author adrianfoster
 * 04/25/2020
 */
public class CalculateTips {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Enter subtotal and gratuity
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = subtotal * (gratuityRate / 100.0);
        double total = subtotal + gratuity; //Total
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + ((int)(total * 100) / 100.0));
        
     
    }
    
}
