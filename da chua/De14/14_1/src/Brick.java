
public class Brick {
    private double price;
    private String code;

    public Brick() {
    }

    public Brick(String code, double price) {
        this.price = price;
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
