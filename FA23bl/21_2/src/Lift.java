/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class Lift {
    private String label;
    private int type;

    public Lift() {
    }
    public Lift(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public int getType() {
        return type;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label+","+type ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
 
}
