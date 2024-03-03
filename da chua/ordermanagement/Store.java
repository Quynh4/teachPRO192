/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Store {

    Scanner scan = new Scanner(System.in);
    private List<Product> productList;
    private List<Order> orderList;

    public Store() {
        productList = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public void addProduct() {
        String name = inputString("Enter product name: ", "Invalid!");
        String id = generateProductID();
        double price = inputDouble("Enter price: ", "Invalid!");
        productList.add(new Product(name, id, price));
        System.out.println("Added successfully!");
    }

    public void updateProductPrice() {
        if (productList.isEmpty()) {
            System.out.println("Product list is empty!");
        } else {
            String updateId = inputString("Enter product ID to update: ", "Invalid");
            productList.forEach(x -> {
                if (x.getProductId().equals(updateId)) {
                    x.setPrice(inputDouble("Product price to update: ", "Invalid!"));
                    System.out.println("Updated successfully!");
                } else {
                    System.out.println("Product ID isn't found!");
                }
            });
        }
    }

    public void getAllProducts() {
        System.out.println("Product ID \tProduct Name \tProduct Price");
        productList.forEach(x -> {
            System.out.println(x.getProductId() + "\t\t" + x.getName() + "\t\t" + x.getPrice());
        });
    }

    public void createOrder() {
        if (productList.isEmpty()) {
            System.out.println("No products available!");
        } else {
            String orderID = generateOrderId();
            String date = inputString("Date: ", "Invalid!");
            String name = inputString("Enter customer name: ", "Invalid!");
            String address = inputString("Enter customer address: ", "Invalid");

            getAllProducts();
            ArrayList<Product> products = new ArrayList<>();
            boolean addMoreProducts = true;

            while (addMoreProducts) {
                String productId = inputString("Enter product ID: ", "Invalid");
                boolean foundProduct = false;

                for (Product product : productList) {
                    if (product.getProductId().equals(productId)) {
                        products.add(product);
                        foundProduct = true;
                        break;
                    }
                }

                if (!foundProduct) {
                    System.out.println("Product ID not found!");
                }

                String choice = inputString("Add more products (y/n): ", "Invalid!");

                while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
                    System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                    choice = inputString("Add more products (y/n): ", "Invalid!");
                }

                if (choice.equalsIgnoreCase("n")) {
                    addMoreProducts = false;
                }
            }

            String customerID = generateOrderId();
            orderList.add(new Order(orderID, date, name, address, products, customerID));
            System.out.println("Order created successfully!");
        }
    }

    public void getOrderById() {
        if (orderList.isEmpty()) {
            System.out.println("Order list is empty!");
        } else {
            String orderID = inputString("Enter order ID: ", "Invalid");
            orderList.forEach(x -> {
                if (x.getOrderId().equals(orderID)) {
                    System.out.println("Order ID \tDate \t\tCustomer ID \tName \t\tAddress");
                    System.out.println(x.getOrderId() + "\t\t" + x.getDate() + "\t" + x.getCustomerID() + "\t\t" + x.getName() + "\t" + x.getAddress() + "\t\t");
                    System.out.println("Product(s): ");
                    System.out.println("Product ID \tProduct Name \tProduct Price");
                    x.getProducts().forEach(y -> {
                        System.out.println(y.getProductId() + "\t\t" + y.getName() + "\t\t" + y.getPrice());
                    });
                } else {
                    System.out.println("Order ID isn't found!");
                }
            });
        }
    }

    public void sortProductsByPriceAscending() {
        List<Product> sortedProducts = new ArrayList<>(productList);
        Collections.sort(sortedProducts, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Product ID \tProduct Name \tProduct Price");
        sortedProducts.forEach(x->{
            System.out.println(x.getProductId() + "\t\t" + x.getName() + "\t\t" + x.getPrice());
        });
    }

    public void getOrdersByCustomerId() {
        if (orderList.isEmpty()) {
            System.out.println("Order list is empty!");
        } else {
            String customerID = inputString("Enter customer ID: ", "Invalid!");
            orderList.forEach(x -> {
                if (x.getCustomerID().equals(customerID)) {
                    System.out.println("Order ID \tDate \t\tCustomer ID \tName \t\tAddress");
                    System.out.println(x.getOrderId() + "\t\t" + x.getDate() + "\t" + x.getCustomerID() + "\t\t" + x.getName() + "\t" + x.getAddress() + "\t\t");
                    System.out.println("Product(s): ");
                    System.out.println("Product ID \tProduct Name \tProduct Price");
                    x.getProducts().forEach(y -> {
                        System.out.println(y.getProductId() + "\t\t" + y.getName() + "\t\t" + y.getPrice());
                    });
                }
            });
        }
    }

    public void exportOrderToFile() {
        if (orderList.isEmpty()) {
            System.out.println("Order list is empty!");
        } else {
            String orderID = inputString("Enter order ID: ", "Invalid!");
            String filePath = inputString("Enter file path: ", "Invalid!");
            boolean foundOrder = false;
            for (Order order : orderList) {
                if (order.getOrderId().equals(orderID)) {
                    try {
                        FileWriter writer = new FileWriter(filePath);
                        writer.write("Order ID: " + order.getOrderId() + "\n");
                        writer.write("Date Created: " + order.getDate() + "\n");
                        writer.write("Customer ID: " + order.getCustomerID() + "\n");
                        writer.write("Customer Name: " + order.getName() + "\n");
                        writer.write("Customer Address: " + order.getAddress() + "\n");
                        writer.write("Product List:\n");
                        for (Product product : order.getProducts()) {
                            writer.write("- " + product.getName() + " (ID: " + product.getProductId() + ", Price: " + product.getPrice() + ")\n");
                        }
                        writer.close();
                        System.out.println("Order exported successfully to file: " + filePath);
                        foundOrder = true;
                        break;
                    } catch (IOException e) {
                        System.out.println("Error exporting order to file: " + e.getMessage());
                    }
                }
            }
            if (!foundOrder) {
                System.out.println("Order ID not found!");
            }
        }
    }

    public void getAllOrders() {
        orderList.forEach(x -> {
            System.out.println("Order ID \tDate \t\tCustomer ID \tName \t\tAddress");
            System.out.println(x.getOrderId() + "\t\t" + x.getDate() + "\t" + x.getCustomerID() + "\t\t" + x.getName() + "\t" + x.getAddress() + "\t\t");
            System.out.println("Product(s): ");
            System.out.println("Product ID \tProduct Name \tProduct Price");
            x.getProducts().forEach(y -> {
                System.out.println(y.getProductId() + "\t\t" + y.getName() + "\t\t" + y.getPrice());
            });
        });
    }

    private String generateOrderId() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            stringBuilder.append(randomChar);
        }
        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(10);
            stringBuilder.append(randomNumber);
        }
        return stringBuilder.toString();
    }

    private String generateProductID() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(10);
            stringBuilder.append(randomNumber);
        }
        return stringBuilder.toString();
    }

    public double inputDouble(String message, String errorMessage) {
        double number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                number = scan.nextDouble();
                scan.nextLine();
                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number.");
                }
            } catch (Exception e) {
                System.out.println(errorMessage);
                scan.nextLine();
            }
        }

        return number;
    }

    public String inputString(String message, String errorMessage) {
        String str = "";

        while (true) {
            try {
                System.out.print(message);
                str = scan.nextLine();
                if (str.trim().isEmpty()) {
                    System.out.println("Invalid input.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(errorMessage);
                scan.nextLine();
            }
        }

        return str;
    }

}
