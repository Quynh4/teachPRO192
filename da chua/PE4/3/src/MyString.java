
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int cnt=0;
        String[] string = str.split("\\s+");
        for (String s: string){
            for (char c: s.toCharArray()){
                if (Character.isDigit(c) && (c-'0')%2==0){
                         cnt++;
                         break;
                    }
            }
        }
    return cnt;
    }

    public String f2(String str) {
    String[] words = str.split("\\s+");
    for (int i = 0; i < words.length; i++) {
        if (check(words[i])) {
            words[i] = "YY";
        }
    }
    return String.join(" ", words);
}

public boolean check(String s){
        String chuoiDao = new StringBuilder(s).reverse().toString();
        if (chuoiDao.equalsIgnoreCase(s)) return  true;
        return false;
    }
}