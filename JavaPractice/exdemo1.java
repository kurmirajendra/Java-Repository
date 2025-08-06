
public class exdemo1 {

    
    public static void main(String[] args) {
        
      fun1();
      fun2();
      System.out.println("Back here ");
    }
    static void fun1()
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Zero Division Error ");
        }
        finally
        {
         System.out.println("End of function 1 ");
        }
    }
    static void fun2()
    {
        try
        {
            int [] arr={25,35,50};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index ");
        }
        finally
        {
            System.out.println("End of fun 2 ");
        }
    }
    
}
