
import java.util.List;


public class MyPrinter implements IPrinter{

    @Override
    public void f1(List<Printer> a, double price) {
        for (int i=0; i<a.size(); i++){
            if (a.get(i).getPrice() <= price) a.remove(i);
        }
    }

    @Override
    public int f2(List<Printer> a, String name) {
        int cnt =0;
        for (Printer x: a){
            if(x.getName().toLowerCase().contains(name.toLowerCase())) cnt++;
        }
        return cnt;
    }
}
