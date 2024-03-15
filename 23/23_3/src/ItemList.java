
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class ItemList extends ArrayList<Item>{
    public void addItem(Item item){
        add(item);
    }
    public void printItemByQuantity(int value){
        for (Item i : this) {
            if(i.getQuantiy()==value)
                System.out.println(i);
        }
    }
    
    public int getTotalQuantity(){
        int cnt=0;
        for (Item i : this) {
            cnt += i.getQuantiy();
        }
        return cnt;
    }
}
