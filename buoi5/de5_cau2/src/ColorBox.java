/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class ColorBox extends Box{
    private int color;

    public ColorBox() {
    }

    public ColorBox( String code, double price, int color) {
        super(code, price);
        this.color = color;
    }
    public double getNewPrice(){
        return getPrice()*(1+ (color>100?0.1:0));
    }

    @Override
    public String toString() {
        return super.toString() +"  "+ color; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
