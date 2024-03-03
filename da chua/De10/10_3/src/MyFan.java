
import java.util.ArrayList;
import java.util.List;

public class MyFan implements IFan{

    @Override
    public void f1(List<Fan> a, String code) {
        int n = a.size();
        for (int i=n-1; i>=0; i--){
            if (a.get(i).getCode().equals(""))
                a.remove(i);
        }
    }

    @Override
    public int f2(List<Fan> a, double price) {
        int cnt=0;
        for (int i=0; i<a.size(); i++){
            if (a.get(i).getPrice()<= price)
                cnt++;
        }
        return cnt;
    }

    @Override
public void f3(List<Fan> a, double price) {
    ArrayList<Fan> x = new ArrayList<>();
    for (int i=0; i<a.size(); i++){
        if (a.get(i).getPrice() >= price) // changed >= to >
            x.add(a.get(i));
    }
    for (int i=0; i<a.size(); i++){
        if (a.get(i).getPrice() < price) // changed < to <=
            x.add(a.get(i));
    }
    a.clear();
    a.addAll(x);
}
}
