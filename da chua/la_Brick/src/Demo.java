
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Quynh
 */
public class Demo {
    public static void main(String[] args) {
        List<Brick> tc1 = new ArrayList<>();
        tc1.add(new Brick("1AB", 5));
        tc1.add(new Brick("B2", 4));
        tc1.add(new Brick("CT", 3));
        tc1.add(new Brick("DX1", 4));
        tc1.add(new Brick("2E", 5));
        tc1.add(new Brick("F4", 2));
    
        List<Brick> tc2= new ArrayList<>();
        tc2.add(new Brick("A", 4));
        tc2.add(new Brick("C", 5));
        tc2.add(new Brick("B", 7));
        tc2.add(new Brick("D", 3));
        tc2.add(new Brick("E", 7));
        tc2.add(new Brick("F", 8));
        
        List<Brick> tc3 = new ArrayList<>();
        tc3.add(new Brick("A", 8));
        tc3.add(new Brick("D", 7));
        tc3.add(new Brick("E", 6));
        tc3.add(new Brick("B", 9));
        tc3.add(new Brick("E", 1));
        tc3.add(new Brick("F", 2));
        tc3.add(new Brick("G", 9));
        tc3.add(new Brick("H", 3));
    
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Add how many elements: ");
        String st = sc.nextLine(); int n = Integer.parseInt(st);
        System.out.print("Enter TC: ");
        String st1 = sc.nextLine(); int tc = Integer.parseInt(st1);
        //------------------------------------------
        
        MyBrick b = new MyBrick();
        
        if (tc == 1){
            while (n-- > 0){
            String place = sc.nextLine();
            String x = sc.nextLine(); int price = Integer.parseInt(x);
            tc1.add(new Brick(place, price));
        }
            System.out.println("The list before running:");
            print(tc1);
            System.out.println("\nOUTPUT:");
            System.out.println(b.f1(tc1));
        }
        else if (tc==2) {
            while (n-- > 0){
            String place = sc.nextLine();
            String x = sc.nextLine(); int price = Integer.parseInt(x);
            tc2.add(new Brick(place, price));
        }
            System.out.println("The list before running:");
            print(tc2);
            b.f2(tc2);
            System.out.println("\nOUTPUT:");
            print(tc2);
        }
        else if (tc == 3){
            while (n-- > 0){
            String place = sc.nextLine();
            String x = sc.nextLine(); int price = Integer.parseInt(x);
            tc3.add(new Brick(place, price));
        }
            System.out.println("The list before running:");
            print(tc3);
            b.f3(tc3);
            System.out.println("\nOUTPUT:");
            print(tc3);
        }
        
    }
    
    public static void print(List<Brick> lst){
        for (Brick brick : lst){
            System.out.print("("+brick.getPlace() + "," + brick.getPrice()+")");
        }
    }
}
