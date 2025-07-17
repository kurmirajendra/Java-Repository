public class Equation {

   
    public static void main(String[] args) {
        String equation="25+5";
        int pos =equation.indexOf('+');
        if(pos==-1)
        {
            pos=equation.indexOf('-');
            if(pos==-1)
            {
                pos=equation.indexOf('*');
                if(pos==-1)
                {
                    pos=equation.indexOf('/');
                }
            }
        }
        char op = equation.charAt(pos);
        String lhs=equation.substring(0, pos);
        String rhs=equation.substring(pos+1);
        
        
        int ans,l,r;
        l=Integer.parseInt(lhs);
        r=Integer.parseInt(rhs);
        if(op=='+')
            ans=l+r;
        else if(op=='-')
            ans=l-r;
        else if(op=='*')
            ans=r*l;
        else
            ans=l/r;
        System.out.println("Answer is "+ans);
    }
    
    
}
