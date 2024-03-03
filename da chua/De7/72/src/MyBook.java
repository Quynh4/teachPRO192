import java.util.*;
//Your task is to complete this class 
public class MyBook implements IBook {    

    @Override
    public String f1(ArrayList<Book> a) {
        return  a.get(0).getName();
    }

    @Override
    public int f2(ArrayList<Book> a, int price) {
        int cnt=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPrice()> price)
                cnt++;
        }
        return cnt;
    }
    
}
