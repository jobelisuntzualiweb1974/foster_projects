/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display.time;

import java.util.Scanner;
/**
 *
 * @author adrianfoster
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Enter seconds
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60; //Find minutes in seconds
        int remainingSeconds = seconds % 60; //Seconds remaining
        System.out.println(seconds + " seconds is " +  minutes  + " minutes " + remainingSeconds + " seconds");
    }
    
}
