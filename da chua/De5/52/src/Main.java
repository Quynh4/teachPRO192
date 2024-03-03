import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main
{
  public static void main(String[] args)
    throws Exception
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter brand name of a motor: ");
    String name = in.readLine();
    System.out.print("Enter series of a motor: ");
    String series = in.readLine();
    System.out.print("Enter price of a motor: ");
    double price = Double.parseDouble(in.readLine());
    System.out.printf("1. TC = 1 - test toString function\n2. TC = 2 - test getSalePrice function\n3. TC = 3 - test getBrandName function\n", new Object[0]);
    
    System.out.print("Enter TC: ");
    int tc = Integer.parseInt(in.readLine());
    System.out.println("OUTPUT:");
    if (tc == 1)
    {
      Motor m = new Motor(name, price);
      System.out.println(m);
      m = new VNMotor(name, series, price);
      System.out.println(m);
    }
    else if (tc == 2)
    {
      VNMotor b = new VNMotor(name, series, price);
      System.out.println(b.getSalePrice());
    }
    else if (tc == 3)
    {
      Motor m = new Motor(name, price);
      System.out.println(m.getBrandName());
    }
  }
}