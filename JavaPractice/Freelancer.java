
public class Freelancer  extends Employee implements SalaryCalculable{
    double projectFee;
    
    Freelancer(String name,String employeeid,String email,double projectFee)
    {
        super(name,employeeid,email);
        this.projectFee=projectFee;
    }
    @Override
    public double calculateSalary()
    {
        return projectFee;
    }
    
}
