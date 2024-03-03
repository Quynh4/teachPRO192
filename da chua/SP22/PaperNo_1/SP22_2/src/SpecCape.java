
public class SpecCape extends Cape{
    private int type;

    public SpecCape() {
        super(null, 0);
    }

    public SpecCape(String tailor, int color, int type) {
        super(tailor, color);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
    return super.getTailor() + ", " + super.getColor()+ ", " + this.type;
    }

    public void setData( ){
        String s = getTailor();
        super.setTailor(s.substring(0,s.length()-2)+"XYZ");
    }
    
    public int getValue(){
       return Character.isDigit(getTailor().charAt(0))? 
               getColor()+11: 
               getColor()+4;
    }
    
}
