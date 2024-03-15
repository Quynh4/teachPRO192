/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class MyString implements IString {

    @Override
    public int f1(String string) {
        String[] words = string.split("\\s+");
        int cnt = 0;
        for (String word : words) {
            if (Character.isDigit(word.charAt(0))
                    && !Character.isDigit(word.charAt(word.length() - 1))) {
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public String f2(String string) {
        String[] words = string.split("\\s+");
        String s="";
        int cnt=0;
        for (String word : words) {
            if(countDigit(word)==1){
                cnt++;
                if(cnt==2) continue;
            }
            s += word+" ";
        }
        return s;
    }

    public int countDigit(String s) {
        int cnt = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (Character.isDigit(c)) {
                cnt++;
            }
        }
        return cnt;
    }

}
