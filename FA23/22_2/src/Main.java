import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println();
      System.out.print("Enter name: ");
      String xName = sc.nextLine();
      System.out.print("Enter type: ");
      String xType = sc.nextLine();
      System.out.print("Enter load: ");
      int xLoad = sc.nextInt();
      sc.nextLine();
      System.out.println("1. Test toString()");
      System.out.println("2. Test setData()");
      System.out.println("3. Test getValue()");
      System.out.print("Enter TC (1,2,3): ");
      int tc = sc.nextInt();
      sc.nextLine();
      System.out.println("OUTPUT:");
      switch(tc) {
      case 1:
         Train a11 = new Train(xName, xType);
         System.out.println(a11);
         Train a12 = new SpecTrain(xName, xType, xLoad);
         System.out.println(a12);
         break;
      case 2:
         SpecTrain b2 = new SpecTrain(xName, xType, xLoad);
         b2.setData();
         String v2 = b2.getName();
         String k2 = b2.getType();
         System.out.printf("%s, %s\n", v2, k2);
         break;
      case 3:
         SpecTrain b3 = new SpecTrain(xName, xType, xLoad);
         int v3 = b3.getValue();
         System.out.printf("%d\n", v3);
      }

      System.out.println();
   }
}