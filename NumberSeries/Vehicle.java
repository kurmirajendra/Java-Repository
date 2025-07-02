
public class Vehicle {
    
    String vehicleID,brand,fuelType;
    
    Vehicle(String vehicleID,String brand,String fuelType)
    {
        this.vehicleID=vehicleID;
        this.brand=brand;
        this.fuelType=fuelType;
    }
    void displayDetails()
    {
        System.out.println("Vehicle ID "+vehicleID);
        System.out.println("Brand name "+brand);
        System.out.println("Fuel Type "+fuelType);
    }
    float calculateMileage()
    {
         return 15 ;
    }
    
}