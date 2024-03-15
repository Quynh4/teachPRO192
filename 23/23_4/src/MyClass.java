/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 */
public class MyClass implements IProcess {

    @Override
    public int countWords(String s1, String s2) {
        String[] words = s1.split("\\s+");
        int cnt = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(s2)) {
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public String getLastWord(String str) {
        String[] words = str.split("\\s+");
        String place = words[words.length-1];
        return place.substring(0, 1).toUpperCase()+ place.substring(1, place.length());

    }

}
