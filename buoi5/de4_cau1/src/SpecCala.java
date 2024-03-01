/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala( String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+" # "+color; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void setData(){
        char[] a = getOwner().toLowerCase().toCharArray();
        //cho ki tu dau tien viet hoa
        a[0] = Character.toUpperCase(a[0]);
        //duyet mang, neu trc do la dau ' ' thi viet hoa
        for (int i = 1; i < a.length; i++) {
            if(a[i-1]==' ') a[i] = Character.toUpperCase(a[i]);
        }
        
//        String str = new String(a);
        setOwner(new String(a));
    }
    
    public int getValue(){
        return color%2==0? (getPrice()+1): (getPrice()*2);
    }
}
