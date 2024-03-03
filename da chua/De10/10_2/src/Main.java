import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main
{
  public static void main(String[] args)
    throws Exception
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter Tivi type: ");
    String type = in.readLine();
    System.out.print("Enter Tivi price: ");
    double price = Double.parseDouble(in.readLine());
    System.out.print("Enter Tivi serie: ");
    
    int serie = Integer.parseInt(in.readLine());
    System.out.printf("1. TC = 1 - test toString()\n2. TC = 2 - test getPrice()", new Object[0]);
    System.out.print("\nEnter TC: ");
    int tc = Integer.parseInt(in.readLine());
    System.out.println("OUTPUT:");
    switch (tc)
    {
    case 1: 
      Tivi m = new Tivi(type, price);
      System.out.println(m);
      m = new ColorTivi(type, serie, price);
      System.out.println(m);
      break;
    case 2: 
      ColorTivi b = new ColorTivi(type, serie, price);
      System.out.printf("%.2f\n", new Object[] { Double.valueOf(b.getPrice()) });
      break;
    }
  }
}