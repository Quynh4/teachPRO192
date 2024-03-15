
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nofom
 */
public class MyTrain implements ITrain {

    @Override
    public int f1(List<Train> list) {
        int sum = 0;
        for (Train train : list) {
            int cntA = 0, cntB = 0;
            char[] arr = train.getName().toCharArray();
            for (char c : arr) {
                if (c == 'A') {
                    cntA++;
                } else if (c == 'B') {
                    cntB++;
                }
            }
            if (cntA == 1 && cntB != 1) {
                sum += train.getLoad();
            } else if (cntA != 1 && cntB == 1) {
                sum += train.getLoad();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Train> list) {
        //find min
        int min = Integer.MAX_VALUE;
        for (Train train : list) {
            if (train.getLoad() < min) {
                min = train.getLoad();
            }
        }

//        Train t;
//        for (Train train : list) {
//            if(train.getLoad()==min){
//              t = train;
//              list.remove(t);
//              list.add(t);
//              break;
//            }
//        }
        for (Train train : list) {
            if (train.getLoad() == min) {
                list.add(train);
                list.remove(train);

                break;
            }
        }
    }

    @Override
    public void f3(List<Train> list) {
        //find max
        int max = Integer.MIN_VALUE;
        for (Train train : list) {
            if (train.getName().length() > max) {
                max = train.getName().length();
            }
        }
        
        int cnt=0;
        for (Train train : list) {
            if(train.getName().length() == max){
                cnt++;
                if(cnt==2){
                    list.remove(train);
                    break;
                }
            }
        }
    }

}
