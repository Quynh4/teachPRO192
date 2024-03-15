/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class Truck {
    private String name;
    private int weight;

    public Truck() {
    }

    public Truck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        String s = "";
        s += name.charAt(2);
        s += name.charAt(1);
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int w) {
        this.weight = w + name.length();
    }
    
}
