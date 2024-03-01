/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class VNCar extends Car{
    private int series;

    public VNCar() {
    }

    public VNCar(String name, double price, int series) {
        super(name, price);
        this.series = series;
    }
    
    public double getSalePrice(){
        double inc = series<300? 0.1 : 0;
        return getPrice() + inc*getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + "  " + series;
    }
    
    
}
