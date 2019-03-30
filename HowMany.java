import java.util.Scanner;
public class HowMany
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      int a = 25;
      int b = 17;
      
      howManyEnteredBeforeSeenBoth( a , b );
   }
   
   public static void howManyEnteredBeforeSeenBoth( int a , int b )
   {
      Scanner input = new Scanner( System.in );
      
      int out = 0;
      int sum = 0;
      int user;
      int user1;
      int user2 = 0;
      
      int count = 0;
      while( out < 1 )
      {
         System.out.print( "Enter an int: " );
         user = input.nextInt();
         ++count;
         
         while( user == a && out < 1 )
         {
            System.out.print( "Enter an Int: " );
            user2 = input.nextInt();
            ++count;
            
            
            if( user2 == b )
            {
               ++out;
            }
            
         } 
         while( user == b && out < 1 )
         {
            System.out.print( "Enter an int: " );
            user2 = input.nextInt();
            ++count;
            
            if( user2 == a )
            {
               ++out;
            }
            
         }
         
      }
      
      System.out.println();
      
      System.out.print( "You had to enter " + count + " ints before typing " + a + " and " + b );
   }
}