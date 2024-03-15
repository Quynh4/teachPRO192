    import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("1.Test countWords()");
      System.out.println("2.Test getLastWord()");
      System.out.print("Enter TC(1 or 2):");
      int tc = Integer.parseInt(sc.nextLine());
      IProcess mc = new MyClass();
      if (tc == 1) {
         System.out.print("Enter the string str1:");
         String str1 = sc.nextLine();
         System.out.print("Enter the string str2:");
         String str2 = sc.nextLine();
         System.out.println("OUTPUT:");
         System.out.println(mc.countWords(str1, str2));
      } else if (tc == 2) {
         System.out.print("Enter a string:");
         String name = sc.nextLine();
         System.out.println("OUTPUT:");
         System.out.println(mc.getLastWord(name));
      }

   }
}
    