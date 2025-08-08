public class ArrayException {

    
    public static void main(String[] args) {
        int[]arr1={8,20,3,18,6};
        int[]arr2={2,4,0,6,0};
        
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println("Dividing "+arr1[i]+" by "+arr2[i]+": ");
            
            try
            {
                int result=arr1[i]/arr2[i];
                System.out.println("Result = "+result);
            }
            catch(ArithmeticException e){
                System.out.println("Error : Division by zero is not allowed.");
            }
        }
        
    }
    
}
