
public class IsSpecialno {

    
    public static void main(String[] args) {
     
        int num=59,i,temp,sum1=0;
    temp=num;
    sum1=temp/10;
    int sum2=temp%10;
    int res=(sum1+sum2)+(sum1*sum2);
    if(res==num)
        System.out.println(num +" is a special number");
    else
        System.out.println(num+" is not a special number");
        }
    
}
