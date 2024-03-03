/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemanagement;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        CourseList courseList = new CourseList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        boolean exit = false;

        do {
            try {
                System.out.println("COURSE MANAGEMENT SYSTEM");
                System.out.println("1. List all available courses");
                System.out.println("2. Search and display course information by course ID");
                System.out.println("3. Add a new course");
                System.out.println("4. Sort all courses by number of credits (ascending)");
                System.out.println("5. Update course information by course ID");
                System.out.println("0. Exit");
                System.out.print("Select your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        courseList.listAll();
                        break;
                    case 2:
                        courseList.search();
                        break;
                    case 3:
                        courseList.add();
                        break;
                    case 4:
                        courseList.sort();
                        break;
                    case 5:
                        courseList.update();
                        break;
                    case 0:
                        System.out.println("Exiting the program. Goodbye!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
                scanner.nextLine();
            }

            System.out.println();
        } while (!exit);

    }
}
