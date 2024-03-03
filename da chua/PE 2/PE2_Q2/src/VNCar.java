public class VNCar extends Car {
    private int series;

    public VNCar() {
    }

    public VNCar(String name, double price, int series) {
        super(name, price);
        this.series = series;
    }
    
    public double getSalePrice()
    {
        if (series < 300) return super.getPrice() * 1.1;
        return super.getPrice();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\t" + series;
    }
    
}
