/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class Swap {

    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter String: ");
        String str2= sc.nextLine();
        System.out.println("Before Swaping: srt1 = "+str1+ ",str2 = "+str2 );
        str1=str1+str2;
        str2=str1.substring(0, str1.length()- str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After Swaping: str1 = "+str1+", str2 = "+str2);
    }
    
}
