
public class ReverseNumber {

   
    public static void main(String[] args) {
        int no,rev=0,r,a;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter any number: ");
        no = sc.nextInt();
        while(no>0)
        {
            r=no%10;
            rev=rev*10+r;
            no=no/10;
        }
        System.out.println("Reverse: "+rev);
         sc.close();
    }
    
}
