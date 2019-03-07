import java.util.Scanner;
public class Carlos4c
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.println( "Welcome to the multiplication game!" );
      
      System.out.println();
      
      int a = randomNumber();
      int b = randomNumber();
      int product = a * b;
      
      int count = 0;
      
      System.out.print( "What is " + a + " * " + b + "? " );
      int user = input.nextInt();
      
      if( user == product )
      {
         System.out.print( user + " is correct!" );
      }
      else if( user != product )
      {
         System.out.println( user + " is not correct. Please try again." );
      }
      
      while( user != product && count == 0 )
      {
         System.out.print( "What is " + a + " * " + b + "? " );
         int newUser = input.nextInt();
         
         if( newUser != product )
         {
            System.out.println( newUser + " is not correct. Please try again." );
         }
         else if( newUser == product )
         {
            System.out.print( newUser + " is correct!" );
            count++;
         }            
      }
     
   }
   public static int randomNumber()
   {
      int result = (int)( Math.random() * 10 ) + 1;
      return result;
   }
}