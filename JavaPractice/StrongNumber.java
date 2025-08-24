import java.util.Scanner;
public class StrongNumber {
 public static int isStrong(int num ){
     int sum=0;
     int product=1;
     while(num>0){
         int digits=num%10;
         sum+=digits;
         product*=digits;
         num/=10;
     }
     return sum+product;
 }
   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number: ");
      int number = sc.nextInt();
      int result = isStrong(number);
      if(result==number)
          System.out.println(number+" is a Strong Number ");
      else
          System.out.println(number+"is not a Strong Number ");
    }
    
}
