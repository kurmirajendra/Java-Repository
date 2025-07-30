
public class Armstrongno {

   
    public static void main(String[] args) {
        int num=407,or,temp,digit,count=0,sum=0;
        or=num;
        temp=num;
    while(temp!=0){
        temp=temp/10;
        count++;
    }
    temp=num;
    while(temp!=0){
        digit=temp%10;

    int power=1;
    for(int i=1;i<=count;i++){
        power*=digit;
    }
      sum+=power;
      temp/=10;
    }
    if(sum==or)
        System.out.println(or+" is a Armstrong number ");
    else
        System.out.println(or+"  is not a ArmStrong number ");
        
    }
    
}
