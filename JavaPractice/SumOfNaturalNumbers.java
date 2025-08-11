
public class SumOfNaturalNumbers {
  
   static int sum(int n)
   {
       if(n==1)
       {
           return 1;
       }
       return n+sum(n-1);
   }
   
    public static void main(String[] args) {
         int num;
         java.util.Scanner sc = new java.util.Scanner(System.in);
         System.out.println("Enter a number ");
         num=sc.nextInt();
         System.out.println("Sum of first "+num+" natural numbers is "+sum(num)); 
}
}

