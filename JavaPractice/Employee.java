
public class Employee {
    String name;
    String employeeid;
    String email;
    
    Employee(String name,String employeeid,String email)
    {
        this.name=name;
        this.employeeid=employeeid;
        this.email=email;
    }
    public void displayDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Employee ID : "+employeeid);
        System.out.println("Email : "+email);
    }
    
}
