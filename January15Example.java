import java.util.Scanner;
public class January15Example
{
   public static void main( String[] args )
   {
      Scanner kbd = new Scanner( System.in ); //Scanner object/variable
      int quantity;
      double price;
      String item;
      
      System.out.print( "Enter item: " );
      item = kbd.nextLine();
            
      System.out.print( "Enter quantity: " );
      quantity = kbd.nextInt();
      
      System.out.print( "Enter price: " );
      price = kbd.nextDouble();
      
      double totalPrice = price + quantity;
      
      System.out.println( "Total price " + totalPrice );   
   }
}