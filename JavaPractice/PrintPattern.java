
public class PrintPattern {

    public void Pattern(int n)
    {
        int rows=3;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=n;j++)
            {
               if((i==1 && j%4==1)||(i==2 && j%2==0)||(i==3 && j%4==3))
                {
                    System.out.print(j+" ");
                }else
                {
                  System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       PrintPattern p1= new PrintPattern();
       p1.Pattern(12);
       
       
    }
    
}
