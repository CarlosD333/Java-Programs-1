import java.util.Scanner;
public class January29
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print( "Enter an int: " );
      int number = input.nextInt();
      
      if( number % 2 == 0 )
      {
         System.out.println( "Number is even" );
      }
      // System.out.println( "Checking" );  <<< [Dangling else problem]
      else
      {
         System.out.println( "Number is odd" );
      }
      
      
   }
}