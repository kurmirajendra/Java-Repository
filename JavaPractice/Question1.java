
public class Question1 {

  
    public static void main(String[] args) {
      String str="25667+5035";
       int result=0;
       int p=-1;
       int pos=' ';
       for(int i=0;i<str.length();i++)
       {
           char ch =str.charAt(i);
           if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
           {
               pos=ch;
               p=i;
               break;
           }
       }
       String num1 =str.substring(0, p);
       String num2 =str.substring(p+1);
       
       int n1=Integer.parseInt(num1);
       int n2=Integer.parseInt(num2);
       
        if (pos=='+')
        {
             result=n1+n2;
        }
        else if  (pos=='-')
                result=n1-n2;
        else if(pos=='*')
            result=n1*n2;
        else if(pos=='/')
            result=n1/n2;
        else
        {
           System.out.println("Operator not found ");
        }
        System.out.println("Result = " + result);


    }
    
}
