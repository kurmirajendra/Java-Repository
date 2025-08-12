
public class Demo1 {

   
     
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,7,8};
        int n=arr.length+1;
        int exp_Sum = n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        int missing_number = exp_Sum-sum;
        System.out.println("Missing number is "+missing_number);
        
    }
    
}
