
public class Truck extends Vehicle {
    float loadCapacity;
    Truck(String vehicleID,String brand,String fuelType,float loadCapacity)
    {
        super(vehicleID,brand,fuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("This truck can carry  "+loadCapacity+" tons of loads ");
    }
    @Override
    float calculateMileage()
    {
        switch(fuelType.toLowerCase())
        {
            case "disele":  
                return 8;
            default:
               return 5;
        }
    }
    
    
}
