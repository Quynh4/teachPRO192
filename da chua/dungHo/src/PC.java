
public class PC {
    private String model;
    private double price;
    private double rate;

    public PC() {
    }

    public PC(String model, double price, double rate) {
        this.model = model;
        this.price = price;
        this.rate = rate;
    }

    public PC(String model) {
        this.model = model;
    }

    public String getModel() {
        return model.substring(0,2).toUpperCase() + model.substring(2).toLowerCase();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "("+model+","+rate+","+price+")";
    }
}
