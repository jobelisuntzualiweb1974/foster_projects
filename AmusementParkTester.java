package amusement_park_programming_project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class AmusementParkTester {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        AmusementPark parkObj = new AmusementPark("Walden Amusement Park");
        //b. Create a minimum of three Ticket objects and add them to the park        
        try {
            parkObj.addTicket(new Ticket(1, "CHILD", "n/a", dateFormat.parse("08/26/2014"), 25.99, true));
            parkObj.addTicket(new Ticket(2, "ADULT", "n/a", dateFormat.parse("08/27/2014"), 35.99, true));
            parkObj.addTicket(new Ticket(3, "ADULT", "n/a", dateFormat.parse("08/08/2014"), 25.99, true));
            parkObj.addTicket(new Ticket(4, "CHILD", "n/a", dateFormat.parse("08/28/2014"), 35.99, true));
            parkObj.addTicket(new Ticket(5, "CHILD", "n/a", dateFormat.parse("09/01/2014"), 35.99, true));
        } catch (ParseException ex) {
            
        }        
        //Create Apparel objects, 
        parkObj.addMerchandise(new Merchandise(1, "Shirts", "T-Shirt 1", 25.99, true));
        parkObj.addMerchandise(new Merchandise(2, "Shirts", "T-Shirt 2", 20.99, true));
        parkObj.addMerchandise(new Merchandise(3, "Books", "Walden Amusement Park Guide", 15.3, true));
        parkObj.addMerchandise(new Merchandise(4, "Books", "Walden Amusement Park History", 70, true));
        int userChoice;
        do {
            // Display a short menu              
            System.out.println("1 - Get Ticket Info ");            
            System.out.println("2 - Get ticket Dates");
            System.out.println("3 - Get Number of Tickets for Date ");            
            System.out.println("4 - List Merchandises");  
            System.out.println("5 - List Merchandises for Category");  
            System.out.println("6 - Purchase Merchandise");  
            System.out.println("7 - Purchase Ticket");  
            System.out.println("8 - Quit");  
            System.out.print("Enter 1-8: ");  
            userChoice = keyboard.nextInt();
            switch (userChoice) {
                case 1:                    
                    System.out.print("Enter Ticket Id: ");
                    long id = keyboard.nextLong();                    
                    System.out.println(parkObj.getTicket(id));                  
                    break;
                case 2:
                    ArrayList<Date> dates = parkObj.getTicketDates();
                    dates.stream().forEach((date) -> {
                System.out.println(dateFormat.format(date));
            });
                    break;
                case 3:
                    System.out.print("Enter Date(MM/dd/yyyy): ");
                    String tempStr = keyboard.next();
                    try {
                        System.out.println("Number of tickets for date:" + 
                                parkObj.getTickets(dateFormat.parse(tempStr)));
                    } catch (ParseException ex) {                        
                    }
                    break;
                
                case 4:                 
                    ArrayList<Merchandise>  listObj=parkObj.getMerchandise();
                    System.out.println("Merchandises: ");
                    listObj.stream().forEach((item) -> {
                System.out.println(item.toString());
            });                  
                    break;
                case 5:                 
                    System.out.print("Enter Categoty: ");
                    String categoryStr = keyboard.next();
                    listObj=parkObj.getMerchandise(categoryStr);
                    System.out.println("Merchandises: ");
                    listObj.stream().forEach((item) -> {
                System.out.println(item);
            });
                    break;                                        
                case 6:                    
                    System.out.print("Enter Merchandise id: ");
                    String idStr  = keyboard.next(); 
                    try {
                        parkObj.buyMerchandise(idStr);
                        System.out.println("Success!");
                        
                    } catch (NumberFormatException ex) {  
                        System.out.println("Enter valid number");                                                  
                    }
                    catch (IllegalArgumentException ex1) {  
                        System.out.println("Invalid id!");                          
                    }
                    break;
                case 7:                    
                    System.out.println("Enter Ticket id: ");
                    idStr  = keyboard.next(); 
                    try {
                        parkObj.buyTicket(idStr);
                        System.out.println("Success!");
                        
                    } catch (NumberFormatException ex) {  
                        System.out.println("Enter valid number");                                                  
                    }
                    catch (IllegalArgumentException ex1) {  
                        System.out.println("Invalid id!");                          
                    }
                    break;    
            }
        } while (userChoice !=8);
    }
}

