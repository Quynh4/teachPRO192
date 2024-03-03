import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] var0) {
      MyPC var1 = new MyPC();
      func var2 = new func();
      ArrayList var3 = new ArrayList();
      var3.add(new PC("Dell", 5.0D, 15000.0D));
      var3.add(new PC("Mac", 5.0D, 15000.0D));
      var3.add(new PC("HP", 3.0D, 9000.0D));
      var3.add(new PC("Acer", 1.0D, 5000.0D));
      var3.add(new PC("Asus", 4.0D, 8000.0D));
      var3.add(new PC("Asus", 6.0D, 15000.0D));
      var3.add(new PC("HP", 3.0D, 8000.0D));
      var3.add(new PC("Acer", 2.0D, 10000.0D));
      var3.add(new PC("Dell", 4.0D, 12000.0D));
      var3.add(new PC("Dell", 2.0D, 11000.0D));
      var3.add(new PC("Dell", 3.0D, 15000.0D));
      String var4 = "Model";
      String var5 = "Rate";
      String var6 = "Pice";

      int var7;
      for(var7 = 0; var7 < var3.size(); ++var7) {
         var4 = var4 + "\t" + ((PC)var3.get(var7)).getModel();
         var5 = var5 + "\t" + ((PC)var3.get(var7)).getRate();
         var6 = var6 + "\t" + ((PC)var3.get(var7)).getPrice();
      }

      boolean var33 = false;
      String var8 = "";
      String var9 = "";
      double var10 = 0.0D;
      double var12 = 0.0D;
      char var14 = 0;
      Scanner var15 = new Scanner(System.in);
      if (var0.length > 0) {
         for(int var16 = 0; var16 < var0.length - 5; ++var16) {
            var8 = var8 + " " + var0[var16];
         }

         var8 = var8.trim();
         var7 = Integer.parseInt(var0[var0.length - 1]);
         var10 = Double.parseDouble(var0[var0.length - 2]);
         var12 = Double.parseDouble(var0[var0.length - 3]);
         var9 = var0[var0.length - 4];
         var14 = var0[var0.length - 5].charAt(0);
      } else {
         menu.menu();
         var7 = var15.nextInt();
         if (var7 > 12) {
            var15.nextLine();
            System.out.print("Enter a String: ");
            var8 = var15.nextLine().trim();
         }
      }

      System.out.println("INPUT:");
      if (var7 <= 12) {
         System.out.println("\n" + var4.trim() + "\n" + var5.trim() + "\n" + var6.trim());
      } else {
         System.out.println(var8);
      }

      String var17;
      String var34;
      var34 = "";
      var17 = "";
      int var31;
      label223:
      switch(var7) {
      case 1:
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter a model:");
            var9 = var15.nextLine();
         }

         var34 = "" + var1.count1(var3, var9);
         var17 = "" + var2.count1(var3, var9);
         break;
      case 2:
         if (var0.length == 0) {
            System.out.print("Enter a price:");
            var10 = var15.nextDouble();
         }

         var34 = "" + var1.count2(var3, var10);
         var17 = "" + var2.count2(var3, var10);
         break;
      case 3:
         if (var0.length == 0) {
            System.out.print("Enter a rate:");
            var12 = var15.nextDouble();
         }

         var34 = "" + var1.count3(var3, var12);
         var17 = "" + var2.count3(var3, var12);
         break;
      case 4:
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter a model:");
            var9 = var15.nextLine();
         }

         List var18 = var1.sublist(var3, var9);
         List var19 = var2.sublist(var3, var9);
         var4 = "Model";
         var5 = "Rate";
         var6 = "Pice";

         int var35;
         for(var35 = 0; var35 < var18.size(); ++var35) {
            var4 = var4 + "\t" + ((PC)var18.get(var35)).getModel();
            var5 = var5 + "\t" + ((PC)var18.get(var35)).getRate();
            var6 = var6 + "\t" + ((PC)var18.get(var35)).getPrice();
            var34 = var34 + ((PC)var18.get(var35)).toString();
         }

         var35 = 0;

         while(true) {
            if (var35 >= var19.size()) {
               break label223;
            }

            var17 = var17 + ((PC)var19.get(var35)).toString();
            ++var35;
         }
      case 5:
         PC var20 = var1.find1(var3);
         PC var21 = var2.find1(var3);
         var34 = var20.toString();
         var17 = var21.toString();
         break;
      case 6:
         PC var22 = var1.find2(var3);
         PC var23 = var2.find2(var3);
         var34 = var22.toString();
         var17 = var23.toString();
         break;
      case 7:
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter model: ");
            var9 = var15.nextLine();
         }

         List var24 = var1.find3(var3, var9);
         List var25 = var2.find3(var3, var9);
         var4 = "Model";
         var5 = "Rate";
         var6 = "Pice";

         int var36;
         for(var36 = 0; var36 < var24.size(); ++var36) {
            var4 = var4 + "\t" + ((PC)var24.get(var36)).getModel();
            var5 = var5 + "\t" + ((PC)var24.get(var36)).getRate();
            var6 = var6 + "\t" + ((PC)var24.get(var36)).getPrice();
            var34 = var34 + ((PC)var24.get(var36)).toString();
         }

         var36 = 0;

         while(true) {
            if (var36 >= var25.size()) {
               break label223;
            }

            var17 = var17 + ((PC)var25.get(var36)).toString();
            ++var36;
         }
      case 8:
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter model: ");
            var9 = var15.nextLine();
         }

         List var26 = var1.find4(var3, var9);
         List var27 = var2.find4(var3, var9);
         var4 = "Model";
         var5 = "Rate";
         var6 = "Pice";

         int var37;
         for(var37 = 0; var37 < var26.size(); ++var37) {
            var4 = var4 + "\t" + ((PC)var26.get(var37)).getModel();
            var5 = var5 + "\t" + ((PC)var26.get(var37)).getRate();
            var6 = var6 + "\t" + ((PC)var26.get(var37)).getPrice();
            var34 = var34 + ((PC)var26.get(var37)).toString();
         }

         var37 = 0;

         while(true) {
            if (var37 >= var27.size()) {
               break label223;
            }

            var17 = var17 + ((PC)var27.get(var37)).toString();
            ++var37;
         }
      case 9:
         ArrayList var28 = var3;
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter model: ");
            var9 = var15.nextLine();
         }

         var1.remove1(var3, var9);
         var2.remove1(var3, var9);
         var4 = "Model";
         var5 = "Rate";
         var6 = "Pice";

         int var38;
         for(var38 = 0; var38 < var3.size(); ++var38) {
            var4 = var4 + "\t" + ((PC)var3.get(var38)).getModel();
            var5 = var5 + "\t" + ((PC)var3.get(var38)).getRate();
            var6 = var6 + "\t" + ((PC)var3.get(var38)).getPrice();
            var34 = var34 + ((PC)var3.get(var38)).toString();
         }

         var38 = 0;

         while(true) {
            if (var38 >= var28.size()) {
               break label223;
            }

            var17 = var17 + ((PC)var28.get(var38)).toString();
            ++var38;
         }
      case 10:
         ArrayList var29 = var3;
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter model: ");
            var9 = var15.nextLine();
            System.out.print("Enter rate: ");
            var12 = var15.nextDouble();
         }

         var1.remove1(var3, var9, var12);
         var2.remove1(var3, var9, var12);
         var4 = "Model";
         var5 = "Rate";
         var6 = "Pice";

         int var39;
         for(var39 = 0; var39 < var3.size(); ++var39) {
            var4 = var4 + "\t" + ((PC)var3.get(var39)).getModel();
            var5 = var5 + "\t" + ((PC)var3.get(var39)).getRate();
            var6 = var6 + "\t" + ((PC)var3.get(var39)).getPrice();
            var34 = var34 + ((PC)var3.get(var39)).toString();
         }

         var39 = 0;

         while(true) {
            if (var39 >= var29.size()) {
               break label223;
            }

            var17 = var17 + ((PC)var29.get(var39)).toString();
            ++var39;
         }
      case 11:
         ArrayList var30 = var3;
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter model: ");
            var9 = var15.nextLine();
            System.out.print("Enter rate: ");
            var12 = var15.nextDouble();
            System.out.print("Enter price: ");
            var10 = var15.nextDouble();
         }

         var1.remove1(var3, var9, var12, var10);
         var2.remove1(var3, var9, var12, var10);
         var4 = "Model";
         var5 = "Rate";
         var6 = "Pice";

         for(var31 = 0; var31 < var3.size(); ++var31) {
            var4 = var4 + "\t" + ((PC)var3.get(var31)).getModel();
            var5 = var5 + "\t" + ((PC)var3.get(var31)).getRate();
            var6 = var6 + "\t" + ((PC)var3.get(var31)).getPrice();
            var34 = var34 + ((PC)var3.get(var31)).toString();
         }

         var31 = 0;

         while(true) {
            if (var31 >= var30.size()) {
               break label223;
            }

            var17 = var17 + ((PC)var30.get(var31)).toString();
            ++var31;
         }
      case 12:
         if (var0.length == 0) {
            var15.nextLine();
            System.out.print("Enter a model: ");
            var9 = var15.nextLine();
         }

         var34 = var1.average(var3, var9) + "";
         var17 = "" + var2.average(var3, var9);
         break;
      case 13:
         if (var0.length == 0) {
            System.out.print("Enter a character: ");
            var14 = var15.next().charAt(0);
         }

         var31 = var1.countChar(var8, var14);
         int var32 = var2.countChar(var8, var14);
         var34 = "" + var31;
         var17 = "" + var32;
         break;
      case 14:
         var34 = var1.normalization(var8);
         var17 = var2.normalization(var8);
         break;
      case 15:
         if (var0.length == 0) {
            System.out.print("Enter a character: ");
            var14 = var15.next().charAt(0);
         }

         var34 = var1.replace1(var8, var14);
         var17 = var2.replace1(var8, var14);
         break;
      case 16:
         if (var0.length == 0) {
            System.out.print("Enter a charater: ");
            var14 = var15.next().charAt(0);
         }

         var34 = var1.replace2(var8, var14);
         var17 = var2.replace2(var8, var14);
         break;
      case 17:
         if (var0.length == 0) {
            System.out.print("Enter a charater: ");
            var14 = var15.next().charAt(0);
         }

         var34 = var1.replace3(var8, var14);
         var17 = var2.replace3(var8, var14);
         break;
      case 18:
         if (var0.length == 0) {
            System.out.print("Enter a charater: ");
            var14 = var15.next().charAt(0);
         }

         var34 = var1.replace4(var8, var14);
         var17 = var2.replace4(var8, var14);
      case 19:
      }

      if (var7 != 4 && var7 != 7 && var7 != 8 && var7 != 9 && var7 != 10 && var7 != 11) {
         System.out.println("OUTPUT:\n" + var34);
      } else {
         System.out.println("\nOUTPUT:");
         System.out.println(var4 + "\n" + var5 + "\n" + var6);
      }

      if (var34.compareTo(var17) == 0) {
         System.out.println("Test case " + var7 + " IS OK");
      } else {
         System.out.println("Test case " + var7 + " IS NOT OK");
      }

   }
}
   