
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyString implements  IString{

    @Override
    public int f1(String str) {
        int sum=0;
        for(char c: str.toCharArray()){
            if(Character.isDigit(c) && (c-'0')%2 != 0)
                sum += c-'0';
        }
        return sum;
    }

    @Override
    public String f2(String s) {
    String[] word = s.split("\\s+");
        String longestWord = word[0];
        int index =0;
        for (int i=1; i< word.length; i++) {
            if (word[i].length() > longestWord.length()) {
                longestWord = word[i];
                index = i;
            }  
        }
    List<String> list = new ArrayList<>(Arrays.asList(word));
    list.add(word[index]);
    list.remove(index);
    return String.join(" ", list);
    }

    
}
