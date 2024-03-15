
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setDiscount(int d) {
        if(d<0)  this.discount = 0;
        else this.discount = d;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        double subTotal = quantity*price*(100-discount)/100;
        return id+","+name+","+df.format(price).replace(",", ".")+","+quantity+","+String.format("%.2f", subTotal).replace(",", "."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
