import java.util.Scanner;
public class Sums
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      int sum = 0;
      int count = 0;
      
      int out = 0;
      do
      {
         count++;
         
         System.out.print( "Enter an int: " );
         int user = input.nextInt();
         
         if( user == sum )
         {
            out++;
         }             
         
         sum = sum + user; 
      }while( out < 1 );
      
      System.out.println();
      
      System.out.print( "You entered " + count + " ints" );
   }
}