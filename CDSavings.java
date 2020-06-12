
package cdsavings;

import java.util.Scanner;
/**
 * Harry belongs to a CD club. Last year he brought all of his CDs from the club
 * at $8 a CD. He wants to know how much he saved last year by buying the CDs 
 * through the club rather than through a music store that would charge $15 per 
 * CD.
 * @author adrianfoster
 * 04/22/2020
 */
public class CDSavings {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final int clubPrice = 8;
        final int storePrice = 15;
        
        //Enter the number of CDs
        System.out.print("Enter the number of CD's purchase: ");
        int cd = input.nextInt(); //Enter any number of CDs purchased
        //Compute club cost
        double clubCostTotal = cd * clubPrice;
        //Display total club cost
        System.out.println("The cost of the CD's purchased with the club membership: $" + (int)(clubCostTotal * 100.00) / 100);
        //Compute store cost
        double storeCostTotal = cd * storePrice;
        //Display total store price
        System.out.println("The cost of the CD's purchased from the music store: $" + (int)(storeCostTotal * 100.00) / 100);
        
        //Display savings
        double cdSavings = storeCostTotal - clubCostTotal;
        System.out.println("Your savings were: $" + (int)(cdSavings * 100) / 100);
        
    }
    
}
