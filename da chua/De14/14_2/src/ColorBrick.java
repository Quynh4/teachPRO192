
public class ColorBrick extends Brick{
    private String maker;

    public ColorBrick() {
    }

    public ColorBrick(String code, String maker,double price) {
        super(code, price);
        this.maker = maker;
    }

    @Override
    public String toString() {
        return getCode() + " " + maker + " " + super.getPrice();
    }

    @Override
    public double getPrice() {
        if (maker.startsWith("[ij]")) return super.getPrice()*1.1;
        else return super.getPrice();
    }
    
}
