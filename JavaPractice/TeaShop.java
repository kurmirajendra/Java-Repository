
public class TeaShop {
    public enum CoffeeSize
    {
        SMALL,MEDIUM,LARGE
    }
    

    public static void main(String[] args) {
       CoffeeSize size = CoffeeSize.LARGE;
       switch(size)
        {
           case SMALL:
               System.out.println("small coffee ");
               break;
           case MEDIUM:
               System.out.println("medium coffee ");
               break;
           case LARGE:
               System.out.println("large coffee");
               break;
        }
    }
    
}
