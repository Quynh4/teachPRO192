   import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println();
      System.out.print("Enter place: ");
      String xPlace = sc.nextLine();
      System.out.print("Enter price: ");
      int xPrice = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter color: ");
      int xColor = sc.nextInt();
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
         Brick a11 = new Brick(xPlace, xPrice);
         System.out.println(a11);
         Brick a12 = new SpecBrick(xPlace, xPrice, xColor);
         System.out.println(a12);
         break;
      case 2:
         SpecBrick b2 = new SpecBrick(xPlace, xPrice, xColor);
         b2.setData();
         String v2 = b2.getPlace();
         int k2 = b2.getPrice();
         System.out.printf("%s, %d\n", v2, k2);
         break;
      case 3:
         SpecBrick b3 = new SpecBrick(xPlace, xPrice, xColor);
         int v3 = b3.getValue();
         System.out.printf("%d\n", v3);
      }

      System.out.println();
   }
}
    