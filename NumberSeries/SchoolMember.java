
public class SchoolMember {
    String name ,id;
    int age;
    SchoolMember(String name,String id,int age)
    {
        this.name=name;
        this.id=id;
        this.age=age;
    }
    public void displayDetails()
    {
        System.out.println("Name "+name);
        System.out.println("ID "+id);
        System.out.println("Age "+age);
    }
    
    String introduce()
    {
        return "HI ,I am  "+name+".I am "+age+"years old ";
    }
    String getRole()
    {
          return "School Member ";
    }
   
}
