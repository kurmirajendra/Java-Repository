
public class Mainjava1 {

    
    public static void main(String[] args) {
        
    try{
        int[]arr={25,35,50};
        System.out.println(arr[10]);
        
    }
     catch(ArrayIndexOutOfBoundsException ex)
    {
        System.out.println("Program Encountered an error : ");
        System.out.println("Error Message is -> "+ex);
    }
    }
    
}
