/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augmented_assignment_operators;

import java.util.Scanner;

/**
 *
 * @author adrianfoster
 */
public class Augmented_Assignment_Operators {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        double a = 6.5;
        a += a + 1;
        
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
        
        
        int i = 3, j = 3;
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);
        
        int c = 6;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        int c1 = 6;
        int d1 = ++c1;
        System.out.println(c1);
        System.out.println(d1);
        // TODO code application logic here
    }
    
}
