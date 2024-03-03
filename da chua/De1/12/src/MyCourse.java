import java.util.*;

public class MyCourse implements ICourse {  
    @Override
    public void f1(List<Course> a, int st) {
        if (st==1){
        //sort asc
        Collections.sort(a, new Comparator<Course>(){
            @Override
            public int compare(Course a, Course b) {
                if (a.getFee() > b.getFee()) return 1; //có đổi chỗ thì return 1
                else if (a.getFee() < b.getFee()) return -1;
                else return 0;
            }
        });
        }
        else{
            for(int i = a.size()-1; i>=0; i--){
                if (a.get(i).getFee()<= 120)
                    a.remove(i);
            }
        }
    }
    

    @Override
    public int f2(List<Course> a, double fee) {
        int cnt=0;
        for(Course course: a){
                if (course.getFee()>= fee) cnt++;
            }
        return cnt;
    }
     
}
