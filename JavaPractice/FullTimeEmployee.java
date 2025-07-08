
public class FullTimeEmployee extends Employee implements SalaryCalculable {
    double monthlySalary;
    FullTimeEmployee(String name,String employeeid,String email,double monthlySalary)
    {
        super(name,employeeid,email);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalary()
    {
        return monthlySalary;
    }
    
}
