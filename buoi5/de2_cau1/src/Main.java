import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      double xPrice2 = 0.0D;
      System.out.println();
      System.out.print("Enter code: ");
      String xCode = sc.nextLine();
      System.out.print("Enter price: ");
      double xPrice = sc.nextDouble();
      sc.nextLine();
      System.out.println("1. Test getCode()");
      System.out.println("2. Test setPrice()");
      System.out.print("Enter TC (1 or 2): ");
      int tc = sc.nextInt();
      sc.nextLine();
      Fan t = new Fan(xCode, xPrice);
      if (tc == 2) {
         System.out.print("Enter new price: ");
         xPrice2 = sc.nextDouble();
         sc.nextLine();
         t.setPrice(xPrice2);
      }

      System.out.println("OUTPUT:");
      switch(tc) {
      case 1:
         String u = t.getCode();
         System.out.printf("%s\r\n", u);
         break;
      case 2:
         double v = t.getPrice();
         System.out.printf("%.1f\r\n", v);
         break;
      default:
         return;
      }

      System.out.println();
   }
}