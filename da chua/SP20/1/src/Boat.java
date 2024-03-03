
public class Boat {
    private String name;
    private double price;

    public Boat() {
    }

    public Boat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name.toLowerCase(); // viet thuong name
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
    
    
    
}
