   import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println();
      System.out.print("Enter code: ");
      String xCode = sc.nextLine();
      System.out.print("Enter price: ");
      double xPrice = sc.nextDouble();
      sc.nextLine();
      System.out.print("Enter color: ");
      int xColor = sc.nextInt();
      sc.nextLine();
      System.out.println("1. Test toString()");
      System.out.println("2. Test getNewPrice()");
      System.out.print("Enter TC (1 or 2): ");
      int tc = sc.nextInt();
      sc.nextLine();
      System.out.println("OUTPUT:");
      switch(tc) {
      case 1:
         Box a1 = new Box(xCode, xPrice);
         System.out.println(a1);
         Box a2 = new ColorBox(xCode, xPrice, xColor);
         System.out.println(a2);
         break;
      case 2:
         ColorBox b = new ColorBox(xCode, xPrice, xColor);
         double v = b.getNewPrice();
         System.out.printf("%.1f\n", v);
      }

      System.out.println();
   }
}