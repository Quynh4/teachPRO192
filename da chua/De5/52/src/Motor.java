public class Motor {
    private String brandName;
    private double price;

    public Motor() {
    }

    public Motor(String brandName, double price) {
        this.brandName = brandName;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public double getPrice() {
        return price;
    }    
    public String toString() {
        return getBrandName() + " " + getPrice();
    }
}
