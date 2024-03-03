    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
   public static void OutputList(List<Brick> c) {
      Iterator var1 = c.iterator();

      while(var1.hasNext()) {
         Brick x = (Brick)var1.next();
         System.out.printf("%-15s%-10.2f\n", x.getCode(), x.getPrice());
      }

   }

   public static void main(String[] args) throws Exception {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      List<Brick> a = new ArrayList();
      System.out.print("Add more how many Brick: ");
      int n = Integer.parseInt(in.readLine());
      String code = "";
      double price = 0.0D;

      int c;
      for(c = 0; c < n; ++c) {
         System.out.println("");
         System.out.print("Brick code: ");
         code = in.readLine();
         System.out.print("Brick price: ");
         price = Double.valueOf(in.readLine());
         a.add(new Brick(code, price));
      }

      a.add(0, new Brick("FS21", 60.0D));
      a.add(1, new Brick("KS20", 68.0D));
      a.add(2, new Brick("FF12", 52.0D));
//      a.add(3, new Brick("AK12", 75.0D));
      
      System.out.println("");
      System.out.print("Enter test function (1-f1;2-f2;3-f3): ");
      c = Integer.parseInt(in.readLine());
      IBrick i = new MyBrick();
      double givenPrice = 0.0D;
      String givenCode = "";
      if (c != 1 && c == 2) {
         System.out.print("Enter given Brick price: ");
         givenPrice = Double.parseDouble(in.readLine());
      }

      System.out.println("");
      System.out.println("OUTPUT:");
      switch(c) {
      case 1:
         i.f1(a);
         OutputList(a);
         break;
      case 2:
         System.out.println(i.f2(a, givenPrice));
         break;
      case 3:
         i.f3(a);
         OutputList(a);
      }

   }
}