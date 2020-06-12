
package salestax;
    
import java.util.Scanner;
/**
 * Computing Sales Tax
 * @author adrianfoster
 */
public class SalesTax {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    
        
        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);
        
        double d = 5;
        int i = (int)d;
        System.out.println("d is " + d);
        System.out.println("i is " + i);
        
        float f = 12.5F;
        int n = (int)f;
        System.out.println("f is " + f);
        System.out.println("i is " + n);
        
        
    }
    
    
}
