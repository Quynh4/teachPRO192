/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Order {
    private String orderId;
    private String date;
    private String name;
    private String address;
    private ArrayList<Product> products;
    private String customerID;

    public Order() {
    }

    public Order(String orderId, String date, String name, String address, ArrayList<Product> products, String customerID) {
        this.orderId = orderId;
        this.date = date;
        this.name = name;
        this.address = address;
        this.products = products;
        this.customerID = customerID;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    
    
}
