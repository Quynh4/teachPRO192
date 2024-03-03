public class Box {
    private String code;
    private double price;

    public Box(String code, double price) {
        this.code = code;
        this.price = price;
    }
    public Box(){
        
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }  
}
