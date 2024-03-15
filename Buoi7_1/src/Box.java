/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class Box extends Rectangle{
    protected int height;

    public Box() {
    }

    public Box(int height, int length, int width) {
        super(length, width);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString()+"@"+ height; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
