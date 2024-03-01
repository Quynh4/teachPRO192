  import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println();
      System.out.print("Enter title: ");
      String xTitle = sc.nextLine();
      System.out.print("Enter price: ");
      int xPrice = sc.nextInt();
      sc.nextLine();
      System.out.println("1. Test getTitle()");
      System.out.println("2. Test setPrice()");
      System.out.print("Enter TC (1 or 2): ");
      int tc = sc.nextInt();
      sc.nextLine();
      Book t = new Book(xTitle, xPrice);
      if (tc == 2) {
         System.out.print("Enter new price: ");
         int xPrice2 = sc.nextInt();
         sc.nextLine();
         t.setPrice(xPrice2);
      }

      System.out.println("OUTPUT:");
      switch(tc) {
      case 1:
         String u = t.getTitle();
         System.out.printf("%s\r\n", u);
         break;
      case 2:
         int v = t.getPrice();
         System.out.printf("%d\r\n", v);
         break;
      default:
         return;
      }

      System.out.println();
   }
}
    