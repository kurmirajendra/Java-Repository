/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class CheckSpecial {

   public  static String checkSpecial(String str){
       String ans="";
       for(int i=0;i<str.length();i++){
           if((str.charAt(i)>='0' && str.charAt(i)<='9') || 
                   (str.charAt(i)>='a' && str.charAt(i)<='z')||
                   (str.charAt(i)>='A' && str.charAt(i)<='Z')){
           ans+=str.charAt(i);
       }
       }
       return ans;
   }
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);
     System.out.println("Enter a String ");
     String str=sc.nextLine();
     System.out.println(checkSpecial(str));
     sc.close();
    }
    
}
