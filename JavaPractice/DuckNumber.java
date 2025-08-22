import java.util.Scanner;
public class DuckNumber {

    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number ");
       String number = sc.nextLine();
       if(number.charAt(0) == '0'){
           System.out.println(number+" is not a Duck number (starts with 0).");
       }
           else
           {
                    boolean hasZero = false;
                   for(int i=1;i<number.length();i++){
                      if(number.charAt(0)== '0' ){
                          hasZero=true;
                           break;
                      }
                   }
                     if (hasZero)
                System.out.println(number + " is a Duck number.");
            else
                System.out.println(number + " is NOT a Duck number.");
                   
            }
       
           sc.close();
       }
    }
    

