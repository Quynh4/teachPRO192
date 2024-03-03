
import java.util.Scanner;

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


