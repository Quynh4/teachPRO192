
import java.util.ArrayList;
import java.util.List;

public class MyNoodle implements INoodle{
    @Override
    public int f1(List<Noodle> list, double d) {
        int cnt=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<= d) cnt++;
        }
        return cnt;
    }

    @Override
    public void f2(List<Noodle> list) {
        double x = list.get(0).getPrice();
        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i).getPrice() <= x) list.remove(i);
        }
    }

    @Override
    public List<String> f3(List<Noodle> list) {
        List<String> x = new ArrayList<String>();
        for(int i=0; i<list.size(); i++){
            int cnt=0;
            for(int j=0; j<list.size(); j++){
                if(list.get(j).getName().equals(list.get(i).getName()))
                    cnt++;
                if(cnt==2) break;
            }
            if(cnt==1) x.add(list.get(i).getName());
        }
        return x;
    }   
}
