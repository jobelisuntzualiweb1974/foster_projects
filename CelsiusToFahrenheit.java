
package celsius.to.fahrenheit;

import java.util.Scanner;
/**
 * Converting Celsius temperature to Fahrenheit temperature
 * @author adrianfoster
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        
       System.out.println("Enter a degree in Celsius: ");//Enter celsius
       double celsius = input.nextDouble();
        
       //Convert Celsius to Fahrenheit
       double fahrenheit = (9.0 / 5) * celsius + 32;
       System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
       
       //Convert Fahrenheit to Celsius  
       System.out.println("\n\nEnter a degree in Fahrenheit: ");//Enter fahrenheit
       double fahrenheit2 = input.nextDouble();
        
       //Convert Fahrenheit to Celsius 
       double celsius2 = (5.0 / 9) * (fahrenheit - 32);
       System.out.println(fahrenheit2 + " degrees Fahrenheit is " + celsius2 + " degrees Celsius.");
    }
    
}
