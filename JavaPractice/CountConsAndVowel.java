/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class CountConsAndVowel {

   public static String countVowelAndCons(String str){
       int cons=0,vowel=0;
       for(int i=0;i<str.length();i++){
           if((str.charAt(i)=='a' || str.charAt(i)=='e') || 
          (str.charAt(i)=='i'|| str.charAt(i)=='o')|| (str.charAt(i)=='u'|| str.charAt(i)=='A' )|| (str.charAt(i)=='E' || str.charAt(i)=='I')||( str.charAt(i)=='O'|| str.charAt(i)=='U')){
               vowel++;
           }
           else
           {
               cons++;
           }
       }
       return "Vowels : "+vowel+"\nConsonant: "+cons;
   }
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);
     System.out.println("Enter a String ");
     String str=sc.nextLine();
     System.err.println(countVowelAndCons(str));
     sc.close();
    }
    
}
