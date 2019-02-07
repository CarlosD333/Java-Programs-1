import java.util.Scanner;
public class GuessingGame
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "Enter a number between 1 and 10: " );
      int guess = input.nextInt();
      
      int answer = (int)(Math.random() * 10 + 1 );
      
      if( guess == answer )
      {
         System.out.print( "You got it" );
      }
      else
      {
         System.out.print( "Try again" );
      }
      
      
   }
}