    import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println();
      System.out.print("Enter name: ");
      String xName = sc.nextLine();
      System.out.print("Enter price: ");
      double xPrice = sc.nextDouble();
      sc.nextLine();
      System.out.print("Enter series: ");
      int xSeries = sc.nextInt();
      sc.nextLine();
      System.out.println("1. Test toString()");
      System.out.println("2. Test getSalePrice()");
      System.out.print("Enter TC (1 or 2): ");
      int tc = sc.nextInt();
      sc.nextLine();
      System.out.println("OUTPUT:");
      switch(tc) {
      case 1:
         Car a1 = new Car(xName, xPrice);
         System.out.println(a1);
         Car a2 = new VNCar(xName, xPrice, xSeries);
         System.out.println(a2);
         break;
      case 2:
         VNCar b = new VNCar(xName, xPrice, xSeries);
         double v = b.getSalePrice();
         System.out.printf("%.1f\n", v);
      }

      System.out.println();
   }
}