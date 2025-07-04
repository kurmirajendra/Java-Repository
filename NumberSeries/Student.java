
public class Student extends SchoolMember {
    int gradeLevel;
    double gpa;
    Student(String name,String id,int age,int gradeLevel,double gpa)
    {
        super(name,id,age);
        this.gradeLevel=gradeLevel;
        this.gpa=gpa;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("I am in "+gradeLevel+" grade ");
        System.out.println(" GPA "+gpa);
    }
    @Override
    String introduce()
    {
        return super.introduce()+" I am in grade "+gradeLevel+"with GPA "+gpa;
    }
    @Override
    String getRole()
    {
        return " Student ";
    }
    public void study()
    {
        System.out.println(name+"very good in study ");
    }
    
}
