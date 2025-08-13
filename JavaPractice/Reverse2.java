import java.util.Scanner;
public class Reverse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String ");
        String str= sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.print(sb);
        sc.close();
        
    }
    
}
