package amusement_park_programming_project;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Ticket {
    private final long number;
    private final String  category, holder;
    private final Date date;
    private double price;
    private boolean status;

 
    public Ticket(long number, String category, String holder, Date date, double price, boolean status) {
        this.number = number;
        this.category = category;
        this.holder = holder;
        this.date = date;
        this.price = price;
        this.status = status;
    }
 
    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(date);
    }

   
    public String getHolder() {
        return holder;
    }

   
    public long getNumber() {
        return number;
    }

    
    public double getPrice() {
        return price;
    }

  
    public boolean getPurchaseStatus() {
        return status;
    }


   
    public void setPrice(double price) {
        this.price = price;
    }

  
    public void setPurchaseStatus(boolean status) {
        this.status = status;
    }

  
    public String getCategory() {
        return category;
    }

    
    @Override
    public String toString() {
        return " number: " + number + 
                ", category: "  + category + 
                ", holder: " + holder + 
                ", date:" + getDate() +
                ", price:" + price + 
                ", status:" + status ;
    }   
    
    
}
