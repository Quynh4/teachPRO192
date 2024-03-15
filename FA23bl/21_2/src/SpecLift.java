/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class SpecLift extends Lift{
    private int load;

    public SpecLift() {
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return getLabel()+","+load+ "," + getType() ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void setData(){
        String s="";
        char[] arr = getLabel().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0) continue;
            else s += arr[i];
        }
        setLabel(s);
    }
    
    public int getValue(){
        String s = String.valueOf(getType());
        if(!getLabel().contains(s)) return load;
        else return load+getType();
    }
}
