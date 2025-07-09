
public class New {

    
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee(" Thomas ","FT101","thomas@employee.com",50000);
        PartTimeEmployee pt = new PartTimeEmployee(" Alan ","PT202","alan@employee.com",300,40);
        Freelancer fl = new Freelancer(" Paul ","FL303","paul@freelancer.com",30000);
        
        ft.displayDetails();
        System.out.println("Calculated Salary : "+ft.calculateSalary());
        System.out.println("--------------------------------");
        
        pt.displayDetails();
        System.out.println("Calculated Salary : "+pt.calculateSalary());
        System.out.println("--------------------------------");
        
        fl.displayDetails();
        System.out.println("Calculated Salary : "+fl.calculateSalary());
        System.out.println("--------------------------------");
        
    }
    
}
