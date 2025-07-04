public class Administrator extends SchoolMember {
    String department,officeNumber;
    Administrator(String name,String id ,int age,String departmrnt,String officeNumber)
    {
        super(name,id,age);
        this.department=department;
        this.officeNumber=officeNumber;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("My department is "+department);
        System.out.println("My Office  no is "+officeNumber);
    }
    @Override
    String introduce()
    {
        return super.introduce()+"I manage the "+department+"deparment .My office is in room "+officeNumber;
    }
    @Override
    String getRole()
    {
       return "Administrator";
    }
    public void manageSchedule()
    {
        System.out.println(name+"is managing the schedule .");
    }
    
}
