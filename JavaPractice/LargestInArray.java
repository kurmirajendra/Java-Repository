
public class LargestInArray {

    static int findLargest(int []arr)
    {
        int max=arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
      int []arr={15,25,3,35,42,50};
      System.out.println(findLargest(arr));
    }
    
}
