
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyString implements IString{

    @Override
    public int sum(String string) {
        int sum=0;
        List <Integer> x = new ArrayList<Integer>();
        for(String s: string.split("\\s+")){
            if(s.matches("\\d+")) x.add(Integer.parseInt(s));
        }
        for (int i = 1; i < x.size(); i++) {
            if(x.get(i)<x.get(0)) sum+= x.get(i);
        }
        return sum;
    }

    @Override
    public String getCode(String string) {
    String[] words = string.split("\\s+");
    
    StringBuilder resultBuilder = new StringBuilder();
    for (String word : words) {
        int x=0;
        try {
            float number = Float.parseFloat(word);
            x=1;
        } catch (NumberFormatException e) {
        }
        if(x==1) resultBuilder.append(word).append(" ");
    }
    return resultBuilder.toString().trim();
    }
    
}
