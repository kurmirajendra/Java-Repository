/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class NumberOfDigits {

   
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int no=0,a=0;
        System.out.println("Enter any number: ");
        no=sc.nextInt();
        if(no<0)
        {
            no=no * -1;
        }else if(no==0)
        {
            no=1;
        }
        while(no>0){
            no=no/10;
            a++; 
        }
        System.out.println("Number of digits in given number is "+a);
        
    }
    
}
