
public class NewMain {

    
    public static void main(String[] args) {
        
        Car c1 = new Car ("C101","Ford","Disele",4);
        Truck t1 =new Truck("D102","TaTa","Disele",45);
        
        c1.displayDetails();
        System.out.println("Mileage:  "+c1.calculateMileage()+"Km/l\n");
        t1.displayDetails();
        System.out.println("Mileage: "+t1.calculateMileage()+"Km/l\n");
      
    }
    
}
