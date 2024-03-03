
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("1. Test f1()");
    System.out.println("2. Test f2()");
    
    System.out.print("Enter TC (1 or 2): ");
    int tc = sc.nextInt();sc.nextLine();
    
    System.out.println("Enter a string: ");
    String st = sc.nextLine();
    
    IString t = new MyString();
    System.out.println("OUTPUT:");
    switch (tc)
    {
    case 1: 
      int k1 = t.f1(st);
      System.out.printf("%d\r\n", new Object[] { Integer.valueOf(k1) });
      
      break;
    case 2: 
      String v2 = t.f2(st);
      System.out.printf("%s\r\n", new Object[] { v2 });
      break;
    default: 
      return;
    }
    System.out.println();
  }
}