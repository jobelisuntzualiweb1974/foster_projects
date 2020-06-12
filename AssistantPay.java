
package assistantpay;

 import java.util.Scanner;
/**
 * Sue wants a program that will calculate and display the amount that she should
 * pay her assistant each week in her store. Her assistant is paid 30% of the 
 * total sales for the week minus half of the rent charge.
 *@author adrianfoster
 * 04/22/2020
 */
public class AssistantPay {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
            //Display Weekly Rent
            System.out.print("Enter Rent for the week: $");
            //Weekly rent
            double weeklyRent = input.nextDouble();
            
            //Display Weekly Total Sales
            System.out.print("Enter Total Weekly Sales: $");
            //Weekly Total Sales
            double weeklyTotalSales = input.nextDouble();
            
            double assistantPay = ((weeklyTotalSales - (weeklyRent / 2)) * .30);
            System.out.println("Weekly Assistant Pay: $" + ((int)(assistantPay * 100) /100.0));
            
        
    }
    
}
