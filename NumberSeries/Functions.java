
public class Functions {

    public static void main(String[] args) {
        String str="Lets Learn java ";
        int len = str.length();
        System.out.println("Length "+len);
        System.out.println("Hello".length());
        
        char ch;
        ch=str.charAt(3);
        System.out.println(ch);
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            System.out.println(ch);
        }
        int pos=str.indexOf('a');
        System.out.println("Position of a is "+pos);
        pos=str.indexOf('a',8);
        System.out.println("Position of a is "+pos);
        pos=str.indexOf("Java",1);
        System.out.println("Position of a is "+pos);
        pos=str.indexOf('s',0,4);
        if(pos==-1)
        System.out.println("Not Found ");
        else
            System.out.println("Found at "+pos);
        String pass1="xits2001_05",pass2="Xits2001_05";
        boolean ans=pass1.equals(pass2);
        System.out.println(ans);
        String[]arr={"MP157794","MP158447","MP048472","Mp097847","Mp159584"};
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i].startsWith("MP15"))
                System.out.println(arr[i]+"does not belongs to Sagar RTO ");
        }
    }
    
    
}

