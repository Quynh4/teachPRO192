
import java.util.List;
public class MyBox implements IBox {
    @Override
    public void f1(List<Box> list) {
        for (Box box : list) {
            if (box.getCode().charAt(0) == 'K') {
                box.setPrice(box.getPrice() * 1.1);
            }
        }
    }
    @Override
    public int f2(List<Box> list, double xPrice) {
        int count = 0;
        for (Box box : list) {
            if (box.getPrice() > xPrice) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f3(List<Box> list) {
        double min = list.get(0).getPrice();
        int pos = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getPrice() < min) {
                min = list.get(i).getPrice();
                pos = i;
            }
        }

        if (pos != list.size() - 1) {
            list.remove(pos+1);
        }
    }
}
