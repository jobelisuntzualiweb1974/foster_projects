
package volume.of.cylinder;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 2.2
 *    (Compute the volume of a cylinder) Write a program that reads in the 
 *     radius and length of a cylinder and computes the area and volume using 
 *     the following formulas:
 *          area = radius * radius * PI
 *          volume = area * length
 * @author adrianfoster
 */
public class VolumeOfCylinder {
    public static void main(String[] args) {
        final double PI = 3.14159; //Declare a constant
        
        Scanner input = new Scanner(System.in);
        
         //Prompt user to enter a radius
        System.out.print("Enter the radius and the length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        //Compute area and volume
        double area = radius * radius * PI; //Compute area
        double volume = area * length;
        
        //Display result
        System.out.println("The area of a cylinder is ");
        System.out.println("The volume of a cylinder is: ");
       
   
    } 
    
}
