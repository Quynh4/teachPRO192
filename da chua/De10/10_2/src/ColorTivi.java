
public class ColorTivi extends Tivi{
    private int serie;

    public ColorTivi() {
    }

    public ColorTivi( String type, int serie, double price) {
        super(type, price);
        this.serie = serie;
    }

    @Override
    public String toString() {
        return super.getType() +" " + serie + " "+ super.getPrice();
    }
    
    @Override
    public double getPrice(){
        if(serie>3000) return super.getPrice()*0.9;
        else return super.getPrice();
    }
    
}
