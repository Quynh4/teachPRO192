
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quynh
 */
public class Pet implements ITax{
    private String name;
    private String birthday;
    private ArrayList<Service> list = new ArrayList<>();
    
    public void addService(String name, int price){
        list.add(new Service(name, price));
    }

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
    return name+"-"+getTotalMoney()+"-" + getTax();
    }

    @Override
    public double getTax() {
        return VAT*getTotalMoney();
    }

    @Override
    public double getTotalMoney() {
        double sum=0;
        for (Service service : list) {
            sum+= service.getPrice();
        }
        String[] day = birthday.split("/");
        if (Integer.parseInt(day[0])>=9 && Integer.parseInt(day[0])<=12)
            sum*= 0.95;
        return sum;
    }    
}
