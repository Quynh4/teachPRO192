/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import java.util.*;
import java.io.*;
import service.*;
import model.*;

/**
 *
 * @author thail
 */
public class CarManager {
    public static void main(String[] args) {
        List<String> options = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        options.add("List all brands");
        options.add("Add a new brand");
        options.add("Search a brand based on its ID");
        options.add("Update a brand");
        options.add("Save brands to the file, named brands.txt");
        options.add("List all cars in ascending order of brand names");
        options.add("List cars based on a part of an input brand name");
        options.add("Add a car");
        options.add("Remove a car based on its ID");
        options.add("Update a car based on its ID");
        options.add("Save cars to file, named cars.txt");
        options.add("Exit");
        String inputBrands = "D:/PRO192/GroupAssignment/build/classes/textfiles/inputbrands.txt";
        String inputCars = "D:/PRO192/GroupAssignment/build/classes/textfiles/inputcars.txt";
        String outputBrands = "D:/PRO192/GroupAssignment/build/classes/textfiles/brands.txt";
        String outputCars = "D:/PRO192/GroupAssignment/build/classes/textfiles/cars.txt";
        
        Menu menu = new Menu();
        BrandList brandList = new BrandList();
        
        if(!brandList.loadFromFile(inputBrands))
        {
            System.out.println("Failed to load brands");
            return;
        }
        else
            System.out.println("brands loaded successfully");
        
        CarList carList = new CarList(brandList);
        
        if(!carList.loadFromFile(inputCars))
        {
            System.out.println("Failed to load cars");
            return;
        }
        else
            System.out.println("cars loaded successfully");
        
        int choice;
        do
        {
            System.out.println("Enter to continue<3");
            sc.nextLine();
            choice = menu.int_getChoice((ArrayList)options);
            switch(choice)
            {
                case 1: brandList.listBrands();
                    break;
                    
                case 2: brandList.addBrand();
                    break;
                    
                case 3: 
                    System.out.println("input brand ID: ");
                    String id = sc.nextLine();
                    int temp = brandList.searchID(id);
                    if(temp==-1)
                    {
                        System.out.println("Not found!");
                        break;
                    }
                    System.out.println(temp);
                    break;
                    
                case 4: brandList.updateBrand();
                    break;
                    
                case 5: 
                    if(brandList.saveToFile(outputBrands))
                    {
                        System.out.println("Brands saved successfully");
                    }
                    
                    break;
                    
                case 6: carList.listCars();
                    break;
                    
                case 7: carList.printBasedBrandName();
                    break;
                    
                case 8: carList.addCar();
                    break;
                    
                case 9: 
                    if(carList.removeCar())
                        System.out.println("Removed successfully");
                    
                    break;
                    
                case 10:
                    if(carList.updateCar())
                        System.out.println("Updated successfully");
                    
                    break;
                
                case 11:
                    if(carList.saveToFile(outputCars))
                        System.out.println("Cars saved successfully");
                    
                    break;
                    
                case 12:
                    return;
            }
            
        }
        while(choice>0 && choice<=options.size());
    }
    
}
