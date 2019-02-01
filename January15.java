import java.util.Scanner;
public class January15
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in ); //Scanner object/variable
      
      System.out.print( "Enter an int: " );
      int user1 = input.nextInt();
      
      System.out.print( "Enter another int: " );
      int user2 = input.nextInt();
      
      int result = user1 % user2;
      
      System.out.println( "user1 is still " + user1 + " which is unchanged" );
      System.out.println( "user2 is still " + user2 + " which is unchanged" );
            
      System.out.println( "Modding them gives " + result );

      String concatenationPhrase = "The number is ";
      System.out.println( concatenationPhrase + 7);



      
      // Variable Declarations
      int number = 8;
      double decimal = 4.5;
     
      
      final int NUMBER = 9;
      
      
      System.out.println( number );
      System.out.println( decimal );
      System.out.println( result );
   }
}