
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nofom
 */
public class MyLift implements ILift {

    @Override
    public int f1(List<Lift> t) {
        int max = Integer.MIN_VALUE;

        for (Lift lift : t) {
            int lenght = lift.getLabel().length();
            if (isPrime(lenght)
                    & lift.getLoad() > max) {
                max = lift.getLoad();
            }
        }

        return max;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void f2(List<Lift> t) {
        List<Lift> list = new ArrayList<>();
        for(int i=4; i>=0; i--){
            list.add(t.get(i));
        }
        for(int i=5; i< t.size(); i++){
            list.add(t.get(i));
        }
        t.clear();
        t.addAll(list);
    }

    @Override
    public void f3(List<Lift> t) {
        int count=0;
        for (Lift lift : t) {
            if(lift.getLoad()<20){
                count++;
                if(count==2){
                    t.remove(lift);
                    break;
                }
            }
        }
    }

}
