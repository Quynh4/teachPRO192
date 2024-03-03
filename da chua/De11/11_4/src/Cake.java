//your job is to complete this class
public class Cake{
    String name;
    double price;
    double itax;

    public Cake() {
    }

    public Cake(String name, double price, double itax) {
        this.name = name;
        this.price = price;
        this.itax = itax;
    }

    public String getName() {
        return name;
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

    public double getItax() {
        return itax;
    }

    public void setItax(double itax) {
        this.itax = itax;
    }
    
}
