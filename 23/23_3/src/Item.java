/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class Item {
    private String name;
    private int quantiy;

    public Item() {
    }

    public Item(String name, int quantiy) {
        this.name = name;
        this.quantiy = quantiy;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public int getQuantiy() {
        return quantiy;
    }

    @Override
    public String toString() {
        return name.toUpperCase() +","+ quantiy; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
