public class Fan {
    
    private double price;
    private String code;

    public Fan() {
    }

    public Fan( String code, double price) {
        this.price = price;
        this.code = code;
    }

    

    public double getPrice() {
        return price;
    } 

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code + " " + price;
    }
    
}
