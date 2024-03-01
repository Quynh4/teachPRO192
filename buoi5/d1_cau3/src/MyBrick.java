
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> l) {
        int count=0;
        for (int i = 0; i < l.size(); i++) {
            int len = l.get(i).getPlace().length();
            if(Character.isDigit(l.get(i).getPlace().charAt(0))
            && Character.isLetter(l.get(i).getPlace().charAt(len-1)) )
                count++;
        }
        return count;
    }

    @Override
    public void f2(List<Brick> var1) {
        
    }

    @Override
    public void f3(List<Brick> var1) {
    }
    
}
