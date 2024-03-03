
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quynh
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala(String owner, int price,int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.getOwner() + " @ " + super.getPrice() + " # " + color ;
    }
    public void setData(){
        char[] a = super.getOwner().toLowerCase().toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        for (int i=1; i<a.length; i++){
            if (a[i-1]==' ') a[i] = Character.toUpperCase(a[i]);
        }
        String str = new String(a);
        super.setOwner(str);
    }
    
    public int getValue(){
        if (color % 2 == 0) return super.getPrice() +1;
        else return super.getPrice()*2;
    }
}

