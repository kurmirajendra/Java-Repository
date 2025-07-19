
public class Constructor {
    String name;
    int age;
    Constructor(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    Constructor(Constructor name,Constructor b)
    {
        this.name=name.name;
        this.age=b.age;
    }
    
    void getData()
    {   
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
    public static void main(String args[] )
    {
        Constructor c1=new Constructor("Veer",15);
        Constructor c2=new Constructor(c1,c1);
        
        c1.getData();
        c2.getData();
    }
}

