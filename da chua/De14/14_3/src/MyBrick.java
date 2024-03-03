
import java.util.List;


public class MyBrick implements IBrick{

    @Override
    public void f1(List<Brick> list) {
        double max = Double.MIN_VALUE;
        int pos=-1;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getPrice()> max){
                max = list.get(i).getPrice();
                pos = i;
            }
            list.get(i).setPrice(list.get(i).getPrice()*1.1);
        }
        list.get(pos).setPrice(list.get(pos).getPrice()/1.1);
    }

    @Override
    public int f2(List<Brick> list, double d) {
        int cnt=0;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getPrice() <= d){
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public void f3(List<Brick> list){
        double max = Double.MIN_VALUE;
        double maxx = Double.MIN_VALUE;
        int posx = -1, pos = -1;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getPrice()> max){
                max = list.get(i).getPrice();
                pos = i;
            }
        }
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getPrice()> maxx && list.get(i).getPrice()<max){
                maxx = list.get(i).getPrice();
                posx = i;
            }
        }
       
        list.remove(posx);
    }
    
}
