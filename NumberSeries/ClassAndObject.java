class Student
            {
        String name;
        int age;
        void setStudent(String name,int age)
        {
           this. name=name;
            this.age=age;
        }
        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    }
public class ClassAndObject {

    
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setStudent("Vinod", 19);
        s1.display();
        Student s2 = new Student();
        s2.setStudent("Umesh", 20);
        s2.display();
       
        
    }
    
}
