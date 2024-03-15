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
        int count = 0;
        String[] words = string.split("\\s+");
        for (String word : words) {
            if (kt(word)
                    & kituSo(word) >= 3) {
                count++;
            }
        }
        return count;
    }

    public boolean kt(String s) {
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public int kituSo(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String s = "";
        int count = 0;
        char[] arr = string.toCharArray();
        for (char c : arr) {
            if (Character.isDigit(c)
                    & (c - '0') % 2 != 0) {
                if (count == 0) {
                    s += c;
                } else {
                    continue;
                }
                count++;
            } else {
                s += c;
            }
        }
        return s;
    }

}
