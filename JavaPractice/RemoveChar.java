/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class RemoveChar {

  public static String removeChar(String str,char ch){
      String result="";
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)!=ch){
              result+=str.charAt(i);
          }
      }
      return result;
     }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Enter char to remove ");
        char ch = sc.next().charAt(0);
        System.out.println(removeChar(str,ch));
        sc.close();
    }
    
}
