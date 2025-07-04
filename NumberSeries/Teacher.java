
public class Teacher extends SchoolMember {
    String subject;
    int yearsOfExperience;
    Teacher(String name,String id,int age,String subject,int yearsOfExperience)
    {
        super(name,id,age);
        this.subject=subject;
        this.yearsOfExperience=yearsOfExperience;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Subject "+subject);
        System.out.println("Experience of "+yearsOfExperience+" years .");
    }
    @Override
    String introduce()
    {
        return super.introduce()+"I teach "+subject+"with "+yearsOfExperience+"years of experience ";
    }
    @Override
    String getRole()
    {
        return "Teacher ";
    }
    public void gradeAssignment()
    {
        System.out.println(name+" is  grading assignment ");
    }
    
}
