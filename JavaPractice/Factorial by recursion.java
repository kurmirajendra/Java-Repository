public class FactorialUsingRecursion {
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        //Let's Start here
        int number; 
        java.util.Scanner s1=new java.util.Scanner(System.in);
        // input a number 
        System.out.print("Enter a nummber : ");
        number=s1.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
