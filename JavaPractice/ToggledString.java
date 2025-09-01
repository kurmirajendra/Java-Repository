public class ToggledString {

    public static void main(String[] args) {
      String s = "@TeSt#103";
      StringBuilder answer = new StringBuilder();
      for( int i=0;i<s.length();i++)
      {
          char ch = s.charAt(i);
          if(ch>='A' && ch<='Z')
          {
              answer.append(Character.toLowerCase(ch));
          }else if(ch>='a' && ch<='z')
          {
              answer.append(Character.toUpperCase(ch));
          }else
          {
              answer.append(ch);
          }
      }
      System.out.println("Toggled String: "+answer);
    }
    
}
