/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class IsPaliindrome {
                      

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
             System.out.println("Enter number: ");
              int number = sc.nextInt();
              if(isPalindrome(number)){
                  System.out.println(number+" is a palindrome. " ) ;
              }else
              {
                  System.out.println(number+" is not a palindrome. ");
              }
             
    }
    public static boolean isPalindrome(int num){
        int or = num;
        int rev=0;
        while(num!=0){
            int digit= num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return or==rev;
    }
    
}
