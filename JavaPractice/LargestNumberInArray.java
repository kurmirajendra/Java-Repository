
public class LargestNumberInArray {
    
     int largest(int[]arr){
         int big=arr[0];
         int size=arr.length;
         for(int i=1;i<size;i++){
             if(big<arr[i]){
                 big=arr[i];
             }
            
         }
          return big;
     }
   
    public static void main(String[] args) {
        int array[]= {2,5,6,11,18,17,25};
        LargestNumberInArray la = new LargestNumberInArray();
       int largest = la.largest(array);
        System.out.println("Largest number in array is: "+largest);
    }
    
}
