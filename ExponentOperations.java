/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponent.operations;

import java.util.Scanner;
/**
 *
 * @author adrianfoster
 */
public class ExponentOperations {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        
        System.out.println(Math.pow(2, 3)); // Raise to the second power
        System.out.println(56 % 6); //Result will have a remainder of 2
        System.out.println(25 / 4F); //Result will be a floating number
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
        System.out.print(Math.pow(2, 3.5));
        
        
        System.out.print("\n\nEnter a number for m: ");
        int m = input.nextInt();
        System.out.println("Enter a number for r: ");
        int r = input.nextInt();
        
        System.out.println(Math.pow(r, 2) * m);
    }
    
}
