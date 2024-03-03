import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("1.Test constructor and toString()");
      System.out.println("2.Test Setters and Getters");
      System.out.println("3.Test raiseSalary()");
      System.out.print("Enter TC (1,2 or 3):");
      int choice = sc.nextInt();
      int id;
      String lastName;
      String firstName;
      int salary;
      switch(choice) {
      case 1:
         System.out.print("Enter the Employee id:");
         id = sc.nextInt();
         System.out.print("Enter the Employee lastName:");
         sc.nextLine();
         lastName = sc.nextLine();
         System.out.print("Enter the Employee firstName:");
         firstName = sc.nextLine();
         System.out.print("Enter the Employee salary:");
         salary = sc.nextInt();
         Employee emp = new Employee(id, lastName, firstName, salary);
         System.out.println("OUTPUT:");
         System.out.println(emp.toString());
         break;
      case 2:
         Employee emp2 = new Employee();
         System.out.print("Enter the Employee id:");
         id = sc.nextInt();
         emp2.setID(id);
         System.out.print("Enter the Employee lastName:");
         sc.nextLine();
         lastName = sc.nextLine();
         emp2.setLastName(lastName);
         System.out.print("Enter the Employee firstName:");
         firstName = sc.nextLine();
         emp2.setFirstName(firstName);
         System.out.print("Enter the Employee salary:");
         salary = sc.nextInt();
         emp2.setSalary(salary);
         System.out.println("OUTPUT:");
         System.out.println("id is: " + emp2.getID());
         System.out.println("firstname is: " + emp2.getFirstName());
         System.out.println("lastname is: " + emp2.getLastName());
         System.out.println("salary is: " + emp2.getSalary());
         System.out.println("name is: " + emp2.getName());
         System.out.println("annual salary is: " + emp2.getAnnualSalary());
         break;
      case 3:
         Employee emp3 = new Employee();
         System.out.print("Enter the Employee id:");
         id = sc.nextInt();
         emp3.setID(id);
         System.out.print("Enter the Employee lastName:");
         sc.nextLine();
         lastName = sc.nextLine();
         emp3.setLastName(lastName);
         System.out.print("Enter the Employee firstName:");
         firstName = sc.nextLine();
         emp3.setFirstName(firstName);
         System.out.print("Enter the Employee salary:");
         salary = sc.nextInt();
         emp3.setSalary(salary);
         System.out.print("Enter the Employee raiseSalary percent:");
         int raiseSalary = sc.nextInt();
         emp3.raiseSalary(raiseSalary);
         System.out.println("OUTPUT:");
         System.out.println(emp3);
      }

   }
}