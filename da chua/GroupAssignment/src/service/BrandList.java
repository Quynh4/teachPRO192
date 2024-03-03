/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.io.*;
import java.util.*;
import model.Brand;

public class BrandList extends ArrayList<Brand>{

    public BrandList() {
    }
    
    public boolean loadFromFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return false;
        } 
        else {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\s+[,:]");
                    Brand brand = createBrandFromParts(parts);
                    this.add(brand);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                
                return false;
            }
            return true;
        }
    }
    private Brand createBrandFromParts(String[] parts) {
        if (parts.length < 4) {
            throw new IllegalArgumentException("Invalid data format for creating Brand.");
        }
        String id = parts[0].trim();
        String name = parts[1].trim();
        String soundBrand = parts[2].trim();
        double price = Double.parseDouble(parts[3].trim());
        return new Brand(id, name, soundBrand, price);
    }
    public Boolean saveToFile(String fileName)
    {
        File file = new File(fileName);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for(Brand brand : this)
            {
                writer.write(brand.toString());
                writer.newLine();
            }
            return true;
        }
        catch(IOException e)
        {
            System.out.println("Error writing file: " + e.getMessage());
            return false;
        }
        
    }
    public int searchID(String bID)
    {   
        int n = this.size();
        for(int i=0;i<n;i++)
        {
            
            if(this.get(i).getBrandId().equals(bID))
                return i;
        }
        return -1;
    }
    public Brand getUserChoice()
    {
        Menu menu = new Menu();
        return (Brand)menu.ref_getChoice((ArrayList)this);
    }
    public void addBrand()
    {
        String id, brandName, soundBrand;
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("input brand ID: ");
        while(true)
        {
            try {
                id = sc.nextLine();
                for(Brand brand : this)
                {
                    if(brand.getBrandId().equals(id))
                    {
                        throw new IllegalArgumentException();
                    }
                }
            }
            catch(Exception e){
                System.out.println("ID already exists, please re-input");
                continue;
            }
            break;
        }
        System.out.println("input brand name: ");
        while(true)
        {
            brandName = sc.nextLine();
            if(brandName.isEmpty())
                {
                    System.out.println("brand name can't be blank, please re-input");
                    continue;
                }
            break;
        }
        System.out.println("input sound brand: ");
        while(true)
        {
            soundBrand = sc.nextLine();
            if(soundBrand.isEmpty())
                {
                    System.out.println("sound brand can't be blank, please re-input");
                    continue;
                }
            break;
        }
        System.out.println("input price: ");
        while(true)
        {
            price = Double.parseDouble(sc.nextLine());
            if(price <= 0)
            {
                System.out.println("price must be more than 0, please re-input");
                continue;
            }
            break;
        }
        Brand brand = new Brand(id, brandName, soundBrand, price);
        this.add(brand);
      
    }
    public void updateBrand()
    {
        Scanner sc = new Scanner(System.in);
        String brandName, soundBrand;
        double price;
        System.out.println("input existing brand ID: ");
        String brandId = sc.nextLine();
        int pos = searchID(brandId);
        
        if(pos < 0 ) {
            System.out.println("Not found!");
        }
        else
        {
            System.out.println("input brand name: ");
            while(true)
            {
                
                brandName = sc.nextLine();
                if(brandName.isEmpty())
                    {
                        System.out.println("brand name can't be blank, please re-input");
                        continue;
                    }
                break;
            }
            System.out.println("input sound brand: ");
            while(true)
            {
                soundBrand = sc.nextLine();
                if(soundBrand.isEmpty())
                    {
                        System.out.println("sound brand can't be blank, please re-input");
                        continue;
                    }
                break;
            }
            System.out.println("input price: ");
            while(true)
            {
                price = Double.parseDouble(sc.nextLine());
                if(price <= 0)
                {
                    System.out.println("price must be more than 0, please re-input");
                    continue;
                }
                break;
            }
            this.get(pos).setBrandName(brandName);
            this.get(pos).setSoundBrand(soundBrand);
            this.get(pos).setPrice(price);
        }
    }
    public void listBrands()
    {
        int n = this.size();
        for(int i=0;i<n;i++)
        {
            System.out.println(this.get(i));
        }
    }
}