
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Map -- HashMap
// tao: 40    nho: 100    ca chua: 10
// key (k trung) - value (trung)
        HashMap<String, Integer> h = new HashMap<>();
//    list -- add
// [] {}
        h.put("tao", 40);
        h.put("b", 100);
        h.put("ca chua", 10);
//        System.out.println(h.get("tao"));
//        h.remove("taoo");
//        System.out.println(h.containsKey("b"));
//        System.out.println(h.containsValue(90));

        h.clear();
//        System.out.println(h.size());
        System.out.println(h.isEmpty());


    }

}
