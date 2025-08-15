/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAJENDRA
 */
public class FirstNoRepeat {

    
    public static  String firstNonRepeatingNumber(String str)
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            if(str.charAt(i)!=' ')
            {
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j)&& i!=j)
                    {
                        count++;
                        break;
                    }
                }
                if(count==0){
                    result+=str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }
       public static void main(String[] args) {
   java.util.Scanner sc = new  java.util.Scanner(System.in);
   System.out.println("Enter String: ");
   String str=sc.nextLine();
   System.out.print("Answer is: "+firstNonRepeatingNumber(str));
   sc.close();
        // TODO code application logic here
    }
    
}
