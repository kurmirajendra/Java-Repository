import java.util.Scanner;
public class MultipicationTable {
   
    
    public static void main(String[] args) {
         
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number: ");
       int number = sc.nextInt();
       System.out.println("Mutiplication Table for "+number+" : ");
       for( int i= 1;i<=10;i++){
           System.out.println(number+" x "+i+" = "+(number*i));
       }
    }
    
}
