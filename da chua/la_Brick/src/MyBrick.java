
import java.util.List;

public class MyBrick implements IBrick {

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if ((Character.isDigit(t.get(i).getPlace().charAt(0)))
              &&(Character.isLetter(t.get(i).getPlace().charAt(t.get(i).getPlace().length() - 1)))) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public void f2(List<Brick> t) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getPrice() % 2 != 0
              && t.get(i).getPrice() > max){
                max = t.get(i).getPrice();
                index = i;
            }
        }
        if(index == -1) return;
        t.get(index).setPlace("XX");
    }

    @Override
    public void f3(List<Brick> t) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getPrice() > max){
                max = t.get(i).getPrice();
                index = i;
            }
        }
        for (int i = 0; i < index-1 ; i++) {
            for (int j = i+1; j < index; j++) {
                if(t.get(i).getPrice() > t.get(j).getPrice()){
                    Brick tmp = t.get(i);
                    t.set(i,t.get(j));
                    t.set(j,tmp);
                }
            }
        }
    }
}
