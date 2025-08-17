/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class CheckVowel {

   public static String containVowel(String str){
       for(int i=0;i<str.length();i++){
       if((str.charAt(i)=='a' || str.charAt(i)=='e') || 
          (str.charAt(i)=='i'|| str.charAt(i)=='o')|| (str.charAt(i)=='u'|| str.charAt(i)=='A' )|| (str.charAt(i)=='E' || str.charAt(i)=='I')||( str.charAt(i)=='O'|| str.charAt(i)=='U')){
           
           return "String Contains Vowels";
       }
   }
       return "String doesn't have vowels ";
   }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
     System.out.println("Enter a String ");
     String str=sc.nextLine();
     System.out.println(containVowel(str));
     sc.close();
    }
    
}
