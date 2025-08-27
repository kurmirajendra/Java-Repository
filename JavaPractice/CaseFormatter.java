import java.util.Scanner;
public class CaseFormatter {

   static String upper(String str){
       StringBuilder s1= new StringBuilder();
       for(int i=0;i<str.length();i++){
           s1.append(Character.toLowerCase(str.charAt(i)));
       }
       String [] arr = s1.toString().split(" ");
       int len = arr.length;
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<=len-1;i++){
           sb.append(Character.toUpperCase(arr[i].charAt(0)));
          sb.append(arr[i].substring(1));
          if(i!=len-1)
              sb.append(' ');
       }
       str = sb.toString();
       return str;
   }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String str=sc.nextLine();
        System.out.println("---------------------------");
        str=upper(str);
        System.out.println("Converted : "+str);
        
    }
    
}
