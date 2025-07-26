
public class BankAbbreviation {

   
    public static void main(String[] args) {
        String str=" State Bank Of India ";
         char ch1=str.charAt(0);
         char ch2=str.charAt(str.indexOf("Bank"));
         char ch3=str.charAt(str.indexOf("India"));
         String abbr=""+ch1+ch2+ch3;
         System.out.println("Abbreviation "+abbr);
    }
    
}
