
package convertfeetintometers;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 2.3
 *  (Convert feet to meters) Write a program that reads a number in feet, converts
 *  it to meters, and displays the result. One foot is 0.305 meter.
 * @author adrianfoster
 */
public class ConvertFeetIntoMeters {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        // Enter a value for feet
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
       
        
        double meters =  feet * 0.305; //Find meters
        System.out.println(feet + " feet is " + meters + " meters");
    
    }
    
}
