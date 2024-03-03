   import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Brick code: ");
      String code = in.readLine();
      System.out.print("Enter Brick price: ");
      double price = Double.valueOf(in.readLine());
      System.out.printf("1. TC = 1 - test getCode()\n2. TC = 2 - test setPrice()");
      System.out.print("\nEnter TC: ");
      int tc = Integer.parseInt(in.readLine());
      Brick t = new Brick(code, price);
      if (tc == 2) {
         System.out.print("Enter new Brick price: ");
         price = Double.valueOf(in.readLine());
         t.setPrice(price);
      }

      System.out.println("OUTPUT:");
      switch(tc) {
      case 1:
         System.out.println(t.getCode());
         break;
      case 2:
         System.out.printf("%.2f\n", t.getPrice());
      }

   }
}
   