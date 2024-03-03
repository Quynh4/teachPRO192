
import java.util.ArrayList;
public class MyCake implements ICake
{

    @Override
    public String getHighestPrice(ArrayList<Cake> a) {
        double maxPrice = Double.MIN_VALUE;
        int pos = -1;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPrice() + a.get(i).getItax() >maxPrice) {
                maxPrice = a.get(i).getPrice() + a.get(i).getItax() ;
                pos = i;
            }
        }
        return a.get(pos).getName();
    }

    @Override
    public int count(ArrayList<Cake> a) {
        double tax = a.get(0).getItax();
        int cnt=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getItax()<tax) {
                cnt++;
            }
        }
        return cnt;
    }

}
