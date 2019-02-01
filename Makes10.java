import java.util.Scanner;
public class Makes10
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "First number: " );
      int num1 = input.nextInt();
      
      System.out.print( "Second number: " );
      int num2 = input.nextInt();
      
      
      if( num1 + num2 == 10 )
      {
         System.out.println( num1 + " + "+ num2 + " sums up to 10" );
      }
      else
      {
         System.out.println( num1 + " + "+ num2 + " does not sum up to 10" );
      }
      
      
      if( num1 == 10 || num2 == 10)
      {
         System.out.print( "One number is 10" );
      }
      if( num1 != 10 && num2 != 10 )
      {
         System.out.print( "Neither number is 10" );
      }
      
   }
}