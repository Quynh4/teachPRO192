
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyFan implements IFan {

    @Override
    public void f1(List<Fan> list, String string) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().startsWith(string)) {
                list.get(i).setPrice(list.get(i).getPrice()*1.1);
//                list.get(i).price = list.get(i).price + list.get(i).price * (double) 10 / 100;
            }
        }
    }
    @Override
    public int f2(List<Fan> list, double d) {
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= d) {
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public void f3(List<Fan> list) {

        Comparator<Fan> fan = new Comparator<Fan>() {
            @Override
            public int compare(Fan t1, Fan t2) {
                if(t1.price == t2.price){
                    if(t1.code.compareToIgnoreCase(t2.code) > 0)
                        return 1;
                    else if(t1.code.compareToIgnoreCase(t2.code) == 0)
                        return 0;
                    else return -1;
                }
                else if(t1.price < t2.price)
                    return -1;
                else
                    return 1;
            }
        };
        Collections.sort(list, fan);
    }

}
