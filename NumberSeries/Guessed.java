public class Guessed {

    
    public static void main(String[] args) {
        
        int []numbers={2,3,5,6,7,9,1,8,4,1};
        System.out.println("Numbers in array ");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]+" ");
        }
        System.out.println("\n");
        
        int guessedIndex=-1;
        System.out.println("To access the number at index: "+guessedIndex);
        
        try
        {
            int guessedNumber=numbers[guessedIndex];
            System.out.println("Guessed number : "+guessedNumber);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: index "+guessedIndex+" is out of bounds Valid index are 0 to "+(numbers.length-1));
        }
        
    }
    
}
