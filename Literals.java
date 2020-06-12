/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package literals;

import java.util.Scanner;
/**
 *
 * @author adrianfoster
 */
public class Literals {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Integer Literals
        System.out.println(0B1111);
        System.out.println(2345_4545_4519_3415L);
        System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);  

        //Order of Operations
        double a = 2;
        double b = 4;
        double c = 1;
        double d = 3;
        double r = 5;
        System.out.println((4 / (3 * (r + 34))) - (9 * (a + (b * c))) + (3 + d * (2 + a)) / (a + (b * d)));
       
        
    }
    
}
