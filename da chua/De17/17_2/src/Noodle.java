
public class Noodle {
    private double price;
    private String name;

    public Noodle(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setCode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+ " " + price;
    }
    
}
