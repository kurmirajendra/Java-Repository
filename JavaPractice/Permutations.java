/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Permutations {

   
    public static void main(String[] args) {
       String str="2535";
       permute(str, "");
    }
    public static void permute(String str,String prefix){
        if(str.length()==0){
            System.out.println(prefix);
        }else
        {
            for(int i=0;i<str.length();i++){
            String rem =str.substring(0, i)+str.substring(i+1);
            permute(rem,prefix + str.charAt(i));
        }
        }
    }
    
}
