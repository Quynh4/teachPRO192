/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class SpecBrick extends Brick {

    private int color;

    public SpecBrick() {
    }

    public SpecBrick(String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return getPlace() + ", " + getPrice() + ", "+ color;
//        return super.toString()+ ", "+ color;
    }
    
    public void setData(){
        super.setPlace(getPlace().substring(0,2)
                + "BCA" + getPlace().substring(2)); 
    }

    public int getValue(){
        if (color>7) return getPrice()+9;
        else return  getPrice()+6;
    }
}
