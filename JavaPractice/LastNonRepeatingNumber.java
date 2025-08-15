
public class LastNonRepeatingNumber {

    public static String LastNonRepeat(String str)
    {
        String result="";
        for(int i=str.length()-1;i>0;i--)
        {
            int count=0;
            if(str.charAt(i)!=' ')
                    {
                        for(int j=0;j<str.length();j++){
                            if(str.charAt(i)==str.charAt(j)&& i!=j){
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
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Answer is: "+LastNonRepeat(str));
        sc.close();
    }
    
}
