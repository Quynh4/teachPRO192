
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCape implements ICape{

    @Override
    public int f1(List<Cape> t) {
        double avr=0; int cnt=0;
        for (Cape cape : t) {
            avr += (double)cape.getColor();
        }
        avr /= t.size();
        
        for (Cape cape : t) {
            if(cape.getColor() > avr) cnt++;
        }
        return cnt;
    }

    @Override
    public void f2(List<Cape> t) {
        double avr=0, cnt=0;
        for (Cape cape : t) {
            avr += (double)cape.getColor();
        }
        avr /= t.size();
        
        for (int i = 0; i < t.size(); i++) {
            Cape get = t.get(i);
            if(get.getColor()> avr){
                t.remove(get);
                break;
            }
        }
    }

    @Override
    public void f3(List<Cape> t) {   
        Collections.sort(t,Comparator.comparing(Cape::getLast).reversed());
    }
    
}
