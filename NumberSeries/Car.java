
public class Car extends Vehicle {
    int numbersOfDoors;
    Car(String vehicleID,String brand,String fuelType,int numbersOfDoors )
    {
        super(vehicleID,brand,fuelType);
        this.numbersOfDoors=numbersOfDoors;
    }
    @Override
    void displayDetails()
    {
      super. displayDetails();
        System.out.println("Numbers  of Doors "+numbersOfDoors);
    }
    @Override
    float calculateMileage()
    {
        switch(fuelType.toLowerCase())
        {
            case "petrol":
                return 18;
            case "disele":
                return 20;
            case "electric":
                return 50;
            default :
                return super.calculateMileage();
        }
    }
    
}
