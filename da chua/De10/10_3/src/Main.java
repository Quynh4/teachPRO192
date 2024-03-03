/* Decompiler 44ms, total 1396ms, lines 69 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
   public static void OutputList(List<Fan> c) {
      Iterator var1 = c.iterator();

      while(var1.hasNext()) {
         Fan x = (Fan)var1.next();
         System.out.printf("%-15s%-10.2f\n", x.getCode(), x.getPrice());
      }

   }

   public static void main(String[] args) throws Exception {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      List<Fan> a = new ArrayList();
      System.out.print("Add more how many Fan: ");
      int n = Integer.parseInt(in.readLine());

      int c;
      double givenPrice;
      for(c = 0; c < n; ++c) {
         System.out.println("");
         System.out.print("Fan code: ");
         String code = in.readLine();
         System.out.print("Fan price: ");
         givenPrice = Double.parseDouble(in.readLine());
         a.add(new Fan(code, givenPrice));
      }
      a.add(0, new Fan("FS21", 70.0D));
      a.add(1, new Fan("KS20", 68.0D));
      a.add(2, new Fan("FF12", 52.0D));
      
      System.out.println("");
      System.out.print("Enter test function (1-f1;2-f2;3-f3): ");
      c = Integer.parseInt(in.readLine());
      IFan i = new MyFan();
      givenPrice = 0.0D;
      String givenCode = "";
      if (c == 1) {
         System.out.print("Enter given Fan code: ");
         givenCode = in.readLine();
      } else if (c == 2 || c == 3) {
         System.out.print("Enter given Fan price: ");
         givenPrice = Double.parseDouble(in.readLine());
      }

      System.out.println("");
      System.out.println("OUTPUT:");
      switch(c) {
      case 1:
         i.f1(a, givenCode);
         OutputList(a);
         break;
      case 2:
         System.out.println(i.f2(a, givenPrice));
         break;
      case 3:
         i.f3(a, givenPrice);
         OutputList(a);
      }
   }
}