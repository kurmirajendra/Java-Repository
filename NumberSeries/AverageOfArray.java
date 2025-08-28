import java.util.Scanner;
public class AverageOfArray {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of elements in array: ");
       int n = sc.nextInt();
       
       int [] arr = new int[n];
       int sum = 0;
       System.out.println("Enter "+n+ " elements: ");
       for ( int i = 0;i<n;i++)
       {
           arr[i] = sc.nextInt();
           sum+=arr[i];
       }
       double average =  (double)sum/n;
       System.out.println("Sum of Array elements "+sum);
       System.out.println("Average of Array elements "+average);
       
    }
    
}
