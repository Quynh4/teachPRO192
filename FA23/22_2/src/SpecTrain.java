

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class SpecTrain extends Train{
    private int load;

    public SpecTrain() {
    }

    public SpecTrain(String name, String type, int load) {
        super(name, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return getName()+","+load+","+getType(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void setData(){
        String new_name = getName().substring(1);
        setName(new_name);
    }
    
    public int getValue(){
        if(countDigit(getType())==1) return load*getName().length();
        else return load;
    }
    
    public int countDigit(String s){
        int cnt=0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if(Character.isDigit(c)) cnt++;
        }
        return cnt;
    }
}
