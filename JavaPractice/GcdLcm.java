import java.util.Scanner;
public class GcdLcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int b= sc.nextInt();
        
        int n1=a;
        int n2=b;
        while(n2!=0)
        {
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        int gcd = n1;
        
        int lcm = (a*b)/gcd;
        System.out.println("GDC of "+a+ " and "+b+" is: "+gcd);
        System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
    }
    
}
