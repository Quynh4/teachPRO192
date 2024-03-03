/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.io.*;
import model.*;
import java.util.*;
/**
 *
 * @author thail
 */
public class CarList extends ArrayList<Car>{
    private BrandList brandList;

    public CarList() {
    }

    public CarList(BrandList brandList) {
        this.brandList = brandList;
    }

   public boolean loadFromFile(String filename) {
        String carId, brandId, color, frameId, engineId;
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return false;
        } 
        else {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("[,]");
                    carId = parts[0].trim();
                    brandId = parts[1].trim();
                    color = parts[2].trim();
                    frameId = parts[3].trim();
                    engineId = parts[4].trim();
                    int pos = brandList.searchID(brandId);
                    if(pos == -1)
                        throw new IOException();
                    Brand b = brandList.get(pos);
                    this.add(new Car(carId,b,color,frameId,engineId));
                    
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return false;
            }
            return true;
        }
    }
  
    
    public Boolean saveToFile(String fileName)
    {
        File file = new File(fileName);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for(Car car : this)
            {
                writer.write(car.toString());
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
    public int searchId(String carId)
    {
        int n = this.size();
        for(int i=0;i<n;i++)
        {
            if(this.get(i).getCarId().equals(carId))
                return i;
        }
        return -1;
    }
    public int searchFrame(String fId)
    {
        int n = this.size();
        for(int i=0;i<n;i++)
        {
            if(this.get(i).getFrameId().equals(fId))
                return i;
        }
        return -1;
    }
    public int searchEngine(String eId)
    {
        int n = this.size();
        for(int i=0;i<n;i++)
        {
            if(this.get(i).getEngineId().equals(eId))
                return i;
        }
        return -1;
    }
    public Brand inputBrand()
    {
        Menu menu = new Menu();
        System.out.println("input brand: ");
        Brand brand = (Brand)menu.ref_getChoice((ArrayList)brandList);
        return brand;
    }
    public String inputColor()
    {
        String color;
        Scanner sc = new Scanner(System.in);
        System.out.println("input color: ");
        while(true)
        {
            color = sc.nextLine();
            if(color.isEmpty())
                {
                    System.out.println("color can't be blank, please re-input");
                    continue;
                }
            break;
        }
        return color;
    }
    public String inputCarId()
    {
        Scanner sc = new Scanner(System.in);
        String carId;
        System.out.println("input car ID: ");
        while(true)
        {
            try {
                carId = sc.nextLine();
                for(Car car : this)
                {
                    if(car.getCarId().equals(carId))
                    {
                        throw new IllegalArgumentException();
                    
                    }
                }
            }
            catch(Exception e){
                System.out.println("car ID already exists, please re-input");
                continue;
            }
            break;
        }
        return carId;
    }
    public String inputFrameId()
    {
        String frameId;
        Scanner sc = new Scanner(System.in);
        System.out.println("input frame ID");
        outer:
        while(true)
        {   
            frameId = sc.nextLine();
            
            for(Car car : this)
            {
                if(car.getFrameId().equals(frameId))
                {
                    System.out.println("frame ID already exists, please re-input");
                    continue outer;
                }
            }
            if(!frameId.matches("^F[0-9]{5}"))
            {
                System.out.println("frame ID must be in the F00000 format, please re-input");
                continue;
            }
            break;
        }
        return frameId;
    }
    public String inputEngineId()
    {
        String engineId;
        Scanner sc = new Scanner(System.in);
        System.out.println("input engine ID:");
        outer:
        while(true)
        {
            engineId = sc.nextLine();
            for(Car car : this)
            {
                if(car.getEngineId().equals(engineId))
                {
                    System.out.println("engine ID already exists, please re-input");
                    continue outer;
                }
            }
            if(!engineId.matches("^E[0-9]{5}"))
            {
                System.out.println("engine ID must be in the E00000 format, please re-input");
                continue;
            }
            break;
        }
        return engineId;
    }
    public void addCar()
    {
        Scanner sc = new Scanner(System.in);
        String carId, color, frameId, engineId;
        Brand brand;
        
        carId = this.inputCarId();
        brand = this.inputBrand();
        color = this.inputColor();
        frameId = this.inputFrameId();
        engineId = this.inputEngineId();
        this.add(new Car(carId,brand,color,frameId,engineId));
        System.out.println("car added successfully");
    }
    public void printBasedBrandName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("a part of brand name: ");
        String aPartOfBrandName = sc.nextLine();
        int n = this.size();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            Car c = this.get(i);
            if(c.getBrand().getBrandName().contains(aPartOfBrandName))
            {
                System.out.println(c.screenString());
                count++;
            }
        }
        if(count==0)
            System.out.println("No car is detected");
    }
    public boolean removeCar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input car ID: ");
        String carId = sc.nextLine();
        int pos = searchId(carId);
        if(pos<0)
        {
            System.out.println("Not found!");
            return false;
        }
        else
        {
            this.remove(pos);
        }
        return true;
    }
    public boolean updateCar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input car ID: ");
        String updateId = sc.nextLine();
        int pos = searchId(updateId);
        if(pos<0)
        {
            System.out.println("Not found!");
            return false;
        }
        else
        {
            String color, frameId, engineId;
            Brand brand;
            brand = this.inputBrand();
            color = this.inputColor();
            frameId = this.inputFrameId();
            engineId = this.inputEngineId();
            this.get(pos).setBrand(brand);
            this.get(pos).setColor(color);
            this.get(pos).setFrameId(frameId);
            this.get(pos).setEngineId(engineId);
        }
        return true;
    }
    public void listCars()
    {
        Collections.sort(this);
        int n = this.size();
        for(int i=0;i<n;i++)
        {
            Car car = this.get(i);
            System.out.println(car.screenString());
        }
    }
    
}
