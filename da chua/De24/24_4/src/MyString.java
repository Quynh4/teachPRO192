import java.util.*;

public class MyString implements IString {

    @Override
    public int f1(String str) {
        int cnt=0;
        for(String s: str.toLowerCase().split("\\s+")){
            int countchar=0;
            for(char c: s.toCharArray()){
                if(Character.isLetter(c) && "ueoai".contains(c+"")){
                    countchar++;
                    if(countchar>=2){
                        cnt++;
                        break;
                    }
                }                   
            }
        }
        return cnt;
    }

    @Override
    public String f2(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (charCount.containsKey(ch)) {
                    charCount.put(ch, charCount.get(ch) + 1);
                } else {
                    charCount.put(ch, 1);
                }
            }
        }
    List<Character> duplicateChars = new ArrayList<>();
    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        if (entry.getValue() > 1) {
            duplicateChars.add(entry.getKey());
        }
    }

    if (duplicateChars.isEmpty()) {
        return "NO";
    }

    Collections.sort(duplicateChars, Collections.reverseOrder());

    StringBuilder sb = new StringBuilder();
    for (char ch : duplicateChars) {
        sb.append(ch);
    }

    return sb.toString();
    }
}