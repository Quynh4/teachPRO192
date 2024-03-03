
public class VNMotor extends Motor {
    private String series;

    public VNMotor() {
    }

    public VNMotor(String series) {
        this.series = series;
    }

    public VNMotor( String brandName, String series, double price) {
        super(brandName, price);
        this.series = series;
    }


    
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    

    public double getSalePrice() {
        double discount = super.getPrice() < 3000 ? 0.05 : 0.1;
        return super.getPrice()*(1 - discount);
    }
    
    @Override
    public String toString() {
        return getBrandName() + " " + getSeries() + " " + getPrice();
    }
}
