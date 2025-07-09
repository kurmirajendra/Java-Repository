
public class PartTimeEmployee extends Employee implements SalaryCalculable {
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String name,String employeeid,String email,double hourlyRate,int hoursWorked)
    {
        super(name,employeeid,email);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calculateSalary()
    {
        return hourlyRate*hoursWorked;
    }
    
}
