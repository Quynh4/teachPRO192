
public class SpecBrick extends Brick{
    
    public int color;

    public SpecBrick() {
    }

    public SpecBrick(String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return place + ", " + price + ", " +  color ;
    }
    
    public void setData(){   
        place = place.substring(0,2) + "BCA" + place.substring(2);
    }
    
    public int getValue(){
        if(color > 7 ) return price + 9;
        return price + 6;
    }

}
