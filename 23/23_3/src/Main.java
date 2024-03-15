    import java.util.Iterator;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      ItemList list = new ItemList();
      Scanner sc = new Scanner(System.in);
      System.out.println("The items have been added:");
      list.addItem(new Item("coffee", 10));
      list.addItem(new Item("tea", 20));
      list.addItem(new Item("rice", 30));
      list.addItem(new Item("fish", 40));
      list.addItem(new Item("soda", 40));
      list.addItem(new Item("sugar", 50));
      list.addItem(new Item("cake", 60));
      Iterator var7 = list.iterator();

      while(var7.hasNext()) {
         Item item = (Item)var7.next();
         System.out.println(item);
      }

      System.out.println("Enter new item:");
      System.out.print("Enter name:");
      String name = sc.nextLine();
      System.out.print("Enter quantity:");
      int quantity = Integer.parseInt(sc.nextLine());
      Item item = new Item(name, quantity);
      list.add(item);
      System.out.println("1.Test printItemByQuantity()");
      System.out.println("2.Test getTotalQuantity()");
      System.out.print("Enter TC(1/2):");
      int tc = Integer.parseInt(sc.nextLine());
      if (tc == 1) {
         System.out.print("Enter quantity:");
         quantity = Integer.parseInt(sc.nextLine());
         System.out.println("OUTPUT:");
         list.printItemByQuantity(quantity);
      } else if (tc == 2) {
         System.out.println("OUTPUT:");
         System.out.println(list.getTotalQuantity());
      }

   }
}
    