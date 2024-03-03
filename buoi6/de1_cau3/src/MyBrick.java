
import java.util.List;

public class MyBrick implements IBrick {

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if ((Character.isDigit(t.get(i).place.charAt(0)))
              &&(Character.isLetter(t.get(i).place.charAt(t.get(i).place.length() - 1)))) {
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
            if(t.get(i).price % 2 != 0 && t.get(i).price > max){
                max = t.get(i).price;
                index = i;
            }
        }
        if(index == -1) return;
        t.get(index).place = "XX";
    }

    @Override
    public void f3(List<Brick> t) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).price > max){
                max = t.get(i).price;
                index = i;
            }
        }
        for (int i = 0; i < index ; i++) {
            for (int j = i+1; j < index; j++) {
                if(t.get(i).price > t.get(j).price){
                    Brick tmp = t.get(i);
                    t.set(i,t.get(j));
                    t.set(j,tmp);
                }
            }
        }
    }
}
