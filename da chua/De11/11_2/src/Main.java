import java.util.*;
import java.io.*;
class Main
{    
   public static void f1(ArrayList<Integer> a){          
       for(int i=a.size()-1; i>=0; i--){
           if(isPrime(a.get(i))){
               a.set(i, a.get(i)+1);
               System.out.println(a.get(i));
               break;
           }
           
       }
   }
   public static boolean isPrime(int n){
        if (n < 2)  return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) return false;                     
        }
        return true;
    }
   public static void main(String args[]) throws Exception
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> a = new ArrayList<>();
       System.out.print("Enter number of item: ");
       int n = Integer.parseInt(in.readLine());
       for(int i = 0; i < n; i++){
           System.out.print("Number " + i + " (th): ");
           a.add(Integer.parseInt(in.readLine()));
       }       
       f1(a);
       System.out.println("OUTPUT:");
       for(int i = 0; i < n; i++){
           System.out.println(a.get(i));
       }
   }
 }
