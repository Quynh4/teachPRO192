
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập năm: ");
            int year = sc.nextInt();
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("nam nhuan");
            } else {
                System.out.println("nam binh thuong");
            }
        }
    }

}
