
package poundstokilograms;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 2.4
 *  (Convert pounds into kilograms) Write a program that converts pounds into
 *   kilograms. One pound is 0.454 kilogram.
 * @author adrianfoster
 * 04/25/2020
 */
public class PoundsToKilograms {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Enter a number in pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble(); //Enter a number in pounds
        
        double kilograms = pounds * 0.454;
        // Display pounds into kilograms
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        
        
    }
    
}
