/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class House {
    private String type;
    private int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        String s="";
        char [] a = type.toCharArray();
        s += a[a.length-1];
        s += a[a.length-2];
        s += a[a.length-3];
        return s;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int new_area) {
        this.area = 3*new_area;
    }
    
}
