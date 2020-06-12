/*
 * Show simple area calculation
 */
package area;

import java.util.Scanner;

/**
 * Computing the area of a circle
 * @author adrianfoster
 */
public class Area {
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter a radius
        System.out.println("Enter a number for the radius: ");
        double radius = input.nextDouble();
        
        //Compute area
        double area = radius * radius * PI; //Compute area
        
        System.out.println("The area for a circle with a radius of " + radius + " is " + area);
    }
    
}
