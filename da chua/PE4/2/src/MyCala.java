
import java.util.Collections;
import java.util.Comparator;
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
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> t) {
        int cnt =0;
        for (Cala a: t){
            if (a.getPrice() %2 ==0) cnt++;
        }
        return cnt;
    }

    @Override
    public void f2(List<Cala> t) {
        if (t.size() <= 1){}
        else{
            int min_price = t.get(0).getPrice();
            int min_vt = 0;
            for (int i=1; i<t.size(); i++){
                if (t.get(i).getPrice() < min_price){
                    min_price = t.get(i).getPrice();
                    min_vt=i;
                }
            }
            if (min_vt != t.size()-1){
                for (int i=min_vt+1; i<t.size(); i++){
                if (t.get(i).getPrice() == min_price){
                    t.remove(i);
                    break;
                }
            }
            }
            
        }
            
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>(){
            @Override
            public int compare(Cala a, Cala b) {
                if (a.getOwner().charAt(0) == b.getOwner().charAt(0))return 0;
                else if (a.getOwner().charAt(0) > b.getOwner().charAt(0)) return -1;
                else return 1;
            }
        });
    }

    }
