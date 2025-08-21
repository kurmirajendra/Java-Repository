import java.util.Scanner;
public class FactorialRecursive {
    
    public static long factorial(int n)
    {
        if(n == 0||n == 1)
            return 1;
        else
         return  n * factorial(n-1);
    }
    
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number: ");
      int num  = sc.nextInt();
      if(num<0){
             System.out.println("Factorial is not defined for negative numbers.");
      }
      else{
          long result= factorial(num);
          System.out.println("Factorial of "+num+" = "+result);
      }
          
                  
    }
    
}
