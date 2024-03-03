
public class ColorNoodle extends Noodle{
    private String maker;

    public ColorNoodle(String name,String maker, double price) {
        super(name, price);
        this.maker = maker;
    }

    

    @Override
    public String toString() {
        return super.getName() + " " + maker + " " + super.getPrice();}

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    
    @Override
    public double getPrice(){
        if (super.getName().charAt(0)=='G' ||super.getName().charAt(0)=='g')
            return super.getPrice()*1.1;
        else return super.getPrice();
    }
    
    
}
