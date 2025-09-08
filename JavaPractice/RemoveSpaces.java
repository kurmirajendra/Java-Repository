public class RemoveSpaces {
      
    public static String getRemoveSpace(String str)
    {
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            temp+=ch;
        }
        return temp;
    }
    public static void main(String[] args) {
       String str;
       System.out.println("Enter a String: ");
       java.util.Scanner sc  = new java.util.Scanner(System.in);
       str=sc.nextLine();
       System.out.println("String with spaces: "+str);
       System.out.println("String without spaces: "+getRemoveSpace(str));
    }
    
}
