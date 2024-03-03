/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thail
 */
public class Car implements Comparable<Car>{
    private String carId;
    private Brand brand;
    private String color;
    private String frameId;
    private String engineId;
    public Car() {
    }
    

    public Car(String id, Brand brand, String color, String frameId, String engineId) {
        this.carId = id;
        this.brand = brand;
        this.color = color;
        this.frameId = frameId;
        this.engineId = engineId;
    }

    // Getters and setters

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    @Override
    public String toString() {
        return carId + ", " +
                brand.getBrandId() + ", " +
                color + ", " +
                frameId + ", " +
                engineId;
    }

    @Override
    public int compareTo(Car o) {
        int d = this.brand.getBrandName().compareTo(o.getBrand().getBrandName());
        if(d!=0) return d;
        return this.carId.compareTo(o.getCarId());
    }
    public String screenString()
    {
        return brand + "\n" +
                carId + ", " +
                color + ", " +
                frameId + ", " +
                engineId;
    }
    
}
