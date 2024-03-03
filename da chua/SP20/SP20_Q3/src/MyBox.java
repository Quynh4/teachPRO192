import java.util.List;
public class MyBox implements IBox {

    @Override
    public void f1(List<Box> list) {
        for (Box b : list) {
            if(b.getCode().charAt(0) == 'K')
                b.setPrice(1.1*b.getPrice());
        }
    }
    @Override
    public int f2(List<Box> list, double d) {
        int count = 0;
        for (Box b : list)
            if(b.getPrice() > d)count++;
        return count;
    }

    @Override
    public void f3(List<Box> list) {
        int pos = 0;
        double min = list.get(pos).getPrice();
        for(int i = 1; i < list.size(); i++){
            if(min > list.get(i).getPrice()){
                min = list.get(i).getPrice();
                pos = i;
            }
        }
        if(pos != list.size() -1)
            list.remove(pos+1);
    }
}
