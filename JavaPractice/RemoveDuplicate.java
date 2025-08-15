/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class RemoveDuplicate {

 public static String RemoveDuplicate(String str)
 {
     String result="";
     for(int i =0;i<str.length();i++)
     {
         int count=0;
         if(str.charAt(i)!=' '){
             for(int j=i+1;j<str.length();j++){
                 if(str.charAt(i)==str.charAt(j)&&(i!=j)){
                     count++;
                 }
             }
             if(count==0)
             {
                 result+=str.charAt(i);
             }
         }
     }
     return result;
 }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Answer is: "+RemoveDuplicate(str));
        sc.close();
    }
    
}
