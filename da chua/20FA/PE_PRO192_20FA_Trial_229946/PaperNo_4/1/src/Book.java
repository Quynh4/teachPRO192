
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin's
 */
public class Book {
    String title;
    int price;
    public static void Book(String[] arg){
        Scanner TC = new Scanner (System.in);
        int tc = TC.nextInt();
        System.out.println("Enter TC(1 or 2): " + tc);
        if(tc==1) {
        Scanner Title = new Scanner(System.in);
        String title = Title.nextLine();
        System.out.println("Enter title: " + title);
        }
        else {
        Scanner Price = new Scanner (System.in);
        int price = Price.nextInt();
        System.out.println("Enter price:" + price);
        }
        
    }
    
}


