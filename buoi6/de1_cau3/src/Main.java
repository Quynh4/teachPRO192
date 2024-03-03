    import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void dispList(List<Brick> t) {
      Iterator var1 = t.iterator();

      while(var1.hasNext()) {
         Brick x = (Brick)var1.next();
         System.out.printf("(%s,%d) ", x.getPlace(), x.getPrice());
      }

      System.out.printf("\r\n");
   }

   public static void addToList(List<Brick> t, String[] a, int[] b) {
      int n = a.length;

      for(int i = 0; i < n; ++i) {
         t.add(new Brick(a[i], b[i]));
      }

   }

   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      List<Brick> t = new ArrayList();
      List<Brick> h = new ArrayList();
      String[] var10000 = new String[]{"A", "D", "C", "B", "E", "F", "G", "H"};
      var10000 = new String[]{"H", "G", "F", "E", "D", "C", "B", "A"};
      int[] var21 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
      var21 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      String[] a1 = new String[]{"1AB", "B2", "CT", "DX1", "2E", "F4"};
      int[] b1 = new int[]{5, 4, 3, 4, 5, 2};
      String[] a2 = new String[]{"A", "C", "B", "D", "E", "F"};
      int[] b2 = new int[]{4, 5, 7, 3, 7, 8};
      String[] a3 = new String[]{"A", "D", "E", "B", "E", "F", "G", "H"};
      int[] b3 = new int[]{8, 7, 6, 9, 1, 2, 9, 3};
      System.out.print("Add how many elements: ");
      int n = sc.nextInt();
      sc.nextLine();
      String xPlace = "";
      int xPrice;

      int tc;
      for(tc = 0; tc < n; ++tc) {
         System.out.print("Enter place: ");
         xPlace = sc.nextLine();
         System.out.print("Enter price: ");
         xPrice = sc.nextInt();
         sc.nextLine();
         h.add(new Brick(xPlace, xPrice));
         t.add(new Brick(xPlace, xPrice));
      }

      System.out.print("Enter TC(1-f1;2-f2;3-f3): ");
      tc = sc.nextInt();
      sc.nextLine();
      IBrick u = new MyBrick();
      switch(tc) {
      case 1:
         addToList(t, a1, b1);
         System.out.println("The list before running f1:");
         dispList(t);
         break;
      case 2:
         addToList(t, a2, b2);
         System.out.println("The list before running f2:");
         dispList(t);
         break;
      case 3:
         addToList(t, a3, b3);
         System.out.println("The list before running f3:");
         dispList(t);
      }

      System.out.printf("OUTPUT:\r\n");
      switch(tc) {
      case 1:
         int count = u.f1(t);
         System.out.printf("%d\r\n", count);
         break;
      case 2:
         u.f2(t);
         dispList(t);
         break;
      case 3:
         u.f3(t);
         dispList(t);
      }

      System.out.println();
   }
}