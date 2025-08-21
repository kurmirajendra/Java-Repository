import java.util.Scanner;
public class FibonacciRecursive {
 public static int fibonacci(int n){
     if(n==0)
         return 0;
   else if(n==1)
         return 1;
   else 
       return fibonacci(n-1)+fibonacci(n-2);
 }
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of terms: ");
       int num = sc.nextInt();
       System.out.print("Fibonacci Series: ");
       for(int i=0;i<num;i++)
       {
           System.out.print(fibonacci(i)+" ");
       }
    }
    
}
