/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setValue(int len) {
        length = (len > 0) ? 1 : 0;
        width = (len > 0) ? 1 : 0;
    }

//    public void setValue(int den) {
//        length = (len > 0) ? 1 : 0;
//        width = (wi > 0) ? wi : 0;
//    }

    @Override
    public String toString() {
        return length + "@" + width;
    }
    

}
