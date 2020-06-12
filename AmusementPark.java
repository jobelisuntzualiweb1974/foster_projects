package amusement_park_programming_project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class AmusementPark {
    private final ArrayList<Ticket> tickets = new ArrayList<>();
    private final ArrayList<Merchandise> merchandise = new ArrayList<>();
    private final String name;
   
    public AmusementPark(String name){
        this.name = name;
    }
   
    public String getName(){
        return name;
    }
  
    public ArrayList<Date> getTicketDates(){
        ArrayList<Date> dates=new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        
        tickets.stream().filter((ticket) -> (ticket.getPurchaseStatus())).forEach((ticket) -> {
            try {
                dates.add(dateFormat.parse(ticket.getDate()));
            } catch (ParseException ex) {
            }
        });
        return dates;
    }
    
  
    public int getTickets(Date date) {
        int count = 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        count = tickets.stream().filter((ticket) -> (ticket.getDate().equals(dateFormat.format(date)))).map((_item) -> 1).reduce(count, Integer::sum);
        return count;
    }
  
    public Ticket getTicket(long id) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumber()==id) {
                return ticket;
            }
        }
        return null;
    }
    
 
    public ArrayList<Merchandise> getMerchandise(){
            return merchandise;
   }
    
 
    public ArrayList<Merchandise> getMerchandise(String category){
        ArrayList<Merchandise> result=new ArrayList<> ();
        merchandise.stream().filter((item) -> (item.getCategory().compareTo(category)==0)).forEach((item) -> {
            result.add(item);
        });
        return result;
    }        
    
 
    public Merchandise getMerchandise(long id){
        for (Merchandise item: merchandise) {
            if (item.getId()==id) {
                return item;
            }
        }
        return null;
    }   
  
    public void addTicket(Ticket newTicket){
        tickets.add(newTicket);
    }
    
    public void addMerchandise(Merchandise newMerchandise){
        merchandise.add(newMerchandise);        
    }
    
    public void buyMerchandise(String id){
         Merchandise item=getMerchandise(Long.parseLong(id));
         if(item==null)
             throw new IllegalArgumentException();
        boolean remove = merchandise.remove(id);         
     }
    
     public void buyTicket(String id){
         Ticket item=getTicket(Long.parseLong(id));
         if(item==null)
             throw new IllegalArgumentException();
         tickets.remove(item);         
     }
}
