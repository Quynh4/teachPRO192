/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author DELL
 */
public class Inputter {
public static Scanner sc = new Scanner(System.in);
    
    public static int inputInt(String msg, int min, int max){
        if(min > max){
            int t=min; min=max; max=t;
        }
        int data;
        do{
            System.out.print(msg);
            data = Integer.parseInt(sc.nextLine());
        }
        while (data < min || data > max);
        return data;
    }
    
    public static String inputStr(String msg){
        System.out.print(msg);
        String data = sc.nextLine().trim();
        return data;
    }
    
    public static String inputNonBlankStr(String msg){
        String data;
        do{
            System.out.print(msg);
            data = sc.nextLine().trim();
        }
        while (data.length()==0);
        return data;
    }
    
    public static String inputPattern(String msg,String pattern){
        String data;
        do{
            System.out.print(msg);
            data = sc.nextLine().trim();
        }
        while(!data.matches(pattern));
        return data;
    }
}
