/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quynh
 */
public class Square extends Rectangle{
    private String unit;

    public Square(int side) {
        this.unit = "cm";
        super.setLength(side);
        super.setWidth(side);
        
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    
    public void setSquare(int side){
        if (side >0 ){
            super.setLength(side);
        super.setWidth(side);
        }
    }
    
    public int getPerimeter(){
        return 4*getWidth();
    }

    public void output() {
        System.out.println("the side of the square="+getWidth()
            +"("+unit+")\nthe perimeter of the square="+getPerimeter()
            +"("+unit+")");;
            }
    
}
