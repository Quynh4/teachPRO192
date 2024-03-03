
public class ColorBox extends Box {
    private int color;

    public ColorBox() {
    }

    public ColorBox( String code, double price,int color) {
        super(code, price);
        this.color = color;
    }
    
    public double getNewPrice(){
        if(this.color > 100) return super.getPrice()*1.1;
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.color;
    }
    
    
    
    
}
