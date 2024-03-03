/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;
        do {
            try {
                System.out.println("-------- Orders Management System --------");
                System.out.println("1. Add a new product to the Store");
                System.out.println("2. Update price for a particular product");
                System.out.println("3. List all available products in the Store");
                System.out.println("4. Create a new Order");
                System.out.println("5. Print information of an Order by Order ID");
                System.out.println("6. Sort all products by product price as ascending");
                System.out.println("7. Print information of all Orders by a specific customer ID");
                System.out.println("8. Export information of a specific Order ID to text file");
                System.out.println("9. Exit");
                System.out.println("10. List all available products in the Store");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        store.addProduct();
                        break;
                    case 2:
                        store.updateProductPrice();
                        break;
                    case 3:
                        store.getAllProducts();
                        break;
                    case 4:
                        store.createOrder();
                        break;
                    case 5:
                        store.getOrderById();
                        break;
                    case 6:
                        store.sortProductsByPriceAscending();
                        break;
                    case 7:
                        store.getOrdersByCustomerId();
                        break;
                    case 8:
                        store.exportOrderToFile();
                        break;
                    case 9:
                        System.out.println("Exiting...");
                        exit = true;
                        break;
                    case 10:
                        store.getAllOrders();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        } while (!exit);

        scanner.close();
    }

}
