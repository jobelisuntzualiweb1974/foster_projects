package amusement_park_programming_project;

public class Merchandise {
    private final long id;
    private final String category,description;
    private double price;
    private  boolean inStock;

    
    public Merchandise(long id, String category, String description, double price, boolean inStock) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

   
    public String getCategory() {
        return category;
    }

   
    public String getDescription() {
        return description;
    }

   
    public long getId() {
        return id;
    }

  
    public boolean getInStock() {
        return inStock;
    }

   
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "id: " + id + ", category:" + category + 
                ", description: " + description + ", price:" + 
                price + ", inStock=" + inStock ;
    }
    
    
    
}

